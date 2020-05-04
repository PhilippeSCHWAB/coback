package com.sample.postgress.Repositoy;



import com.sample.postgress.Model.TEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TEntityRepository extends JpaRepository<TEntity, Long> {


        @Query("SELECT tentity FROM TEntity tentity where tentity.entite = :entity")
        List<TEntity> findAllEntite(String entity);
        @Query("SELECT distinct tentity.entite FROM TEntity tentity ")

        List<String> findAllEntite();



    }

