package com.tuyou.tuyouerp.controller;

import com.tuyou.common.Json.JsonUtil;
import com.tuyou.tuyouerp.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xdjk.model.erp.Enterprise;

import java.util.ArrayList;
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
    @RequestMapping("/list")
    private JsonUtil list(JsonUtil jsonUtil){
        Enterprise entity=(Enterprise)jsonUtil.getData();
        if(entity==null){
            entity=new Enterprise();
        }
        int count = enterpriseService.count(entity);
        List<Enterprise> list=new ArrayList<Enterprise>();
        if (count > 0) {
           list = enterpriseService.search(entity, 0, 20, null);
        }
        return  JsonUtil.setParameter(list,count,jsonUtil);
    }
}
