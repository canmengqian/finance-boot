package com.lz.finance.base.common.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhengzz
 * @version 1.0.0
 * @className Error
 * @description TODO
 * @date 2021/9/11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Error {
    private String code ;
    private String msg ;
    private  Throwable cause;
}
