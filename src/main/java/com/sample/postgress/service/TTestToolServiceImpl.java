package com.sample.postgress.service;

import com.sample.postgress.Model.TTestTool;
import com.sample.postgress.Repositoy.TTestToolRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TTestToolServiceImpl implements TTestToolService {

    private TTestToolRepository toutildetestToolRepository;


    //constructor
    public TTestToolServiceImpl(TTestToolRepository toutildetestToolRepository) {
        this.toutildetestToolRepository = toutildetestToolRepository;
    }

    @Override
    public List<TTestTool> findAll() {
        return toutildetestToolRepository.findAll();
    }

    @Override
    public Optional<TTestTool> Filtered(Long tid) {
        return toutildetestToolRepository.findById(tid);
    }
/*
    @Override
    public TOutilDeTest create(TOutilDeTest toutildetest) {
        return toutildetestRepository.save(toutildetest);
    }
*/
    @Override
    public ResponseEntity<TTestTool> update(Long id, TTestTool toutildetestToUpdate) {
        return null;
    }

    @Override
    public void delete(Long tid) {
        System.out.println("'dfdfdfd'");
        toutildetestToolRepository.deleteById(tid);
    }

    @Override
    public TTestTool save(TTestTool toutildetest) {
        return toutildetestToolRepository.save(toutildetest);
    }


    @Override
    public List<String> getOutildetest() {
        return toutildetestToolRepository.findAllOutildetest();

    }

}


