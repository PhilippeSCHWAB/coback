package com.sample.postgress.service;


import com.sample.postgress.Model.TChaine;
import org.springframework.http.ResponseEntity;


import java.util.List;
import java.util.Optional;

public interface TChaineService {


    List<TChaine> findAll();

    Optional<TChaine> FilteredChaine(Long tid);

    TChaine createTChaine(TChaine tchaine);

    ResponseEntity<TChaine> updateTChaine(Long id, TChaine tchaineToUpdate);

    void deleteChaine(Long tid);


}

