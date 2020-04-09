package com.sample.postgress.Repositoy;


import com.sample.postgress.Model.TChaine;
import com.sample.postgress.Model.TUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TChaineRepository extends JpaRepository<TChaine, Long> {

}
