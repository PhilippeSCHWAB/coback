package com.sample.postgress.Repositoy;


import com.sample.postgress.Model.TOutilDeTest;
import com.sample.postgress.Model.TServeurUnix;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TOutilDeTestRepository extends JpaRepository<TOutilDeTest, Long> {


}

