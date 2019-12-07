package com.sunxu.springboot.unit1;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Author 孙许
 * @Date 2019/12/01 16:00
 * @Description
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({Red.class, ColorRegisterConfiguration.class, ColorImportSelector.class, ColorImportBeanDefinitionRegister.class})
public @interface EnableColor {
}
