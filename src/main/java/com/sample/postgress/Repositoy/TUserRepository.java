package com.sample.postgress.Repositoy;


import com.sample.postgress.Model.TUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TUserRepository extends JpaRepository<TUser, Long> {

}
