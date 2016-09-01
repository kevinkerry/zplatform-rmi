/* 
 * BankInfoServiceProxyImpl.java  
 * 
 * version TODO
 *
 * 2016年8月31日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.commons.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.rmi.commons.BankInfoServiceProxy;
import com.zlebank.zplatform.rmi.commons.bean.BankInfoBean;
import com.zlebank.zplatform.trade.service.IProdCaseService;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月31日 下午12:10:38
 * @since 
 */
@Repository
public class BankInfoServiceProxyImpl extends HessianServlet implements BankInfoServiceProxy{

	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 35400313292230522L;
	
	@Autowired
	private IProdCaseService prodCaseService;

	/**
	 *
	 * @param bankName
	 * @return
	 */
	@Override
	@Transactional(readOnly=true)
	public List<BankInfoBean> queryBankInfo(String bankName) {
		StringBuffer queryString = new StringBuffer("SELECT ");
		queryString.append("a.bank_code, ");
		queryString.append("a.bank_city, ");
		queryString.append("a.bank_name, ");
		queryString.append("a.bank_sname, ");
		queryString.append("a.bank_address, ");
		queryString.append("a.status, ");
		queryString.append("a.main_bank_scode, ");
		queryString.append("a.main_bank_sname, ");
		queryString.append("a.bank_level, ");
		queryString.append("a.parent_node, ");
		queryString.append("a.notes, ");
		queryString.append("a.remarks ");
		queryString.append("FROM t_bank_info a ");
		queryString.append("WHERE bank_name LIKE fnc_addsign( ? , '%') ");
		queryString.append("AND a.status = ? ");
		queryString.append("AND (a.bank_level = ? OR a.bank_level = ?) ");
		queryString.append("AND ROWNUM <= ? ");
		queryString.append("ORDER BY a.bank_node ");
		Object[] paramaters = new Object[]{bankName,"1","2","3","10"};
		List<Map<String, Object>> resultList = (List<Map<String, Object>>) prodCaseService.queryBySQL(queryString.toString(), paramaters);
		return JSON.parseArray(JSON.toJSONString(resultList), BankInfoBean.class);
	}

}
