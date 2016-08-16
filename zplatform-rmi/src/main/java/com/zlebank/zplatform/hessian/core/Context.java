/* 
 * Context.java  
 * 
 * version TODO
 *
 * 2016年1月14日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.hessian.core;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年1月14日 下午2:25:49
 * @since 
 */
public enum Context {
    API_V2("api.v2.remote.url");
 
    private String remoteUrlConfigKey;
 
    private Context(String remoteUrlConfigKey) {
        this.remoteUrlConfigKey = remoteUrlConfigKey;
    }
 
    public String getRemoteUrl() {
        return System.getProperty(remoteUrlConfigKey, "http://127.0.0.1:8080/zplatform-rmi/remoting");
    }
}