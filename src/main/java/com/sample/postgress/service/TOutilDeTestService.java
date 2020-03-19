package com.sample.postgress.service;

import com.sample.postgress.entity.TOutilDeTest;

import java.util.List;

public  interface TOutilDeTestService {


    List<TOutilDeTest> findAll();

    void createTUser(TOutilDeTest toutildetest);

    void updateTUser(TOutilDeTest toutildetest);

    void deleteUser(String id);

    List<TOutilDeTest> FilteredUser(String id);





}
