/* 
 * DefaultPageResult.java  
 * 
 * version TODO
 *
 * 2015-6-25 
 * 
 * Copyright (c) 2015,.All rights reserved.
 * 
 */
package com.zlebank.zplatform.commons.bean;

import java.util.List;

/**
 * Default paged query result.
 *
 * @author yangying
 * @version
 * @date 2015-6-25 下午04:41:13
 * @since
 */
public class DefaultPageResult<T> implements PagedResult<T> {

	private List<T> result;
	private long total;

	public DefaultPageResult(List<T> result, long total) {
		this.result = result;
		this.total = total;
	}

	/**
	 *
	 * @return
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 */ 
	@Override
	public List<T> getPagedResult() throws IllegalAccessException {
		return result;
	}

	/**
	 *
	 * @return
	 */
	@Override
	public long getTotal() {
		return total;
	}

}
