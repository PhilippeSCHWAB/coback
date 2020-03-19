package com.sample.postgress.dao;

import com.sample.postgress.entity.Employee;
import com.sample.postgress.entity.TOutilDeTest;

import java.util.List;

public interface TOutilDeTestDao {
    List<TOutilDeTest> findAll();

    void createEmployee(TOutilDeTest toutildetest);

    void updateEmployee(TOutilDeTest toutildetest);

    void executeUpdateEmployee(TOutilDeTest toutildetest);

    public void deleteEmployee(TOutilDeTest toutildetest);


}
