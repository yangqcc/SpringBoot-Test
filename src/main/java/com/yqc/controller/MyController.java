package com.yqc.controller;

import com.yqc.UserService;
import com.yqc.domain.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangqc on 2017/6/4.
 */
@RestController("/api")
@RequestMapping
@AllArgsConstructor
public class MyController {

    private final UserService userService;

    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @PostMapping("/user")
    public String postUser(@RequestBody User user) {
        userService.save(user);
        return "success";
    }
}
