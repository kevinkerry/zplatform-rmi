/* 
 * MenchService.java  
 * 
 * version TODO
 *
 * 2015年9月11日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.interfaces.member;

import com.zlebank.zplatform.member.bean.EnterpriseBankAccountBean;
import com.zlebank.zplatform.member.bean.EnterpriseBean;
import com.zlebank.zplatform.member.bean.EnterpriseRealNameBean;
import com.zlebank.zplatform.member.bean.EnterpriseRealNameConfirmBean;

/**
 * 
 * 企业服务类
 *
 * @author Luxiaoshuai
 * @version
 * @date 2016年3月21日 下午2:06:21
 * @since
 */
public interface IEnterpriseService { 

    
    /**
     * 根据memberId得到企业信息
     * @param memberId
     * @return
     */
   public  EnterpriseBean  getEnterpriseByMemberId(String memberId); 
   
   /**
    * 企业注册申请
    * @param enterpriseDeta
    */
   public void registerApply(EnterpriseBean enterpriseDeta) throws Exception;
   
   /**
    * 企业实名认证申请
    * @param enterpriseRealNameBean
    * @throws Exception
    */
   public void realNameApply(EnterpriseRealNameBean enterpriseRealNameBean) throws Exception;
   /**
	 * 企业实名认证确认
	 * @param enterpriseRealNameConfirmBean
	 */
	public void realnameConfirm(EnterpriseRealNameConfirmBean enterpriseRealNameConfirmBean)throws Exception;
	
	/**
	 * 企业会员绑定银行账户
	 * @param enterpriseBankAccountBean
	 * @throws Exception
	 */
	public void bindingBankAccount(EnterpriseBankAccountBean enterpriseBankAccountBean)throws Exception;
}
