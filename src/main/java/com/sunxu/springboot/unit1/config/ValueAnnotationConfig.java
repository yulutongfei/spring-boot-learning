//package com.sunxu.springboot.unit1.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//
///**
// * @Author 孙许
// * @Date 2019/12/05 23:14
// * @Description
// */
////@Configuration
//public class ValueAnnotationConfig {
//
//    @Bean
//    public User user(@Value("${id}") Long id, @Value("${name}") String name) {
//        User user = new User();
//        user.setId(id);
//        user.setName(name);
//        return user;
//    }
//
//    @Bean
//    public PropertySourcesPlaceholderConfigurer property() {
//        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
//        propertySourcesPlaceholderConfigurer.setFileEncoding("UTF-8");
//        propertySourcesPlaceholderConfigurer.setLocation(new PathMatchingResourcePatternResolver().getResource("classpath:application.properties"));
//        return propertySourcesPlaceholderConfigurer;
//    }
//}
