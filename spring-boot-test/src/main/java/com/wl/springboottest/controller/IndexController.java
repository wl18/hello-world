package com.wl.springboottest.controller;

import com.wl.springboottest.model.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @ Author: wl
 * @ Date: 2021/4/19 22:15
 */
@Controller
@Slf4j
public class IndexController {

    @GetMapping(value = {"","/"})
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();

        UserInfo userInfo = (UserInfo) request.getSession().getAttribute("userInfo");

        if (userInfo == null) {
            mv.setViewName("redirect:/user/login");
        } else {
            mv.setViewName("page/index");
            mv.addObject(userInfo);
        }
        return mv;
    }

    @RequestMapping(value = "/goToAjaxTest.do")
    public ModelAndView goToAjaxTest() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("page/ajaxTest");
        return mv;
    }
}
