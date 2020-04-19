package com.sample.postgress.service;


import com.sample.postgress.Model.TChaine;
import com.sample.postgress.Model.TChaineToUser;
import org.springframework.http.ResponseEntity;


import java.util.List;
import java.util.Optional;

public interface TChaineService {


    List<TChaine> findAll();

    Optional<TChaine> FilteredChaine(Long tid);

    TChaine createTChaine(TChaine tchaine);

    ResponseEntity<TChaine> updateTChaine(Long id, TChaine tchaineToUpdate);

    void deleteChaine(Long tid);

    TChaineToUser createTChaineToUSer(TChaineToUser tchainetouser);

}

