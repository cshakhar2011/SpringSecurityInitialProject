package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nt.entity.UserEntity;

@Repository
public interface UserRepository  extends JpaRepository<UserEntity, Integer>{

	@Query("select u from User_Entity u where u.userName =:userName")
	public UserEntity getUserByUserName(@Param("userName") String userName);
}
