package com.sample.postgress.Repositoy;


import com.sample.postgress.Model.TTestTool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TTestToolRepository extends JpaRepository<TTestTool, Long> {
    @Query("SELECT toutildetest FROM TTestTool toutildetest where toutildetest.outildetest = :outildetest")
    List<TTestTool> findAllOutildetest(String outildetest);
    @Query("SELECT distinct toutildetest.outildetest FROM TTestTool toutildetest ")

    List<String> findAllOutildetest();


}

