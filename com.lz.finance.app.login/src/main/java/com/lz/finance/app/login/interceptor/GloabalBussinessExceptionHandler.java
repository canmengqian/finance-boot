package com.lz.finance.app.login.interceptor;

import com.lz.finance.base.common.exception.LoginException;
import com.lz.finance.base.common.http.BaseReponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author zhengzz
 * @version 1.0.0
 * @className GloabalBussinessExceptionHandler
 * @description TODO
 * @date 2021/9/11
 */
@RestControllerAdvice
public class GloabalBussinessExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public BaseReponse loginHandler(LoginException e){
        e.getError();
        System.out.println("未知异常！原因是:"+e);
        return BaseReponse.fail(e.getError());
    }
}
