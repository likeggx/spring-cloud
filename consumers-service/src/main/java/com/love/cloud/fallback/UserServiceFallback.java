package com.love.cloud.fallback;

import com.love.cloud.dto.User;
import com.love.cloud.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mi on 2019/5/29.
 */
@Component
public class UserServiceFallback implements UserService{

    @Override
    public User getUserById(Integer id) {
        User user  = new User();
        user.setId(id);
        user.setUserName("userError");
        user.setAge(-id);
        return user;
    }

    @Override
    public List<User> getAllUser() {
        User user  = new User();
        user.setId(-1);
        user.setUserName("userError-1");
        user.setAge(0);
        List<User> list = new ArrayList<>();
        list.add(user);
        return list;
    }
}
