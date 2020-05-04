package com.sample.postgress.service;

import com.sample.postgress.Model.TEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;


public interface TEntityService {

    List<TEntity> findAll();

    Optional<TEntity> FilteredTEntity(Long tid);

    ResponseEntity<TEntity> updateTEntity(Long id, TEntity tentityToUpdate);

    void deleteTEntity(Long tid);

    TEntity save(TEntity tentity);

    List<String> getEntite();


}
