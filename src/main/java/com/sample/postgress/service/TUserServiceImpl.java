package com.sample.postgress.service;

import java.util.List;

import javax.annotation.Resource;


import org.springframework.stereotype.Component;

import com.sample.postgress.dao.TUserDao;
import com.sample.postgress.entity.TUser;


    @Component
    public class TUserServiceImpl implements TUserService{
        @Resource
        TUserDao tuserDao;
        @Override
        public List<TUser> findAll() {     return tuserDao.findAll();        }
        @Override
        public void createTUser(TUser tuser) {
            tuserDao.createTUser(tuser);        }

        @Override
        public void deleteUser(String UserUid) {
            tuserDao.deleteUser(UserUid);
        }

        @Override
        public List<TUser> FilteredUser(String TUserIud)  {  return tuserDao.findFiltered(TUserIud) ;}
    }

  /*
        @Override
        public void updateTUser(TUser tuser) {
            tuserDao.updateTUser(tuser);

        }
        @Override
        public void executeUpdateTUser(TUser tuser) {
            tuserDao.executeUpdateTUser(tuser);

        }

 */




