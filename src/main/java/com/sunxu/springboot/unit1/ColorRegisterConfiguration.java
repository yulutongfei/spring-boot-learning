package com.sunxu.springboot.unit1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 孙许
 * @Date 2019/12/01 16:06
 * @Description
 */
@Configuration
public class ColorRegisterConfiguration {

    @Bean
    public Yellow yellow() {
        return new Yellow();
    }
}
