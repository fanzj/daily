package com.daily.demo.basic.annotation.demo2;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author fanzhengjie
 * @create 2019/1/12 上午11:08
 * @description 自定义注解:通过注解进行校验
 */
@Documented
@Inherited
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Validate {

    int min() default 1;

    int max() default 10;

    boolean isNotNull() default true;

}
