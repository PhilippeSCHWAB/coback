package com.sample.postgress.Repositoy;


import com.sample.postgress.Model.TAccesAuxChaines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TAccesAuxChainesRepository extends JpaRepository<TAccesAuxChaines, Long> {


}

