package com.springboot.SpringAPP.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.springboot.SpringAPP.dao.UserRepository;
import com.springboot.SpringAPP.domain.User;

@Service
public class SpringdataService {
	@Resource
	private UserRepository userRepository;
	
	@Transactional
	public void save(User user){
		userRepository.save(user);
	}
}
