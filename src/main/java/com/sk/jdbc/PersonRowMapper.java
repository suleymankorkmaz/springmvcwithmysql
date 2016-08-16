package com.sk.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sk.model.Person;




public class PersonRowMapper implements RowMapper<Person>{
	
	@Override
    public Person mapRow(ResultSet resultSet, int line) throws SQLException {
        PersonExtractor userExtractor = new PersonExtractor();
        return userExtractor.extractData(resultSet);
    }

}
