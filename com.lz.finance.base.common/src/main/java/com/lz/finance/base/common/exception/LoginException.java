package com.lz.finance.base.common.exception;

/**
 * @author zhengzz
 * @version 1.0.0
 * @className LoginException
 * @description TODO
 * @date 2021/9/11
 */
public class LoginException extends RuntimeException {

    private Error error;

    private LoginException(Error error) {
        super(error.toString());
        this.error = error;
    }


    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public static LoginException error(Error error) {
        return new LoginException(error);
    }

}
