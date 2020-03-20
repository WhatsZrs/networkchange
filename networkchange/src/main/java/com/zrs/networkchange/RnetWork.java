package com.zrs.networkchange;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;

/**
 * @author zhang
 * @date 2020/3/15 0015
 * @time 23:04
 * @describe TODO
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RnetWork {
    NetWorkState[] monitorFilter() default {NetWorkState.GPRS, NetWorkState.WIFI, NetWorkState.NONE};
}
