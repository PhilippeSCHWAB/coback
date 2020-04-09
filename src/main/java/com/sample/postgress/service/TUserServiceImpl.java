package com.sample.postgress.service;

import java.util.List;
import java.util.Optional;


import com.sample.postgress.Model.TUser;
import com.sample.postgress.Repositoy.TUserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TUserServiceImpl implements TUserService {

    private TUserRepository tuserRepository;


    //constructor
    public TUserServiceImpl(TUserRepository tuserRepository) {
        this.tuserRepository = tuserRepository;
    }

    @Override
    public List<TUser> findAll() {
        return tuserRepository.findAll();
    }

    @Override
    public Optional<TUser> FilteredUser(Long tid) {
        return tuserRepository.findById(tid);
    }

    @Override
    public TUser createTUser(TUser tuser) {
        return tuserRepository.save(tuser);
    }

    @Override
    public ResponseEntity<TUser> updateTUser(Long id, com.sample.postgress.Model.TUser tuserToUpdate) {
        return null;
    }

    @Override
    public void deleteUser(Long tid) {
        System.out.println("'dfdfdfd'");
        tuserRepository.deleteById(tid);
    }

}


