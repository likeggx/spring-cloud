package com.love.cloud.service;

import com.love.cloud.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by mi on 2019/5/29.
 */
@RequestMapping("/love/user")
public interface UserService {

    @GetMapping("/{id}")
    User getUserById(@PathVariable("id") Integer id);

    @GetMapping("/all")
    List<User> getAllUser();
}
