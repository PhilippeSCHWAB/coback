package com.sample.postgress.service;

import com.sample.postgress.Model.TEntity;
import com.sample.postgress.Repositoy.TEntityRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class
TEntityServiceImpl implements TEntityService {

    private TEntityRepository tentityRepository;


    //constructor
    public TEntityServiceImpl(TEntityRepository tentityRepository) {
        this.tentityRepository = tentityRepository;
    }

    @Override
    public List<TEntity> findAll() {
        return tentityRepository.findAll();
    }

    @Override
    public Optional<TEntity> FilteredTEntity(Long tid) {
        return tentityRepository.findById(tid);
    }

    @Override
    public ResponseEntity<TEntity> updateTEntity(Long id, TEntity tentityToUpdate) {
        return null;
    }

    @Override
    public void deleteTEntity(Long tid) {
        tentityRepository.deleteById(tid);
    }


    @Override
    public TEntity save(TEntity tentity) {
        return tentityRepository.save(tentity);
    }


    @Override
    public List<String> getEntite() {
        return tentityRepository.findAllEntite();
    }

}


