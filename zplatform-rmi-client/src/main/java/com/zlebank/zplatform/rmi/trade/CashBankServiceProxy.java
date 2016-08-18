/* 
 * CashBankServiceProxy.java  
 * 
 * version TODO
 *
 * 2016年8月18日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.trade;

import java.util.List;
import java.util.Map;

import com.zlebank.zplatform.hessian.core.Context;
import com.zlebank.zplatform.hessian.core.Hessian;
import com.zlebank.zplatform.trade.common.page.PageVo;
import com.zlebank.zplatform.trade.model.CashBankModel;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月18日 上午9:52:43
 * @since
 */
@Hessian(context = Context.API_V2, uri = "/remoting/cashBankServiceProxy")
public interface CashBankServiceProxy {

	public List<CashBankModel> findBankByCashCode(String cashCode);

	public List<CashBankModel> findBankByPaytype(String payType);

	public List<CashBankModel> findBankPage(int page, int pageSize);

	public long findBankCount();

	/***
	 * 查询卡信息
	 * 
	 * @param query
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public PageVo<CashBankModel> getCardList(Map<String, Object> query,
			Integer pageNo, Integer pageSize);
}
