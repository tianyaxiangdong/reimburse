package com.wwl.controller;

import com.wwl.entity.Company;
import com.wwl.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by wangmeng on 2015/11/21.
 */
@Controller
public class CompanyController {
    @Autowired
    CompanyService companyService;

    /**
     * 根据条件查询数据
     * @param companyName
     * @param companyType
     * @param lxr
     * @return
     */
    @RequestMapping("/company/company-list")
    public ModelAndView getList(String companyName,String companyType,String lxr){
        List<Company> list_company = new ArrayList<Company>();
        try{
            Map mp = new HashMap();
            mp.put("companyName",companyName);
            mp.put("companyType",companyType);
            mp.put("lxr",lxr);
            list_company = companyService.findAllReconByCondition(mp);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ModelAndView("/company/company-list","list_company",list_company);
    }

    @RequestMapping(value = "/company/company-new", method = RequestMethod.GET)
    public ModelAndView goNew(){
        return new ModelAndView("/company/company-new");
    }

    @RequestMapping("/company/company-add")
    public int newCompany(Company company){
        company.setCompanySfje(BigDecimal.valueOf(0.00));
        company.setCompanySsje(BigDecimal.valueOf(0.00));
        company.setCompanyQnsfje(BigDecimal.valueOf(0.00));
        company.setCompanyQnssje(BigDecimal.valueOf(0.00));
        company.setCompanyLnsfje(BigDecimal.valueOf(0.00));
        company.setCompanyLnssje(BigDecimal.valueOf(0.00));
        company.setCreatetime(new Date());
        company.setCreateuser(1);

        int i = companyService.newCompany(company);
        return i;
    }

    @RequestMapping("/company/company-edit")
    public ModelAndView goEdit(int companyId){
       Company company = companyService.selectByPrimaryKey(companyId);
        return new ModelAndView("/company/company-edit","company",company);
    }

    @RequestMapping("/company/company-save")
    public int editCommpany(Company company){
        int i = companyService.updateCompany(company);
        return i;
    }

}
