package com.zlebank.zplatform.rmi.member;

import java.util.List;

import com.zlebank.zplatform.hessian.core.Context;
import com.zlebank.zplatform.hessian.core.Hessian;
import com.zlebank.zplatform.member.pojo.ProductModel;

@Hessian(context = Context.API_V2, uri = "/remoting/rmiCoopInstiProductService")
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
			throws Exception;
}
