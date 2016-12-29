package com.example.jessyuan.alldemo.Scoped;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by JessYuan on 28/12/2016.
 */

@Documented
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface BaiduMapScoped {
}