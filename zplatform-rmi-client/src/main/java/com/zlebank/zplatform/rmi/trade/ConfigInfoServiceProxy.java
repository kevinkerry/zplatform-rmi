/* 
 * ConfigInfoServiceProxy.java  
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

import com.zlebank.zplatform.hessian.core.Context;
import com.zlebank.zplatform.hessian.core.Hessian;
import com.zlebank.zplatform.trade.model.ConfigInfoModel;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月18日 上午10:16:28
 * @since 
 */
@Hessian(context=Context.API_V2,uri="/remoting/configInfoServiceProxy")
public interface ConfigInfoServiceProxy {

	/**
     * 根据参数名称得到配置信息
     * @param paraName
     * @return
     */
    public ConfigInfoModel getConfigByParaName(String paraName) ;
    /**
     * 根据参数名称得到配置信息列表
     * @param paraName
     * @return
     */
    public List<ConfigInfoModel> getConfigListByParaName(String paraName) ;
    
    /**
     * 得到指定序列
     * @param sequences
     * @return
     */
    public long getSequence(String sequences);
}
