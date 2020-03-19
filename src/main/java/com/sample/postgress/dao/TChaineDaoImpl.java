package com.sample.postgress.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.sample.postgress.entity.TChaine;
import com.sample.postgress.mapper.TChaineRowMapper;

@Repository
public class TChaineDaoImpl implements TChaineDao{

    public TChaineDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }
    NamedParameterJdbcTemplate template;

    @Override
    public List<TChaine> findAll() {
        return template.query("select * from TChaine", new TChaineRowMapper());
    }


    @Override
    public void createTChain(TChaine tchaine) {

         //   final String sql = "insert into tchaine(nomdelachaine, shortname, outildetest, accesauxchaines, datedernieremodification, auteurdernieremodification)" +

        final String sql = "insert into tchaine (nomdelachaine, shortname, accesauxchaines, codeenvironnement, ibmexportpath, buildpath ,rpmpath, langage, outildetest, version, sed, optiondecimal, optionpmml, callsed, applicationappelante, business, prod, groupe, datedecreation, auteurcreation, datedemodification, auteurdemodification)"+

                " values(:tchaineNomdelachaine, :tchaineShortname, :tchaineAccesauxchaines, :tchaineCodeenvironnement, :tchaineIbmexportpath, :tchaineBuildpath ,:tchaineRpmpath, :tchaineLangage, :tchaineOutildetest, :tchaineVersion, :tchaineSed, :tchaineOptiondecimal, :tchaineOptionpmml, :tchaineCallsed, :tchaineApplicationappelante, :tchaineBusiness, :tchaineProd, :tchaineGroupe, :tchaineDatedecreation, :tchaineAuteurcreation, :tchaineDatedemodification, :tchaineAuteurdemodification)";

  //      " values(:tchaineNomdelachaine,:tchaineShortname,:tchaineOutildetest,:tchaineAccesauxchaines,:tchaineDatedernieremodification ,:tchaineAuteurdernieremodification)";
        System.out.println(sql);
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("tchaineNomdelachaine", tchaine.getNomdelachaine())
                .addValue("tchaineShortname", tchaine.getShortname())
                .addValue("tchaineAccesauxchaines", tchaine.getAccesauxchaines())

                .addValue("tchaineCodeenvironnement", tchaine.getCodeenvironnement())
                .addValue("tchaineIbmexportpath", tchaine.getIbmexportpath())
                .addValue("tchaineBuildpath", tchaine.getBuildpath())
                .addValue("tchaineRpmpath", tchaine.getRpmpath())


                .addValue("tchaineLangage", tchaine.getLangage())
                .addValue("tchaineOutildetest", tchaine.getOutildetest())
                .addValue("tchaineVersion", tchaine.getVersion())
                .addValue("tchaineSed", tchaine.getSed())
                .addValue("tchaineOptiondecimal", tchaine.getOptiondecimal())



                .addValue("tchaineOptionpmml", tchaine.getOptionpmml())
                .addValue("tchaineCallsed", tchaine.getCallsed())
                .addValue("tchaineApplicationappelante", tchaine.getApplicationappelante())
                .addValue("tchaineBusiness", tchaine.getBusiness())


                .addValue("tchaineProd", tchaine.getProd())
                .addValue("tchaineGroupe", tchaine.getGroupe())
                .addValue("tchaineDatedecreation", tchaine.getDatedecreation())
                .addValue("tchaineAuteurcreation", tchaine.getAuteurcreation())

                .addValue("tchaineDatedemodification", tchaine.getDatedecreation())
                .addValue("tchaineAuteurdemodification", tchaine.getAuteurdemodification());



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
    public void deleteTChaine(String ndlc) {
        final String sql = "delete from tchaine where Nomdelachaine= \'"+ndlc+"\';" ;
       // Map<String,Object> map=new HashMap<String,Object>();
        //map.put("tchaineNomdelachaine", tchaine.getNomdelachaine());

        template.execute(sql,new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });


    }

}
