package com.sunxu.springboot.unit1.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author 孙许
 * @Date 2019/12/05 21:20
 * @Description
 */
@ConfigurationProperties(prefix = "user")
public class User {

    private Long id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
