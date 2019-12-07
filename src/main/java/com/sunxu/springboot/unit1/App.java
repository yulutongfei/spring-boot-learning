package com.sunxu.springboot.unit1;

import com.sunxu.springboot.unit1.config.PropertiesConfiguration;
import com.sunxu.springboot.unit1.config.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.FileNotFoundException;

/**
 * @Author 孙许
 * @Date 2019/12/01 15:51
 * @Description
 */
public class App {
    public static void main(String[] args) throws FileNotFoundException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PropertiesConfiguration.class);
//        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
//        Stream.of(beanDefinitionNames).forEach(System.out::println);
        User user = ctx.getBean("user", User.class);
        System.out.println(user.getName());
        System.out.println(System.getProperty("user.name"));
    }
}
