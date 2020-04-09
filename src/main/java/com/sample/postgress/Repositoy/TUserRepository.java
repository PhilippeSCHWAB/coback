package com.sample.postgress.Repositoy;


import com.sample.postgress.Model.TUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TUserRepository extends JpaRepository<TUser, Long> {
  //  List<TUser> findFiltered(String tUserIud);
   /*
    @Query("SELECT tuser from TUser tuser WHERE tuser.iud= :TUserIud")
    List<TUser> findFiltered(String iud);
    */
}
