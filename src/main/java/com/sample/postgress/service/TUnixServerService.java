package com.sample.postgress.service;

import com.sample.postgress.Model.TUnixServer;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;


public interface TUnixServerService {

    List<TUnixServer> findAll();

    Optional<TUnixServer> FilteredUser(Long tid);
/*
    TServeurUnix createTServeurUnix(TServeurUnix tserveurunix);
*/
    ResponseEntity<TUnixServer> updateTServeurUnix(Long id, TUnixServer tserveurunixToUpdate);

    void delete(Long tid);


    TUnixServer save(TUnixServer tserveurUnixServer);


    List<String> getServeurunix();
    public TUnixServer getTUnixServerByName(String tserveurunix);
    public boolean exists(String email);
    public TUnixServer getTUnixServerById(Long id);

}

