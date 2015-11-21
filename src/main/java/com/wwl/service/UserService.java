package com.wwl.service;

import com.wwl.entity.User;
import com.wwl.entity.Users;
import com.wwl.storage.mappers.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Created by Administrator on 2015/11/19.
 */
@Service
public class UserService {

    @Autowired
    private UsersMapper usersMapper;


    public int newUser(Users user) {

        user.setuCreatetime(new Date());

        return usersMapper.insert(user);

    }

    public List<User> searchUsers(Users user) {
        List<User> list = new ArrayList<User>();
//        if (user == null)
//            list = usersMapper.getAllUsers();

        return list;
    }
}
