package com.wl.springboottest.controller;

import com.wl.springboottest.model.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @ Author: wl
 * @ Date: 2021/4/19 22:23
 */
@Controller
@Slf4j
@RequestMapping("/user")
public class UserInfoController {

    @PostMapping("/login")
    public ModelAndView login(UserInfo userInfo, HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();

        mv.addObject(userInfo);
        mv.setViewName("redirect:/");

        request.getSession().setAttribute("userInfo", userInfo);
        return mv;
    }

    @GetMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("page/login");
    }
}
