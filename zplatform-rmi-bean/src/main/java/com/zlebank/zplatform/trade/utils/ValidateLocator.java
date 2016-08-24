package com.zlebank.zplatform.trade.utils;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.zlebank.zplatform.trade.bean.ResultBean;





public class ValidateLocator{

	private static Validator validator;
	public static final String SYSTEM_ERROR="订单信息错误,请重新提交订单";
   
	public static<T> ResultBean validateBeans(T obj){
	    ResultBean resultBean=null;
		try {
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			 validator = factory.getValidator();
			 Set<ConstraintViolation<T>> constraintViolations =
			         validator.validate(obj);
			 String message=SYSTEM_ERROR;
			 for (ConstraintViolation<T> constraintViolation : constraintViolations) { 
				 message=MessageConvertFactory.getMessage(constraintViolation.getMessage())==null?SYSTEM_ERROR
						 	:MessageConvertFactory.getMessage(constraintViolation.getMessage());
				 resultBean=new ResultBean(constraintViolation.getPropertyPath().toString(),message);
			     return resultBean;
			 }
			 resultBean = new ResultBean(obj);
		} catch (Exception e) {
		    
		    //rDto.setErrorResultDto(SYSTEM_ERROR);
		} 
	     return resultBean;
	}
	
	
}
