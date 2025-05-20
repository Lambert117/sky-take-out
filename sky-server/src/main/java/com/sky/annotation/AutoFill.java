package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author lam
 * @data 2025/5/20 下午10:51
 * @description 自定义注解：用于标识某个方法需要进行功能字段自动填充处理
 */

@Target(ElementType.METHOD)//只作用于方法上
@Retention(RetentionPolicy.RUNTIME) //@Retention注解定义了注解的生命周期，表示被该注解修饰的注解在运行时保留，即可以通过反射机制在运行时获取这些注解的信息
public @interface AutoFill {
    //指定 数据库操作类型：UPDATE INSERT
    OperationType value();
}
