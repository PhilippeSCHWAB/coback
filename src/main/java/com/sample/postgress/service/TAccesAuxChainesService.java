package com.sample.postgress.service;

import com.sample.postgress.entity.TAccesAuxChaines;
import com.sample.postgress.entity.TUser;

import java.util.List;

public  interface TAccesAuxChainesService {



    List<TAccesAuxChaines> findAll();

    void createTAccesAuxChaines(TAccesAuxChaines Taccesauxchaines);
/*
    void updateTAccesAuxChaines(TAccesAuxChaines Taccesauxchaines);

    void deleteTAccesAuxChaines(String id);

    List<TAccesAuxChaines> FilteredTAccesAuxChaines(String id);
*/



}
