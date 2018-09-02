package com.tuyou.tuyoucrm.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: luyy
 * @Date: 2018/9/01  13:28
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/test")
public class TestController extends BaseController{
    @RequestMapping("/hello")
    private String index(){

        return "Hello World!";
    }

}
