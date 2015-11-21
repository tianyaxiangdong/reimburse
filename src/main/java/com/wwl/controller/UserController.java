package com.wwl.controller;

import com.wwl.entity.User;
import com.wwl.entity.Users;
import com.wwl.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by cactus on 2015/11/19.
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user/list")
    public List<Users> getList(@RequestParam(value = "uid", required = false) String userId) {

        Users u = null;
     //   if (StringUtils.isNotEmpty(userId)) {
            u = new Users();
            u.setuUsername("aaa");
            u.setuRelname("bbb");
            u.setuCreatetime(new Date());
  //      }
        try {
           int id = userService.newUser(u);
            u = null;
          List list =  userService.searchUsers(u);
       //     System.out.println("id:"+id);
        }catch (Exception e){
            e.printStackTrace();
        }
         return null;
    }

}
