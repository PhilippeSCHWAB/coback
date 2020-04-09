package com.sample.postgress.service;


import com.sample.postgress.Model.TChaine;
import com.sample.postgress.Model.TChaine;
import com.sample.postgress.Repositoy.TChaineRepository;
import com.sample.postgress.Repositoy.TChaineRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TChaineServiceImpl implements TChaineService {

    private TChaineRepository tchaineRepository;


    //constructor
    public TChaineServiceImpl(TChaineRepository tchaineRepository) {
        this.tchaineRepository = tchaineRepository;
    }

    @Override
    public List<TChaine> findAll() {
        return tchaineRepository.findAll();
    }

    @Override
    public Optional<TChaine> FilteredChaine(Long tid) {
        return tchaineRepository.findById(tid);
    }

    @Override
    public TChaine createTChaine(TChaine tchaine) {
        return tchaineRepository.save(tchaine);
    }

    @Override
    public ResponseEntity<TChaine> updateTChaine(Long id, com.sample.postgress.Model.TChaine tchaineToUpdate) {
        return null;
    }

    @Override
    public void deleteChaine(Long tid) {
        System.out.println("'dfdfdfd'");
        tchaineRepository.deleteById(tid);
    }

}


