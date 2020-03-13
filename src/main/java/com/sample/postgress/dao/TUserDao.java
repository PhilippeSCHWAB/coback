package com.sample.postgress.dao;

import java.util.List;

import com.sample.postgress.entity.TUser;



public interface TUserDao {

    List<TUser> findAll();

    void createTUser(TUser tuser);
/*
    void updateTUser(TUser tuser);

    void executeUpdateTUser(TUser tuser);
*/

    public void deleteUser(String TUserUid);
/*
    public  FilteredUser(String TUserUid);
  */
    List<TUser> findFiltered(String TUserIud) ;
}
