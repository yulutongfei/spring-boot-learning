package com.sunxu.springboot.unit1;

/**
 * @Author 孙许
 * @Date 2019/12/01 16:10
 * @Description
 */
public class Green {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hello(String name) {
        System.out.println("hello" + name);
    }
}
