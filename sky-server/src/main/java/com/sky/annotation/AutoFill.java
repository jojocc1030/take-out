package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解，用于标识某个方法需要进行功能字段自动填充处理
 */

@Target(ElementType.METHOD)
/**
 * @Retention(RetentionPolicy.RUNTIME)
 * 是一个 Java 注解，用于指定注解的保留策略。
 * 具体来说，@Retention 注解用于标记其他注解，并指定这些注解在运行时保留。
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
  //数据库操作类型 UPDATE INSERT
    OperationType value();
}
