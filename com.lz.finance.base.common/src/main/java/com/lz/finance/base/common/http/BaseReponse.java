package com.lz.finance.base.common.http;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhengzz
 * @version 1.0.0
 * @className BaseReponse
 * @description TODO
 * @date 2021/9/11
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseReponse<T> {
    String code ;
    String msg;
    T data;



    private static String FAIL_CODE = "9999";

    public static BaseReponse fail(Object t) {
        return BaseReponse.builder().code(FAIL_CODE).data(t).build();
    }

}
