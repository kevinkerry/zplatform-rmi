/* 
 * MemberAccountService.java  
 * 
 * version TODO
 *
 * 2016年8月16日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.test.member;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.zlebank.zplatform.acc.bean.enums.Usage;
import com.zlebank.zplatform.member.bean.MemberAccountBean;
import com.zlebank.zplatform.member.bean.MemberBean;
import com.zlebank.zplatform.member.bean.enums.MemberType;
import com.zlebank.zplatform.rmi.member.IMemberAccountService;
import com.zlebank.zplatform.rmi.test.BaseTest;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月16日 下午6:20:21
 * @since 
 */
public class MemberAccountServiceTest extends BaseTest {
    @Autowired
    private IMemberAccountService memberAccountService;
    @Test
    public void test(){
        try {
            MemberBean member=new MemberBean();
            member.setMemberId("200000000000626");
            MemberAccountBean result= memberAccountService.queryBalance(MemberType.INDIVIDUAL, member, Usage.BASICPAY);
            System.out.println(JSONObject.toJSONString(result));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    }
}
