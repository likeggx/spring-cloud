package com.love.cloud.controller;

import com.love.cloud.feign.RefactorUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mi on 2019/5/29.
 */
@RestController
public class Demo {

    @Autowired
    private RefactorUserService refactorUserService;

    @GetMapping("/test")
    public Object test(){
        StringBuilder sb = new StringBuilder();
        sb.append(refactorUserService.getAllUser())
                .append(refactorUserService.getUserById(1));
        return sb.toString();
    }
}

