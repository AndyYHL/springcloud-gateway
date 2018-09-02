package com.tuyou.tuyoucrm.controller;

import com.tuyou.common.response.SearchListResponse;
import com.tuyou.tuyoucrm.service.EnterpriseService;
import com.tuyou.tuyoucrm.vo.Enterprise;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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
    @Resource
    private EnterpriseService enterpriseService;
    @RequestMapping("/hello")
    private String index(){

        return "Hello World!";
    }

    @RequestMapping("/enterprise")
    private SearchListResponse enterprise(Enterprise bean){
        SearchListResponse response = new SearchListResponse();

        int count = enterpriseService.count(bean);
        if (count > 0) {
            List<Enterprise> beans = enterpriseService.search(bean, bean.getPageIndex(), bean.getPageSize(), null);
            //List<MstFeedbackModel> models = Convertor.copyDataList(beans, MstFeedbackModel.class);
            response.setList(beans);

        }else{
            response.setList(Collections.emptyList());
        }
        response.setTotal(count);
        response.setResponse(getSuccess());
        return  response;

    }

}
