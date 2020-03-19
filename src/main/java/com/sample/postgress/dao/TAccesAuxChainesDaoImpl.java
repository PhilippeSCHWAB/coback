package com.sample.postgress.dao;

import com.sample.postgress.entity.Employee;
import com.sample.postgress.entity.TAccesAuxChaines;
import com.sample.postgress.mapper.EmployeeRowMapper;
import com.sample.postgress.mapper.TAccesAuxChainesRowMapper;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TAccesAuxChainesDaoImpl  implements TAccesAuxChainesDao{



    public TAccesAuxChainesDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }
    NamedParameterJdbcTemplate template;

    @Override
    public List<TAccesAuxChaines> findAll() {
        return template.query("select * from taccesauxchaines", new TAccesAuxChainesRowMapper());
    }


    @Override
    public void createTAccesAuxChaines(TAccesAuxChaines taccesauxchaines) {
        final String sql = "insert into taccesauxchaines(id ,accesauxchaines) values (:taccesauxchainesId,:taccesauxchainesAccesAuxChaines)";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("taccesauxchainesId", taccesauxchaines.getId())
                .addValue("taccesauxchainesAccesAuxChaines", taccesauxchaines.getAccesauxchaines());

        template.update(sql,param, holder);

    }
    /*
 */
/*
    @Override
    public void updateTAccesAuxChaines(TAccesAuxChaines taccesauxchaines) {
        final String sql = "update TAccesAuxChaines set id=:taccdesauxchainesid where taccesauxchainesId=:taccesauxchainesId";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("taccesauxchainesId", taccesauxchaines.getId())
                .addValue("taccesauxchainesName", taccesauxchaines.getAccesauxchaines())

        template.update(sql,param, holder);

    }


    @Override
    public void deleteTAccesAuxChaines(String TAccesAuxChainesId) {
        System.out.println("tuserDaoImpl : " +TAccesAuxChainesId);
        final String sql = "delete  from tuser where iud= \'"+TAccesAuxChainesId+"\';" ;
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
    }


