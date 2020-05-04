package com.sample.postgress.service;


import com.sample.postgress.Model.TChain;
import com.sample.postgress.Model.TChainToUser;
import org.springframework.http.ResponseEntity;


import java.util.List;
import java.util.Optional;

public interface TChainService {


    List<TChain> findAll();

    Optional<TChain> FilteredChaine(Long tid);

    TChain createTChaine(TChain tchaine);

    ResponseEntity<TChain> updateTChaine(Long id, TChain tchaineToUpdate);

    void deleteChaine(Long tid);

    TChainToUser createTChaineToUSer(TChainToUser tchainetouser);

}

