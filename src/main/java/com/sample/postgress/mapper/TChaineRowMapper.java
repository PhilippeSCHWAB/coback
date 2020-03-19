package com.sample.postgress.mapper;

import org.springframework.jdbc.core.RowMapper;
import com.sample.postgress.entity.TChaine;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TChaineRowMapper implements RowMapper<TChaine> {

    @Override
    public TChaine mapRow(ResultSet rs, int arg1) throws SQLException {
        TChaine tchaine = new TChaine();

        tchaine.setNomdelachaine(rs.getString("Nomdelachaine"));
        tchaine.setShortname(rs.getString("shortname"));
        tchaine.setAccesauxchaines(rs.getString("accesauxchaines"));

        tchaine.setCodeenvironnement(rs.getString("codeenvironnement"));
        tchaine.setIbmexportpath(rs.getString("ibmexportpath"));
        tchaine.setBuildpath(rs.getString("buildpath"));

        tchaine.setRpmpath(rs.getString("rpmpath"));
        tchaine.setLangage(rs.getString("langage"));
        tchaine.setOutildetest(rs.getString("outildetest"));

        tchaine.setVersion(rs.getString("version"));
        tchaine.setSed(rs.getString("sed"));
        tchaine.setOptiondecimal(rs.getBoolean("optiondecimal"));

        tchaine.setOptionpmml(rs.getBoolean("optionpmml"));
        tchaine.setCallsed(rs.getString("callsed"));


        tchaine.setApplicationappelante(rs.getString("applicationappelante"));
        tchaine.setBusiness(rs.getString("business"));
        tchaine.setProd(rs.getBoolean("prod"));

        tchaine.setGroupe(rs.getString("groupe"));
        tchaine.setDatedecreation(rs.getTimestamp("datedecreation"));
        tchaine.setAuteurcreation(rs.getString("auteurcreation"));

        tchaine.setDatedemodification(rs.getTimestamp("datedemodification"));
        tchaine.setAuteurdemodification(rs.getString("auteurdemodification"));




        System.out.println("rowmapper :"+tchaine);
        return tchaine;
    }


}
