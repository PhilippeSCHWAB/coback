package com.sample.postgress.service;

import com.sample.postgress.entity.TServerUnix;

import java.util.List;

public  interface TServerUnixService {

    List<TServerUnix> findAll();

    void createTUser(TServerUnix tserverunix);

    void updateTUser(TServerUnix tserverunix);

    void deleteUser(String id);

    List<TServerUnix> FilteredUser(String id);




}
