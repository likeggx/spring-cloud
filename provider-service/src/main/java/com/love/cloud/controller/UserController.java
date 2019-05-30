package com.love.cloud.controller;

import com.love.cloud.dto.User;
import com.love.cloud.service.UserService;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mi on 2019/5/29.
 */
@RestController
public class UserController implements UserService{

    @Override
    public User getUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setAge(18);
        user.setUserName("user1");
        return user;
    }

    @Override
    public List<User> getAllUser() {
        User user = new User();
        user.setId(1);
        user.setAge(18);
        user.setUserName("user1");
        User user1 = new User();
        user1.setId(2);
        user1.setAge(20);
        user1.setUserName("user2");
        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);
        return list;
    }
}
