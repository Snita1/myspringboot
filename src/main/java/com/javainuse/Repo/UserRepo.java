package com.javainuse.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javainuse.model.Items;
import com.javainuse.model.Users;

public interface UserRepo extends JpaRepository<Users, Integer>{

	
	 
}
