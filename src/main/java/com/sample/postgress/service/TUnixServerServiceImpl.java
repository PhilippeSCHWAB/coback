package com.sample.postgress.service;

import com.sample.postgress.Model.TUnixServer;
import com.sample.postgress.Repositoy.TUnixServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TUnixServerServiceImpl implements TUnixServerService {

    @Autowired
    private TUnixServerRepository tserveurunixRepository;


    //constructor
    public TUnixServerServiceImpl() {
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

    @Override
    public TUnixServer getTUnixServerByName(String tserveurunix) {
        return tserveurunixRepository.findByserveurunix(tserveurunix);
    }

    @Override
    public boolean exists(String tserveurunix) {
        if (tserveurunixRepository.findByserveurunix(tserveurunix) != null) {
            return true;
        }
        return false;
    }

    @Override
    public TUnixServer getTUnixServerById(Long id) {
        return tserveurunixRepository.findById(id).orElse(null);
    }


}


