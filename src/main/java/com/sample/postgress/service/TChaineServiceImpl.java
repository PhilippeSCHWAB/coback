package com.sample.postgress.service;


import com.sample.postgress.Model.TChaine;
import com.sample.postgress.Model.TChaineToUser;
import com.sample.postgress.Repositoy.TChaineRepository;
import com.sample.postgress.Repositoy.TChaineToUserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TChaineServiceImpl implements TChaineService {

    private TChaineRepository tchaineRepository;
    private TChaineToUserRepository tchainetouserRepository;

    //constructor
    public TChaineServiceImpl(TChaineRepository tchaineRepository, TChaineToUserRepository tchainetouserRepository) {
        this.tchaineRepository = tchaineRepository;
        this.tchainetouserRepository = tchainetouserRepository;
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

    @Override
    public TChaineToUser createTChaineToUSer(TChaineToUser tchainetouser) {
        return tchainetouserRepository.save(tchainetouser);
    }

/*
    @Override
    public TChaineToUser createTChaineToUser(TChaineToUser tchainetouser) {
        return tchainetouserRepository.save(tchainetouser);
    }
*/
}


