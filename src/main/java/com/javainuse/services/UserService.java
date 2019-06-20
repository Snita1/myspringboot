package com.javainuse.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import com.javainuse.dao.UserDao;
import com.javainuse.model.Users;

@Service 
public class UserService { 
	
	private final UserDao userdao;

	@Autowired
	public UserService(@Qualifier("UserDaoQ") UserDao userdao) {
		this.userdao=userdao;
	}
	
	public Users saveUser(Users user) {
		return userdao.insertUser(user);
	}

	public List<Users>  getAllUsers() {
		return userdao.selectAllUsers();
		
	}

	public Users findById(int userid) {
		// TODO Auto-generated method stub
		return userdao.findById(userid);
	}

	public void delete(int userid) {
		// TODO Auto-generated method stub
		userdao.delete(userid);
	}
	
	
	

}
