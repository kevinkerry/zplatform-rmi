/* 
 * Hessian.java  
 * 
 * version TODO
 *
 * 2016年1月14日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.hessian.core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年1月14日 下午2:25:08
 * @since 
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Hessian {
 
    String description() default "";
 
    boolean overloadEnabled() default false; // 是否支持方法重载
     
    String uri(); // 用于服务端bean名称，也是客户端访问链接的后半部分 配置。如: /talentService
 
    Context context(); // 客户端访问链接前半部分配置 如 http://localhost:8004/remote
}