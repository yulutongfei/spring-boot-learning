package com.sunxu.springboot.unit1;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author 孙许
 * @Date 2019/12/01 17:40
 * @Description
 */
public class ApplicationContextInitializerDemo implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("初始化spring的回调接口");
    }
}
