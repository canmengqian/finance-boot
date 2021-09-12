package com.lz.finance.app.login.domain.vo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhengzz
 * @version 1.0.0
 * @className UserVO
 * @description TODO
 * @date 2021/9/11
 */
@Data
public class UserVO {
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @ApiModel("用户输入")
    public static class UserIn {
        @ApiModelProperty(value = "密码",required = true)
        String password;
        @ApiModelProperty(value = "邮箱",required = true)
        private String email;
    }
}
