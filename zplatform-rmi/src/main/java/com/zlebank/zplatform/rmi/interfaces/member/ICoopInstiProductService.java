package com.zlebank.zplatform.rmi.interfaces.member;

import java.util.List;

import com.zlebank.zplatform.commons.dao.pojo.ProductModel;
import com.zlebank.zplatform.member.exception.AbstractCoopInstiException;


public interface ICoopInstiProductService {
	/**
	 * fetch products associate to this cooperative institution
	 * 
	 * @param coopInstiId
	 *            cooperative institution id
	 * @return a product list,if has no product,the return list will be a list
	 *         with zero element
	 * @throws AbstractCoopInstiException
	 *             if cooperative institution not exist
	 */
	public List<ProductModel> getProducts(long coopInstiId)
			throws AbstractCoopInstiException;
	
	public String getDefaultVerInfo(String instiCode, String busicode,int verType);
}
