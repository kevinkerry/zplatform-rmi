/* 
 * InsteadPayService.java  
 * 
 * version TODO
 *
 * 2015年11月25日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.trade.insteadpay;

import com.zlebank.zplatform.hessian.core.Context;
import com.zlebank.zplatform.hessian.core.Hessian;
import com.zlebank.zplatform.trade.bean.InsteadPayInterfaceParamBean;
import com.zlebank.zplatform.trade.bean.enums.InsteadPayImportTypeEnum;
import com.zlebank.zplatform.trade.insteadPay.message.InsteadPayQuery_Request;
import com.zlebank.zplatform.trade.insteadPay.message.InsteadPayQuery_Response;
import com.zlebank.zplatform.trade.insteadPay.message.InsteadPay_Request;

/**
 * 代付业务
 *
 * @author Luxiaoshuai
 * @version
 * @date 2015年11月25日 上午10:47:55
 * @since 
 */
@Hessian(context=Context.API_V2,uri="/remoting/insteadPayServiceProxy")
public interface InsteadPayServiceProxy {

    /**
     *  代付处理
     * @param request 
     * @return 错误代码，如果没有错误则返回NULL
     * @throws NotInsteadPayWorkTimeException 
     * @throws FailToGetAccountInfoException 
     * @throws BalanceNotEnoughException 
     * @throws DuplicateOrderIdException 
     * @throws InvalidCardException 
     * @throws FailToInsertAccEntryException 
     * @throws MerchWhiteListCheckFailException 
     * @throws RealNameCheckFailException 
     * @throws InconsistentMerchNoException 
     * @throws InvalidInsteadPayDataException 
     */
    public void insteadPay(InsteadPay_Request request, InsteadPayImportTypeEnum type,InsteadPayInterfaceParamBean param) throws Exception;
    /**
     * 代付状态查询处理
     * @param requestBean
     * @param responseBean 
     */
    public void insteadPayQuery(InsteadPayQuery_Request requestBean, InsteadPayQuery_Response responseBean);
    

    

}
