package com.sample.postgress.service;

import com.sample.postgress.Model.TUser;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;


public interface TUserService {

    List<TUser> findAll();

    Optional<TUser> getFilteredUser(int tid);

    TUser createTUser(TUser tuser);

    ResponseEntity<TUser> updateTUser(int id, TUser tuserToUpdate);

    void deleteTUser(int tid);


}

