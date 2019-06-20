package com.javainuse.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.javainuse.dao.ItemsDao;
import com.javainuse.dao.UserDao;
import com.javainuse.model.Items;
import com.javainuse.model.Users;

@Service 
public class ItemsService { 
	
	private final ItemsDao itemdao;

	@Autowired
	public ItemsService(@Qualifier("ItemDaoQ") ItemsDao itemdao) {
		this.itemdao=itemdao;
	}
	
	public Items saveItem(Items item) {
		return itemdao.insertItem(item);
	}

	public List<Items>  getAllItems() {
		return itemdao.selectAllItems();
		
	}

	public Items findById(int itemid) {
		// TODO Auto-generated method stub
		return itemdao.findItemById(itemid);
	}

	public void delete(int itemid) {
		// TODO Auto-generated method stub
		itemdao.deleteItemById(itemid);
	}

	
	
	
	

}
