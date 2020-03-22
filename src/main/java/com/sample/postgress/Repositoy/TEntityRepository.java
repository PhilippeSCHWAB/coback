package com.sample.postgress.Repositoy;


import com.sample.postgress.Model.TAccesAuxChaines;
import com.sample.postgress.Model.TEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TEntityRepository extends JpaRepository<TEntity, Long> {


}

