

/*
package com.sample.postgress.Repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.postgress.entity.TUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface TUserRepository extends JpaRepository<TUser>,{

        @Query("SELECT DISTINCT tuser FROM Tuser tuser  where reviews.note >= :lowest and reviews.note <= :highest")
        List<TUser> findAllByReviewsNoteBetween(Integer lowest, Integer highest);

    }
*/


