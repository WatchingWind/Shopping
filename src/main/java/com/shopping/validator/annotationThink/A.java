package com.shopping.validator.annotationThink;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface A {
    public int value() default 1;
}
