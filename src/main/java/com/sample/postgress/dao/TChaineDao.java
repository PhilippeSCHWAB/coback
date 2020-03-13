package com.sample.postgress.dao;

import java.util.List;

import com.sample.postgress.entity.TChaine;




public interface TChaineDao {

    List<TChaine> findAll();

    void createTChain(TChaine tchaine);
/*
    void updateTChaine(TChaine tchaine);

    void executeUpdateTChaine(TChaine tchaine);
*/
    public void deleteTChaine(String ndlc);


}
