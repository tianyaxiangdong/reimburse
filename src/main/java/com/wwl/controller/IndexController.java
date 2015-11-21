package com.wwl.controller;

import java.sql.SQLException;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.sql.DataSource;

/**
 * Created by Administrator on 2015/11/19.
 */


@Controller
public class IndexController {

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @Autowired
    DataSource dataSource;

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) throws SQLException {
        model.put("time", new Date());
        model.put("message", this.message);

        return "welcome";
    }

    @RequestMapping("/foo")
    public String foo(Map<String, Object> model) {
        throw new RuntimeException("Foo");
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "site.homepage";
    }

    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    public ModelAndView greet(@RequestParam(value = "name", required = false, defaultValue = "World!") final String name, final Model model) {
        return new ModelAndView("site.greeting", "name", name);
    }
}