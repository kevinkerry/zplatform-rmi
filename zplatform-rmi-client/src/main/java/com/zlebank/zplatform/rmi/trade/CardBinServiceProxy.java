/* 
 * CardBinService.java  
 * 
 * version TODO
 *
 * 2016年8月17日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.trade;

import com.zlebank.zplatform.commons.bean.CardBin;
import com.zlebank.zplatform.hessian.core.Context;
import com.zlebank.zplatform.hessian.core.Hessian;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月17日 下午2:16:01
 * @since
 */
@Hessian(context=Context.API_V2,uri="/remoting/cardBinServiceProxy")
public interface CardBinServiceProxy {

	/**
	 * 根据卡号得到卡bin信息
	 * 
	 * @param cardNo
	 * @return
	 */
	public CardBin getCard(String cardNo);
}
