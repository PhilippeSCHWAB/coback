package com.sample.postgress.mapper;

import com.sample.postgress.entity.TAccesAuxChaines;
import com.sample.postgress.entity.TEntity;
import com.sample.postgress.entity.TUser;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TEntityRowMapper implements RowMapper<TEntity> {


    @Override
    public TEntity mapRow(ResultSet rs, int arg1) throws SQLException {

        TEntity tentity = new TEntity();

        tentity.setId(rs.getInt("Id"));
        tentity.setEntite(rs.getString("Entite"));

        return tentity;
    }






}
