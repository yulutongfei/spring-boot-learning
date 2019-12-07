package com.sunxu.springboot.unit1.config;

import com.sunxu.springboot.unit1.Green;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 孙许
 * @Date 2019/12/06 0:59
 * @Description
 */
@Configuration
@EnableConfigurationProperties(MtcJdbcProperties.class)
public class PropertiesConfiguration {

//    @Autowired
//    private User user;

    @Autowired
    private MtcJdbcProperties mtcJdbcProperties;

    @Bean
    public Green green() {
        Green green = new Green();
        green.setName(mtcJdbcProperties.getDriverClassName());
        return green;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(PropertiesConfiguration.class).web(WebApplicationType.NONE).run(args);

        User user = context.getBean(User.class);
        System.out.println(user.getName());
        context.close();

    }
}
