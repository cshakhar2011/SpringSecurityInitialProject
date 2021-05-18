package com.nt.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.UserEntity;
import com.nt.repository.UserRepository;
@Service
public class UserService {

	@Autowired(required=true)
	private EntityManager entityManager;
	
	@Autowired(required=true)
	private UserRepository userRepository;
	
	
	public List<UserEntity> getAllData() {
	
	
		return  this.userRepository.findAll() ;
	}


	







//	public String postDataIntDatabase(int id, String userName, String encode) {
//		
//	    
//	    	  Query query = entityManager.createNativeQuery("INSERT INTO user_entity (id, user_name, user_pass) VALUES (?,?,?)");
//	          query.setParameter("id",id);
//	          query.setParameter("user_name", userName);
//	          query.setParameter("user_pass", encode);
//	          query.executeUpdate();
//	    
//		return "Record is Updated...";
//	}


	
}
