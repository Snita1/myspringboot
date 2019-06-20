package com.javainuse.dao;

import java.util.List;

import com.javainuse.model.Items;

public interface ItemsDao {
	Items insertItem(Items item);

	List<Items> selectAllItems();
		//String selectAllUsers();

	Items findItemById(int userid);

	void deleteItemById(int userid);

}
