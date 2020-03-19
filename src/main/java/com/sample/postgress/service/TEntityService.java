package com.sample.postgress.service;

import com.sample.postgress.entity.TEntity;

import java.util.List;

public  interface TEntityService {


    List<TEntity> findAll();

    void createTUser(TEntity tentity);

    void updateTUser(TEntity tentity);

    void deleteUser(String id);

    List<TEntity> FilteredUser(String id);






}
