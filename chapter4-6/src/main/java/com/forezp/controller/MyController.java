package com.forezp.controller;

import com.forezp.dao.RedisDao;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    RedisDao redisDao;
    @ApiOperation(value = "测试redis和swagger")
    @RequestMapping(value = "/nihao",method = RequestMethod.GET)
    public  String ceshiRedis(){
        redisDao.setKey("测试001","我的测试");
        return  redisDao.getValue("测试001");
    }
}
