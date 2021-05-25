package com.wl.springboottest.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wl.springboottest.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ Author: wl
 * @ Date: 2021/4/19 22:39
 */
@RestController
@Slf4j
public class TestController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/postUser")
    public void test2() {
        log.info("info 日志打印");
    }

    @GetMapping("/getAll")
    public Object getAll() {
        Map<String, Object> map = new HashMap<>();
        map.put("dataList", userRepository.findAll());
        map.put("flag", 1);
        return map;
    }

    @GetMapping("/ajaxTest")
    public ResponseEntity<Object> ajaxTest() {
        Map<String, String> map = new HashMap<>();
        map.put("t1","tets");
        JSONObject jsonObject = new JSONObject();

        //不管这里传到前端的是map对象还是转成JSON.toJSONString(map)字符串的，前端ajax可以使用dataType来预期后台传来的数据，自动转化
        return new ResponseEntity<>(map, HttpStatus.OK);
        //return new ResponseEntity<>(JSON.toJSONString(map));
    }

}
