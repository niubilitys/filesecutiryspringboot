package com.niubility.filesecurity.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 添加该注解到方法中即可拦截方法
 *
 * @author huangliusong
 * @version 1.0.0
 * {@link Retention}
 * @since 2019/7/4
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FileSecurityAnnotation {

}
