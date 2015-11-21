package com.wwl.service;

import com.wwl.entity.Company;
import com.wwl.storage.mappers.CompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

/**
 * Created by wangmeng on 2015/11/21.
 */
@Service
public class CompanyService {

    @Autowired
    private CompanyMapper companyMapper;

    /**
     * 新增数据
     * @param company
     * @return
     */
    public int newCompany(Company company){
        return companyMapper.insert(company);
    }

    /**
     * 修改数据
     * @param company
     * @return
     */
    public int updateCompany(Company company){
        return companyMapper.updateByPrimaryKeySelective(company);
    }

    /**
     * 删除数据
     * @param companyId
     * @return
     */
    public int deleteCompany(int companyId){
        return companyMapper.deleteByPrimaryKey(companyId);
    }

    /**
     * 根据条件查询数据
     * @param mp
     * @return
     */
    public List<Company> findAllReconByCondition(Map mp){
        List<Company> list_company =  companyMapper.findAllReconByCondition(mp);
        return list_company;
    }

    /**
     * 根据ID查询数据
     * @param companyId
     * @return
     */
    public Company selectByPrimaryKey(int companyId){
        return companyMapper.selectByPrimaryKey(companyId);
    }

}
