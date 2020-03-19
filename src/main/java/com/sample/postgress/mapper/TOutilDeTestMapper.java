package com.sample.postgress.mapper;

import com.sample.postgress.entity.TEntity;
import com.sample.postgress.entity.TOutilDeTest;
import com.sample.postgress.entity.TUser;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TOutilDeTestMapper implements RowMapper<TOutilDeTest> {

    @Override
    public TOutilDeTest mapRow(ResultSet rs, int arg1) throws SQLException {

        TOutilDeTest toutildetest = new TOutilDeTest();

        toutildetest.setId(rs.getInt("Id"));
        toutildetest.setOutildetest(rs.getString("Outildetest"));

        return toutildetest;
    }





}
