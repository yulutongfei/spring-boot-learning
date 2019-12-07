package com.sunxu.springboot;

import com.sunxu.springboot.unit1.ApplicationContextInitializerDemo;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ImportResource(locations = {"classpath:META-INF/spring/spring-context.xml", "classpath:META-INF/spring/spring-context.xml"})
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringbootApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.addInitializers(new ApplicationContextInitializerDemo());
        application.run(args);
    }

}
