package com.wwl.service;

import com.wwl.entity.Reconciliation;
import com.wwl.storage.mappers.ReconciliationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2015/11/20.
 */
@Service
public class ReconciliationService {
    @Autowired
    private ReconciliationMapper reconciliationMapper;

    public List<Reconciliation> findAllRec(){
        List<Reconciliation> reco =  reconciliationMapper.selectByExample(null);
        return reco;
    }

    public List<Reconciliation> findAllReconByCondition(Map mp){
        List<Reconciliation> reco =  reconciliationMapper.findAllReconByCondition(mp);
        System.out.println("ttttttt");
        return reco;
    }
}
