/* 
 * InsteadPayServiceProxyImpl.java  
 * 
 * version TODO
 *
 * 2016年9月13日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.trade.insteadpay.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.rmi.trade.insteadpay.InsteadPayServiceProxy;
import com.zlebank.zplatform.trade.bean.InsteadPayInterfaceParamBean;
import com.zlebank.zplatform.trade.bean.enums.InsteadPayImportTypeEnum;
import com.zlebank.zplatform.trade.exception.BalanceNotEnoughException;
import com.zlebank.zplatform.trade.exception.DuplicateOrderIdException;
import com.zlebank.zplatform.trade.exception.FailToGetAccountInfoException;
import com.zlebank.zplatform.trade.exception.FailToInsertAccEntryException;
import com.zlebank.zplatform.trade.exception.FailToInsertFeeException;
import com.zlebank.zplatform.trade.exception.InconsistentMerchNoException;
import com.zlebank.zplatform.trade.exception.InvalidCardException;
import com.zlebank.zplatform.trade.exception.InvalidInsteadPayDataException;
import com.zlebank.zplatform.trade.exception.MerchWhiteListCheckFailException;
import com.zlebank.zplatform.trade.exception.NotInsteadPayWorkTimeException;
import com.zlebank.zplatform.trade.exception.RealNameCheckFailException;
import com.zlebank.zplatform.trade.insteadPay.message.InsteadPayQuery_Request;
import com.zlebank.zplatform.trade.insteadPay.message.InsteadPayQuery_Response;
import com.zlebank.zplatform.trade.insteadPay.message.InsteadPay_Request;
import com.zlebank.zplatform.trade.service.InsteadPayService;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年9月13日 上午11:34:41
 * @since 
 */
@Repository
public class InsteadPayServiceProxyImpl extends HessianServlet implements InsteadPayServiceProxy{

	private static final Log log = LogFactory.getLog(InsteadPayServiceProxyImpl.class);
	@Autowired
	private InsteadPayService insteadPayService;
	/**
	 *
	 * @param request
	 * @param type
	 * @param param
	 * @throws NotInsteadPayWorkTimeException
	 * @throws FailToGetAccountInfoException
	 * @throws BalanceNotEnoughException
	 * @throws DuplicateOrderIdException
	 * @throws InvalidCardException
	 * @throws FailToInsertAccEntryException
	 * @throws MerchWhiteListCheckFailException
	 * @throws FailToInsertFeeException
	 * @throws RealNameCheckFailException
	 * @throws InconsistentMerchNoException
	 * @throws InvalidInsteadPayDataException
	 */
	@Override
	public void insteadPay(InsteadPay_Request request,
			InsteadPayImportTypeEnum type, InsteadPayInterfaceParamBean param)  throws Exception{
		// TODO Auto-generated method stub
		
			try {
				insteadPayService.insteadPay(request, type, param);
			} catch (NotInsteadPayWorkTimeException
					| FailToGetAccountInfoException | BalanceNotEnoughException
					| DuplicateOrderIdException | InvalidCardException
					| FailToInsertAccEntryException
					| MerchWhiteListCheckFailException
					| FailToInsertFeeException | RealNameCheckFailException
					| InconsistentMerchNoException
					| InvalidInsteadPayDataException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				log.error(e.getMessage());
				throw new Exception(e.getMessage());
			}
		
		
	}

	/**
	 *
	 * @param requestBean
	 * @param responseBean
	 */
	@Override
	public void insteadPayQuery(InsteadPayQuery_Request requestBean,
			InsteadPayQuery_Response responseBean) {
		// TODO Auto-generated method stub
		insteadPayService.insteadPayQuery(requestBean, responseBean);
	}

}
