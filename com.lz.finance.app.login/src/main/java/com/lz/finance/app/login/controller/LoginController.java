package com.lz.finance.app.login.controller;

import com.lz.finance.app.login.domain.model.user.UserModel;
import com.lz.finance.app.login.domain.vo.UserVO;
import com.lz.finance.base.common.exception.LoginException;
import com.lz.finance.base.common.exception.Error;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author zhengzz
 * @version 1.0.0
 * @className LoginController
 * @description TODO
 * @date 2021/9/11
 */
@RestController
@RequestMapping("/login")
@Slf4j
@Api(value = "登录", tags = "登录")
public class LoginController extends BaseController {

    private static final String USER_ATTR = "user";

    @PostMapping(value = "session")
    @ApiOperation(value = "session登录", notes = "session登录")
    public void loginSession(UserVO.UserIn in, ServletResponse response) {
        HttpSession session = request.getSession();
        UserModel model = UserModel.builder().email("2570389155@qq.com").password("123456").build();
        session.setAttribute(USER_ATTR, model);
    }

    @PostMapping(value = "check")
    @ApiOperation(value = "session登录", notes = "session登录")
    public void checkLogin(UserVO.UserIn in) {
        HttpSession session = request.getSession();
        UserModel model = null;
        if (session != null) {
            model = (UserModel) session.getAttribute(USER_ATTR);
        }
        if (model != null) {
            if (model.getEmail().equals(in.getEmail()) && model.getPassword().equals(in.getPassword())) {
                log.info("登陆成功");
            }
        }

       throw  LoginException.error(Error.builder().code("100").build());

    }
}
