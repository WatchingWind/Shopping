package com.shopping.validator;

import sun.reflect.annotation.AnnotationType;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;



@Target({ElementType.METHOD,ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RUNTIME)  //注解作用范围
@Constraint(validatedBy = {IsMobileValidator.class})  //与约束注解关联的验证器
public @interface IsMobile {

    boolean required() default true;

    String message() default "手机号码格式错误";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
