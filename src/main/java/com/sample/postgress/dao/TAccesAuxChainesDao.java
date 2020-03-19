package com.sample.postgress.dao;

import com.sample.postgress.entity.Employee;
import com.sample.postgress.entity.TAccesAuxChaines;

import java.util.List;

public interface TAccesAuxChainesDao {

    List<TAccesAuxChaines> findAll();

    void createTAccesAuxChaines(TAccesAuxChaines taccesauxchaines);
/*
    void updateTAccesAuxChaines(TAccesAuxChaines taccesauxchaines);

    void executeUpdateTAccesAuxChaines(TAccesAuxChaines taccesauxchaines);

    public void deleteTAccesAuxChaines(TAccesAuxChaines taccesauxchaines);
*/
}
