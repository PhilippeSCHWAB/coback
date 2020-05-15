package com.sample.postgress.service;

import com.sample.postgress.Employee;
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
    private TUnixServerRepository tUnixServerRepository;


    //constructor
    public TUnixServerServiceImpl() {
        this.tUnixServerRepository = tUnixServerRepository;
    }

    @Override
    public List<TUnixServer> findAll() {
        return tUnixServerRepository.findAll();
    }
/*
    @Override
    public Optional<TUnixServer> FilteredUser(Long tid) {
        return tserveurunixRepository.findById(tid);
    }*/
/*
    @Override
    public ResponseEntity<TUnixServer> updateTServeurUnix(Long id, TUnixServer tserveurunixToUpdate) {
        return null;
    }
*/
    @Override
    public void delete(Long tid) {
        System.out.println("'dfdfdfd'");
        tUnixServerRepository.deleteById(tid);
    }

    @Override
    public TUnixServer save(TUnixServer tUnixServer) {
        return tUnixServerRepository.save(tUnixServer);
    }

    @Override
    public List<String> getUnixServerOnly() {
        return tUnixServerRepository.findAllServeurunix();
    }

    @Override
    public TUnixServer getTUnixServerByName(String tUnixServer) {
        return tUnixServerRepository.findByserveurunix(tUnixServer);
    }

    @Override
    public boolean exists(String tserveurunix) {
        if (tUnixServerRepository.findByserveurunix(tserveurunix) != null) {
            return true;
        }
        return false;
    }

    @Override
    public TUnixServer getTUnixServerById(Long id) {
        return tUnixServerRepository.findById(id).orElse(null);
    }

    @Override
    public List<TUnixServer> getAllTUnixServers() {
        return tUnixServerRepository.findAll();
    }



}


