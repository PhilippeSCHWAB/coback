package com.sample.postgress.service;

import com.sample.postgress.Model.TUser;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;


public interface TUserService {

    List<TUser> findAll();

    Optional<TUser> FilteredUser(Long tid);

    TUser createTUser(TUser tuser);

    ResponseEntity<TUser> updateTUser(Long id, TUser tuserToUpdate);

    void deleteUser(Long tid);


}

