package com.javainuse.dao;

import java.util.List;

import com.javainuse.model.Users;


public interface UserDao{
	
	Users insertUser(Users user);

	List<Users> selectAllUsers();
		//String selectAllUsers();

	Users findById(int userid);

	void delete(int userid);

}
