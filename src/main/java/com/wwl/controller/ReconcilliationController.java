package com.wwl.controller;

import com.github.pagehelper.PageHelper;
import com.wwl.entity.Reconciliation;
import com.wwl.entity.User;
import com.wwl.service.ReconciliationService;
import com.wwl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.SimpleFormatter;

/**
 * Created by cactus on 2015/11/19.
 */
@Controller
public class ReconcilliationController {
//    http://git.oschina.net/free/Mybatis_PageHelper/wikis/HowToUse
    @Autowired
    ReconciliationService reconciliationService;
    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    @RequestMapping("/reconcilliation/list")
    public String getList(Date reconciliationDate,Date reconciliationDate2,Integer reconciliationResult) {

        try {
            Map mp = new HashMap();
            //mp.put("reconciliationDate",formatter.parse(formatter.format(new Date())));
            //mp.put("reconciliationDate2",formatter.parse(formatter.format(new Date())));
            //mp.put("reconciliationResult", 1);
//            获取第1页，2条内容，默认查询总数count
            PageHelper.startPage(1, 2);
//            紧跟着的第一个select方法会被分页
            List<Reconciliation> list =  reconciliationService.findAllReconByCondition(mp);
            System.out.print("ddd"+list.size());
        }catch (Exception e){
            e.printStackTrace();
        }

         return null;
    }

}
