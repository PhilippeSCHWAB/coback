package com.sample.postgress.service;


import com.sample.postgress.dao.TChaineDao;

import com.sample.postgress.entity.TChaine;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;


@Component
public class TChaineServiceImpl implements TChaineService{
    @Resource
    TChaineDao tchaineDao;
    @Override
    public List<TChaine> findAll() {     return tchaineDao.findAll();        }

    @Override
    public void createTChain(TChaine tchaine) {
        System.out.println("tcserviceimpl :"+tchaine);
        tchaineDao.createTChain(tchaine);

    }
    /*
    @Override
    public void updateTChaine(TChaine tchaine) {
        tchaineDao.updateTChaine(tchaine);

    }
    @Override
    public void executeUpdateTChaine(TChaine tchaine) {
        tchaineDao.executeUpdateTChaine(tchaine);

    }
    */
    @Override
    public void deleteTChaine(String ndlc) {
       tchaineDao.deleteTChaine(ndlc);

    }

}


