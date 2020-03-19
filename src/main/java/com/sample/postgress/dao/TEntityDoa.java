package com.sample.postgress.dao;



import com.sample.postgress.entity.TEntity;

import java.util.List;

public interface TEntityDoa {

    List<TEntity> findAll();

    void createTEntity(TEntity tentity);

    void updateTEntity(TEntity tentity);

    void executeUpdateTEntity(TEntity tentity);

    public void deleteTEntity(TEntity tentity);
}

