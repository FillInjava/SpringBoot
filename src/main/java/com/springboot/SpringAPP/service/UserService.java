package com.springboot.SpringAPP.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.springboot.SpringAPP.dao.UserDao;
import com.springboot.SpringAPP.domain.User;

@Service
public class UserService {
	
	@Resource
	private UserDao userDao;
	
	@Transactional
	public void save(User user){
		userDao.save(user);
	}
	
	public User getById(int id){
		//等价于userRepository.findOne(id);
		return userDao.getById(id);
	};
}
