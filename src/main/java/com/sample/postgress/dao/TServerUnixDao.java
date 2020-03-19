package com.sample.postgress.dao;

import com.sample.postgress.entity.Employee;
import com.sample.postgress.entity.TServerUnix;

import java.util.List;

public interface TServerUnixDao {

    List<TServerUnix> findAll();

    void createTServerUnix(TServerUnix tserverunix);

    void updateTServerUnix(TServerUnix tserverunix);

    void executeUpdateTServerUnix(TServerUnix tserverunix);

    public void deleteTServerUnix(TServerUnix tserverunix);

}
