package com.tuyou.tuyougateway.filter;

import com.alibaba.fastjson.JSON;
import com.tuyou.common.Json.Info;
import com.tuyou.common.Json.JsonUtil;
import com.tuyou.common.util.CheckCodeUtil;
import org.apache.http.HttpStatus;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

/*@Component
public class CheckGatewayFilterFactory extends AbstractGatewayFilterFactory<Object> {
    @Override
    public GatewayFilter apply(Object config) {
        return (exchange, chain) -> {
            String jwtToken = exchange.getRequest().getHeaders().getFirst("token");
            //校验jwtToken的合法性
            if (CheckCodeUtil.verifyToken(jwtToken)) {
                //合法
                return chain.filter(exchange);
            }
            //不合法
            JsonUtil jsonUtil = new JsonUtil();
            Info info = new Info();
            info.setStatus(HttpStatus.SC_SWITCHING_PROTOCOLS);
            info.setMessage("未登录或登录超时");
            /*//*/不合法
            ServerHttpResponse response = exchange.getResponse();
            //设置headers
            HttpHeaders httpHeaders = response.getHeaders();
            httpHeaders.add("Content-Type", "application/json; charset=UTF-8");
            httpHeaders.add("Cache-Control", "no-store, no-cache, must-revalidate, max-age=0");
            //设置body
            JsonPackage jsonPackage = new JsonPackage();
            jsonPackage.setStatus(110);
            jsonPackage.setMessage("未登录或登录超时");
            DataBuffer bodyDataBuffer = response.bufferFactory().wrap(jsonPackage.toJSONString().getBytes());

            return response.writeWith(Mono.just(bodyDataBuffer));*//*
            ServerHttpResponse response = exchange.getResponse();
            DataBuffer bodyDataBuffer = response.bufferFactory().wrap(JSON.toJSONString(jsonUtil).getBytes());
            return response.writeWith(Mono.just(bodyDataBuffer));
        };
    }
}*/
