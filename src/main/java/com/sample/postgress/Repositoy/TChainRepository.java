package com.sample.postgress.Repositoy;


import com.sample.postgress.Model.TChain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TChainRepository extends JpaRepository<TChain, Long> {

}
