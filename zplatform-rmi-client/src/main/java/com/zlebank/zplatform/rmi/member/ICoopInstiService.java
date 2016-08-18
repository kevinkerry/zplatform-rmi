package com.zlebank.zplatform.rmi.member;

import java.util.List;

import com.zlebank.zplatform.hessian.core.Context;
import com.zlebank.zplatform.hessian.core.Hessian;
import com.zlebank.zplatform.member.bean.CoopInsti;
import com.zlebank.zplatform.member.bean.CoopInstiMK;
import com.zlebank.zplatform.member.bean.enums.TerminalAccessType;
/**
 * 
 * cooperative institution service
 *
 * @author yangying
 * @version
 * @date 2016年1月13日 下午1:53:19
 * @since
 */
@Hessian(context = Context.API_V2, uri = "/remoting/rmiCoopInstiService")
public interface ICoopInstiService {
    /**
     * 
     * @param instiCode
     * @param terminalAccessType
     * @return null if not exist
     */
    CoopInstiMK getCoopInstiMK(String instiCode,
            TerminalAccessType terminalAccessType);
    /**
     * create a new cooperative institution 
     * @param instiName
     * @param userId
     * @return a unique code represent this institution in platform
     * @throws AbstractCoopInstiException if instiName exist,or generate cooperative institution mk error,or open insti account error
     */
    public String createCoopInsti(String instiName, long userId)
            throws Exception;
   
    /**
     * get all cooperative institution 
     * @return a cooperative institution list,if has no institution,the return list will be a list with zero element
     */
    public List<CoopInsti> getAllCoopInsti();
    
    /**
     * 
     * @param instiCode
     * @return
     */
    CoopInsti getInstiByInstiCode(String instiCode);
    /**
     * 
     * @param instiCode
     * @return
     */
    CoopInsti getInstiByInstiID(long instiId);
}
