package com.sample.postgress.service;

import java.util.List;

import com.sample.postgress.entity.TUser;



public interface TUserService {


    List<TUser> findAll();

    void createTUser(TUser tuser);

    void updateTUser(TUser tuser);

    void deleteUser(String tuid);

    List<TUser> FilteredUser(String tuid);


}

