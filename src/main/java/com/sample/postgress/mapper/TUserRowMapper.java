package com.sample.postgress.mapper;
import org.springframework.jdbc.core.RowMapper;

import com.sample.postgress.entity.TUser;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TUserRowMapper implements RowMapper<TUser> {



    @Override
    public TUser mapRow(ResultSet rs, int arg1) throws SQLException {

        TUser tuser = new TUser();

        tuser.setIud(rs.getString("Iud"));
        tuser.setNom(rs.getString("Nom"));
        tuser.setPrenom(rs.getString("Prenom"));

        tuser.setEmail(rs.getString("Email"));
        tuser.setEntite(rs.getString("Entite"));
        tuser.setIsmanager(rs.getBoolean("Ismanager"));

        tuser.setEmailmanager(rs.getString("Emailmanager"));
        tuser.setIsadmin(rs.getBoolean("Isadmin"));
        tuser.setAccesauxchaines(rs.getString("Accesauxchaines"));

        tuser.setServeurunix(rs.getString("Serveurunix"));
        tuser.setLoginunix(rs.getString("Loginunix"));
        tuser.setDatedecreation(rs.getTimestamp("Datedecreation"));
     System.out.println("ddddd"+rs.getTimestamp("Datedecreation"));
        tuser.setAuteurcreation(rs.getString("Auteurcreation"));

        tuser.setDatedemodification(rs.getTimestamp("Datedemodification"));
        tuser.setAuteurdemodification(rs.getString("Auteurdemodification"));

        tuser.setRefmyaccess(rs.getInt("Refmyaccess"));


        return tuser;
    }



}
