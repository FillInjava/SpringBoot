package com.springboot.SpringAPP.dao;

import org.springframework.data.repository.CrudRepository;
import com.springboot.SpringAPP.domain.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
