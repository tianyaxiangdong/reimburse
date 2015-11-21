package com.wwl.controller;

import com.wwl.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;

/**
 * Created by wangmeng on 2015/11/21.
 */
@Controller
public class GroupController {
    @Autowired
    GroupService groupService;
    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

}
