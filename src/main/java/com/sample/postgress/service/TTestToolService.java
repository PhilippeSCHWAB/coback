package com.sample.postgress.service;

import org.springframework.http.ResponseEntity;
import com.sample.postgress.Model.TTestTool;
import java.util.List;
import java.util.Optional;


public interface TTestToolService {

    List<TTestTool> findAll();

    Optional<TTestTool> Filtered(Long tid);
/*
    TOutilDeTest create(TOutilDeTest toutildetest);
*/
    ResponseEntity<TTestTool> update(Long id, TTestTool toutildetestToUpdate);

    void delete(Long tid);


    TTestTool save(TTestTool toutilDeTestTool);


    List<String> getOutildetest();
}

