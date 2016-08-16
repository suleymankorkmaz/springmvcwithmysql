package com.sk.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sk.jdbc.PersonRowMapper;
import com.sk.model.Person;


public class PersonDaoImp implements PersonDao{
	
		@Autowired
		DataSource dataSource;

		
	@Override
	public List<Person> getPersonList() {
			List<Person> personList=new ArrayList<Person>();
	        JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
	        String sql="select * from user";
	        personList=jdbcTemplate.query(sql,new PersonRowMapper());

	        return personList;
	}


	@Override
	public void delete(String id) {
		
		String sql="delete  from user where userid =" + id;
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
        jdbcTemplate.update(sql);

		
	}


	@Override
	public void insertData(Person person) {
		String sql="insert into user "+"(name,surname,email,telephone) values (?,?,?,?)";
	        JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
	        jdbcTemplate.update(sql,new Object[]{person.getName(),person.getSurname(),person.getEmail(),person.getPhoneNumber()});

	}


	@Override
	public void updatePerson(Person person) {
		
			String sql="update user set name=?,surname=?,email=?,telephone=? where userid=?";
	        JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
	        jdbcTemplate.update(sql,new Object[]{person.getName(),person.getSurname(),person.getEmail(),person.getPhoneNumber(),person.getPersonId()});
	    
		
	}
	
	
	
	@Override
	public Person getPerson(String id) {
		String sql = "SELECT * FROM user where userid = " + id;
		
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
		Person customer = (Person) jdbcTemplate.queryForObject(sql, new PersonRowMapper());
		
		
		return customer;
	}
	
}
