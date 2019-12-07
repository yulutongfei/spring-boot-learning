package com.sunxu.springboot;

import com.sunxu.springboot.unit1.ReplyUserQueryBO;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;

/**
 * @Author 孙许
 * @Date 2019/12/05 13:37
 * @Description
 */
public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/test.xml");
        ReplyUserQueryBO user = ctx.getBean("user", ReplyUserQueryBO.class);
        System.out.println(user.getGroupId());
    }
}
