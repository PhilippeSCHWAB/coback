package com.sample.postgress.service;

import com.sample.postgress.Model.TUnixServer;
import com.sample.postgress.Repositoy.TUnixServerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TUnixServerServiceImpl implements TUnixServerService {

    private TUnixServerRepository tserveurunixRepository;


    //constructor
    public TUnixServerServiceImpl(TUnixServerRepository tserveurunixRepository) {
        this.tserveurunixRepository = tserveurunixRepository;
    }

    @Override
    public List<TUnixServer> findAll() {
        return tserveurunixRepository.findAll();
    }

    @Override
    public Optional<TUnixServer> FilteredUser(Long tid) {
        return tserveurunixRepository.findById(tid);
    }
/*
    @Override
    public TServeurUnix createTServeurUnix(TServeurUnix tserveurunix) {
        return tserveurunixRepository.save(tserveurunix);
    }
*/
    @Override
    public ResponseEntity<TUnixServer> updateTServeurUnix(Long id, TUnixServer tserveurunixToUpdate) {
        return null;
    }

    @Override
    public void delete(Long tid) {
        System.out.println("'dfdfdfd'");
        tserveurunixRepository.deleteById(tid);
    }

    @Override
    public TUnixServer save(TUnixServer tserveurunix) {
        return tserveurunixRepository.save(tserveurunix);
    }

    @Override
    public List<String> getServeurunix() {
        return tserveurunixRepository.findAllServeurunix();

    }

}


