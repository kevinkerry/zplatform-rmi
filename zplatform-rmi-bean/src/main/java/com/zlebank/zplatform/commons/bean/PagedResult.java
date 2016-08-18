/* 
 * A.java  
 * 
 * version TODO
 *
 * 2016年8月18日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.commons.bean;

import java.util.List;

import com.zlebank.zplatform.acc.bean.Bean;


/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月18日 上午11:27:48
 * @since 
 */
public interface PagedResult<T extends Bean> {     
    long getTotal();
    List<T> getPagedResult() throws  IllegalAccessException;
}
