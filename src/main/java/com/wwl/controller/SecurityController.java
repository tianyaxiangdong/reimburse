package com.wwl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cactus on 2015/11/21.
 */
@Controller
public class SecurityController {

    /**
     * 进入登录界面
     *
     * @return
     */
    @RequestMapping(value = "/login", method = { RequestMethod.GET })
    public String init(Model model) {



        // 登录主界面视图
		return "/security/login";
    }

}
