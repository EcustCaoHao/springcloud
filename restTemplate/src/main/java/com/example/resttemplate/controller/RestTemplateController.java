package com.example.resttemplate.controller;

import com.example.resttemplate.entity.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author: caohao
 * @date: 2023/12/1
 * @time: 10:53
 */
@RestController
@RequestMapping("/rest")
public class RestTemplateController {

    /**
     * get请求测试
     * @param name 姓名
     * @return 返回name
     */
    @GetMapping("/get")
    public String get(String name){
        System.out.println(name);
        return name;
    }

    /**
     * post请求接收json格式的字符串
     * @param user User
     * @return User.toString()
     */
    @PostMapping("/post1")
    public String postByJson(@RequestBody User user){
        System.out.println(user);
        return user.toString();
    }

    /**
     * 接收表单形式的参数
     * @param user 表单参数
     * @return User.toString()
     */
    @PostMapping("/post2")
    public String postByCode(User user){
        System.out.println(user);
        return user.toString();
    }
}
