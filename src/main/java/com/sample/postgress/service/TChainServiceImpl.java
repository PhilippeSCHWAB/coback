package com.sample.postgress.service;


import com.sample.postgress.Model.TChain;
import com.sample.postgress.Model.TChainToUser;
import com.sample.postgress.Repositoy.TChainRepository;
import com.sample.postgress.Repositoy.TChainToUserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TChainServiceImpl implements TChainService {

    private TChainRepository tchaineRepository;
    private TChainToUserRepository tchainetouserRepository;

    //constructor
    public TChainServiceImpl(TChainRepository tchaineRepository, TChainToUserRepository tchainetouserRepository) {
        this.tchaineRepository = tchaineRepository;
        this.tchainetouserRepository = tchainetouserRepository;
    }

    @Override
    public List<TChain> findAll() {
        return tchaineRepository.findAll();
    }

    @Override
    public Optional<TChain> FilteredChaine(Long tid) {
        return tchaineRepository.findById(tid);
    }

    @Override
    public TChain createTChaine(TChain tchaine) {
        return tchaineRepository.save(tchaine);
    }

    @Override
    public ResponseEntity<TChain> updateTChaine(Long id, TChain tchaineToUpdate) {
        return null;
    }

    @Override
    public void deleteChaine(Long tid) {
        System.out.println("'dfdfdfd'");
        tchaineRepository.deleteById(tid);
    }

    @Override
    public TChainToUser createTChaineToUSer(TChainToUser tchainetouser) {
        return tchainetouserRepository.save(tchainetouser);
    }

/*
    @Override
    public TChaineToUser createTChaineToUser(TChaineToUser tchainetouser) {
        return tchainetouserRepository.save(tchainetouser);
    }
*/
}


