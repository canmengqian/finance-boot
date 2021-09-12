package com.lz.finance.app.login.mapper;


import com.lz.finance.app.login.LoginApplication;
import com.lz.finance.app.login.domain.model.user.UserModel;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(classes = LoginApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class UserMapperTest {
    @Resource
    private UserMapper userMapper;


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<UserModel> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }
}