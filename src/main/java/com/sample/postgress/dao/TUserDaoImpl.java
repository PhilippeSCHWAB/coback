package com.sample.postgress.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.List;



import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.sample.postgress.entity.TUser;
import com.sample.postgress.mapper.TUserRowMapper;

import javax.swing.*;


@Repository
public class TUserDaoImpl implements TUserDao{

    public TUserDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }
    NamedParameterJdbcTemplate template;

    @Override
    public List<TUser> findAll() {
        return template.query("select * from TUser", new TUserRowMapper());
    }


    @Override
    public void createTUser(TUser tuser) {
          final String sql = "insert into TUser(iud, nom, prenom, email, entite, ismanager, emailmanager, isadmin, accesauxchaines, serveurunix, loginunix, datedecreation, auteurcreation, datedemodification, auteurdemodification, refmyaccess) " +
                  "values(:tuserIud,:tuserNom,:tuserPrenom,:tuserEmail,:tuserEntite,:tuserIsManager,:tuserEmailManager,:tuserIsAdmin,:tuserAccesAuxChaines,:tuserServeurUnix,:tuserLoginUnix,:tuserDateDeCreation,:tuserAuteurCreation,:tuserDateDeModification,:tuserAuteurDeModification,:tuserRefMyAccess)";
        System.out.println(sql);
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()


                .addValue("tuserIud", tuser.getIud())
                .addValue("tuserNom", tuser.getNom())
                .addValue("tuserPrenom", tuser.getPrenom())
                .addValue("tuserEmail", tuser.getEmail())

                .addValue("tuserEntite", tuser.getEntite())
                .addValue("tuserIsManager", tuser.getIsmanager())
                .addValue("tuserEmailManager", tuser.getEmailmanager())
                .addValue("tuserIsAdmin", tuser.getIsadmin())
                .addValue("tuserAccesAuxChaines", tuser.getAccesauxchaines())


                .addValue("tuserServeurUnix", tuser.getServeurunix())
                .addValue("tuserLoginUnix", tuser.getLoginunix())
                .addValue("tuserDateDeCreation", tuser.getDatedecreation())
                .addValue("tuserAuteurCreation", tuser.getAuteurcreation())
                .addValue("tuserDateDeModification", tuser.getDatedemodification())

                .addValue("tuserAuteurDeModification", tuser.getAuteurdemodification())
                .addValue("tuserRefMyAccess", tuser.getRefmyaccess());

        template.update(sql,param, holder);


    }
/*
    @Override
    public void updateEmployee(Employee emp) {
        final String sql = "update employee set employeeName=:employeeName, employeeAddress=:employeeAddress, employeeEmail=:employeeEmail where employeeId=:employeeId";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("employeeId", emp.getEmployeeId())
                .addValue("employeeName", emp.getEmployeeName())
                .addValue("employeeEmail", emp.getEmployeeEmail())
                .addValue("employeeAddress", emp.getEmployeeAddress());
        template.update(sql,param, holder);

    }

    @Override
    public void executeUpdateEmployee(Employee emp) {
        final String sql = "update employee set employeeName=:employeeName, employeeAddress=:employeeAddress, employeeEmail=:employeeEmail where employeeId=:employeeId";


        Map<String,Object> map=new HashMap<String,Object>();
        map.put("employeeId", emp.getEmployeeId());
        map.put("employeeName", emp.getEmployeeName());
        map.put("employeeEmail", emp.getEmployeeEmail());
        map.put("employeeAddress", emp.getEmployeeAddress());

        template.execute(sql,map,new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });


    }
*/
    @Override
    public void deleteUser(String TUserIud) {
        System.out.println("tuserDaoImpl : " +TUserIud);
        final String sql = "delete  from tuser where iud= \'"+TUserIud+"\';" ;
        System.out.println("sql : " +sql);
     //   Map<String,Object> map=new HashMap<String,Object>();
     //    map.put("Iud", TUser.getIud());

        template.execute(sql,new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });
    }
/*
    @Override
    public  FilteredUser(String TUserIud) {
        System.out.println("tuserDaoImpl : " +TUserIud);
        final String sql = "select * from tuser WHERE iud=\'"+TUserIud+"\';" ;
        System.out.println("sql : " +sql);
            template.execute(sql,new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });
    }
*/

    @Override
    public List<TUser> findFiltered(String TUserIud)  {
        return template.query("select * from tuser WHERE iud=\'"+TUserIud+"\';", new TUserRowMapper());
    }

}
