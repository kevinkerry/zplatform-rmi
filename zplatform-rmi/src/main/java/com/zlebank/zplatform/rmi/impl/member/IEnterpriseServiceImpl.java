/* 
 * IEnterpriseServiceImpl.java  
 * 
 * version TODO
 *
 * 2016年8月17日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.impl.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.member.bean.EnterpriseBankAccountBean;
import com.zlebank.zplatform.member.bean.EnterpriseBean;
import com.zlebank.zplatform.member.bean.EnterpriseRealNameBean;
import com.zlebank.zplatform.member.bean.EnterpriseRealNameConfirmBean;
import com.zlebank.zplatform.member.exception.InvalidMemberDataException;
import com.zlebank.zplatform.member.service.EnterpriseService;
import com.zlebank.zplatform.rmi.interfaces.member.IEnterpriseService;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月17日 上午10:58:53
 * @since 
 */
@Repository
public class IEnterpriseServiceImpl extends HessianServlet implements IEnterpriseService {
    @Autowired
    private EnterpriseService enterpriseService;
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 5666416215942453723L;

    /**
     *
     * @param memberId
     * @return
     */
    @Override
    public EnterpriseBean getEnterpriseByMemberId(String memberId) {
        return enterpriseService.getEnterpriseByMemberId(memberId);
    }

	/**
	 *
	 * @param enterpriseDeta
	 * @throws Exception
	 */
	@Override
	public void registerApply(EnterpriseBean enterpriseDeta) throws Exception {
		enterpriseService.registerApply(enterpriseDeta);
	}

	/**
	 *
	 * @param enterpriseRealNameConfirmBean
	 * @throws Exception 
	 */
	@Override
	public void realnameConfirm(
			EnterpriseRealNameConfirmBean enterpriseRealNameConfirmBean) throws Exception {
		// TODO Auto-generated method stub
		try {
			enterpriseService.realNameConfirm(enterpriseRealNameConfirmBean);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

	/**
	 *
	 * @param enterpriseRealNameBean
	 * @throws Exception
	 */
	@Override
	public void realNameApply(EnterpriseRealNameBean enterpriseRealNameBean) throws Exception {
		try {
			enterpriseService.realNameApply(enterpriseRealNameBean);
		} catch (InvalidMemberDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

	/**
	 *
	 * @param enterpriseBankAccountBean
	 * @throws Exception
	 */
	@Override
	public void bindingBankAccount(
			EnterpriseBankAccountBean enterpriseBankAccountBean)
					throws Exception {
		// TODO Auto-generated method stub
		try {
			enterpriseService.bindingBankAccount(enterpriseBankAccountBean);
		} catch (InvalidMemberDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
    
    

}
