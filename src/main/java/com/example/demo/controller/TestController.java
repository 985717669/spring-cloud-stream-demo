package com.example.demo.controller;

import com.example.demo.entity.Stu;
import com.example.demo.provider.MessageProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Author fengjf
 * Desc
 */
@RestController
public class TestController {
    @Resource
    private MessageProviderService messageProviderService;


    @GetMapping("test")
    public String test(@RequestParam String message) {
        Stu stu = new Stu();
        stu.setName("张三");
        stu.setSex("男");
        stu.setDesc("爱好运动、泡妞");
        messageProviderService.sendSimpleMessage(stu);
        System.out.println(message);
        return message;
    }
}
