package com.springboot.SpringAPP.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springboot.SpringAPP.domain.User;

@Repository
public class UserDao {
	
	@Resource
	private JdbcTemplate jdbcTemplate;
	
	public User getById(int id){
		String sql = "select *from User where id=?";
		
		RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class); 
		
		return jdbcTemplate.queryForObject(sql, rowMapper, id);
	};
}
