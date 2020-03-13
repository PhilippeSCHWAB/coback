package com.sample.postgress.service;
import com.sample.postgress.entity.TChaine;


import java.util.List;

public interface TChaineService {


    List<TChaine> findAll();

    void createTChain(TChaine tchaine);
/*
    void updateTChaine(TChaine tchaine);

    void executeUpdateTChaine(TChaine tchaine);
*/
    void deleteTChaine(String ndlc);

}

