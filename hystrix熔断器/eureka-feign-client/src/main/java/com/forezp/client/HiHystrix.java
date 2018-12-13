package com.forezp.client;

import org.springframework.stereotype.Component;

//调用失败处理类
@Component
public class HiHystrix implements  EurekaClientFeign{
    @Override
    public String sayHiFromClientEureka(String name) {
        return "feign处理类的name"+name;
    }
}
