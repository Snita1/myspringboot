package com.javainuse.daoImpl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javainuse.Repo.UserRepo;
import com.javainuse.dao.UserDao;
import com.javainuse.model.Users;

@Repository("UserDaoQ")
public class UserDataAccessService implements UserDao {
	
	@Autowired
	UserRepo userRepo;

	List<Users> listUser=new ArrayList<>();
	@Override
	public Users insertUser(Users user) {
		//listUser.add(user);
		return userRepo.save(user);
	}
	@Override
	public List<Users> selectAllUsers() {

		//public String selectAllUsers() {
		//return listUser;
		return userRepo.findAll();
	}
	@Override
	public Users findById(int userid) {
		// TODO Auto-generated method stub
		return userRepo.findOne(userid);
	}
	@Override
	public void delete(int userid) {
		// TODO Auto-generated method stub
		userRepo.delete(userid);
		
	}
	

}
