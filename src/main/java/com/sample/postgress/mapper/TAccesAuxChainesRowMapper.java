package com.sample.postgress.mapper;

import com.sample.postgress.entity.TAccesAuxChaines;
import com.sample.postgress.entity.TUser;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TAccesAuxChainesRowMapper implements RowMapper<TAccesAuxChaines> {



    @Override
    public TAccesAuxChaines mapRow(ResultSet rs, int arg1) throws SQLException {

        TAccesAuxChaines taccesauxchaines = new TAccesAuxChaines();

        taccesauxchaines.setId(rs.getInt("Id"));
        taccesauxchaines.setAccesauxchaines(rs.getString("Accesauxchaines"));

        return taccesauxchaines;
    }


}
