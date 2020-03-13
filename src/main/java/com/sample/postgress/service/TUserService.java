package com.sample.postgress.service;

import java.util.List;

import com.sample.postgress.entity.TUser;



public interface TUserService {


    List<TUser> findAll();

    void createTUser(TUser tuser);
/*
    void updateTUser(TUser tuser);

    void executeUpdateTUser(TUser tuser);

    void deleteTUser(String TUserUid);


    List<TUser> getFilteredUserList(String iudSelectedForm);
*/
    void deleteUser(String tuid);


  //  public   FilteredUser(String tuid);

    List<TUser> FilteredUser(String tuid);


}

