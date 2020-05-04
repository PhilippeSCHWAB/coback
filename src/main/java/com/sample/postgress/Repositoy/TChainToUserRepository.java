package com.sample.postgress.Repositoy;


import com.sample.postgress.Model.TChainToUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TChainToUserRepository extends JpaRepository<TChainToUser, Long> {

}
