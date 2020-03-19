package com.sample.postgress.mapper;

import com.sample.postgress.entity.TOutilDeTest;
import com.sample.postgress.entity.TServerUnix;
import com.sample.postgress.entity.TUser;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TServerUnixRowMapper implements RowMapper<TServerUnix> {



    @Override
    public TServerUnix mapRow(ResultSet rs, int arg1) throws SQLException {

        TServerUnix tserverunix = new TServerUnix();

        tserverunix.setId(rs.getInt("Id"));
        tserverunix.setServeurunix(rs.getString("ServeurUnix"));

        return tserverunix;
    }



}
