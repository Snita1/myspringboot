package com.javainuse.daoImpl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javainuse.Repo.ItemRepo;
import com.javainuse.dao.ItemsDao;
import com.javainuse.model.Items;
import com.javainuse.model.Users;

@Repository("ItemDaoQ")
public class ItemDataAccessService implements ItemsDao {
	
	@Autowired
	ItemRepo itemRepo;

	List<Users> listUser=new ArrayList<>();
	@Override
	public Items insertItem(Items item) {
		//listUser.add(user);
		return itemRepo.save(item);
	}
	@Override
	public List<Items> selectAllItems() {

		//public String selectAllUsers() {
		//return listUser;
		return itemRepo.findAll();
	}
	@Override
	public Items findItemById(int itemid) {
		// TODO Auto-generated method stub
		return itemRepo.findOne(itemid);
	}
	@Override
	public void deleteItemById(int itemid) {
		// TODO Auto-generated method stub
		itemRepo.delete(itemid);
		
	}
	

}
