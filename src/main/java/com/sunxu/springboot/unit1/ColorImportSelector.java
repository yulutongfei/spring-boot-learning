package com.sunxu.springboot.unit1;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author 孙许
 * @Date 2019/12/01 16:09
 * @Description
 */
public class ColorImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{Blue.class.getName(), Green.class.getName()};
    }
}
