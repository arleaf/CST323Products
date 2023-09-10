package com.gcu.data.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gcu.data.entity.UserEntity;

public class UserRowMapper implements RowMapper<UserEntity> {

    
    /** 
     * Maps the rows for the users
     * 
     * @param rs
     * @param rowNumber
     * @return UserEntity
     * @throws SQLException
     */
    @Override
    public UserEntity mapRow(ResultSet rs, int rowNumber) throws SQLException {
        return new UserEntity(rs.getString("username"),
                                rs.getString("password"),
                                rs.getBoolean("enabled"),
                                rs.getString("F_NAME"),
                                rs.getString("L_NAME"),
                                rs.getString("EMAIL"),
                                rs.getString("ADDRESS"),
                                rs.getString("PHONE"));
    }
}
