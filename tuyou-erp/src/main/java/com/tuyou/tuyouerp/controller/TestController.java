package com.tuyou.tuyouerp.controller;

import com.tuyou.tuyouerp.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xdjk.model.erp.Enterprise;
import java.util.Collections;
import java.util.List;

/**
 * @Author: luyy
 * @Date: 2018/9/01  13:28
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/test")
public class TestController extends BaseController{
    @Autowired
    private EnterpriseService enterpriseService;
    @RequestMapping("/hello")
    private String index(){

        return "Hello World!";
    }
}
