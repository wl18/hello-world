package com.wl.springboottest.controller;

import com.wl.springboottest.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
}
