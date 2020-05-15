package com.sample.postgress.Repositoy;


import com.sample.postgress.Model.TUnixServer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TUnixServerRepository extends JpaRepository<TUnixServer, Long> {
    @Query("SELECT tserveurunix FROM TUnixServer tserveurunix where tserveurunix.serveurunix = :serveurunix")
    List<TUnixServer> findAllServeurunix(String serveurunix);
    @Query("SELECT distinct tserveurunix.serveurunix FROM TUnixServer tserveurunix ")

    List<String> findAllServeurunix();

    public   List<TUnixServer> findAll();

    public TUnixServer findByserveurunix(String serveurunix);

}

