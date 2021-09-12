package com.lz.finance.app.login.domain.model.user;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhengzz
 * @version 1.0.0
 * @className UserModel
 * @description TODO
 * @date 2021/9/3
 */
@Data
@TableName("user")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    private Long id;
    private String name;
    private Integer age;
    private String password;
    private String email;
}
