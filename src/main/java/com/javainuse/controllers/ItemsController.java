package com.javainuse.controllers;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.javainuse.model.Items;
import com.javainuse.model.Users;
import com.javainuse.services.ItemsService;
import com.javainuse.services.UserService;

@Controller
public class ItemsController {

	private final static Logger LOGGER = Logger.getLogger(UserController.class.getName());
	@Autowired
	ItemsService itemService;

	@RequestMapping(value = "/Items")
	//@ResponseBody
	public ModelAndView getItems() {
		ModelAndView mv=new ModelAndView();
		List<Items> listItems=itemService.getAllItems();
		mv.addObject("Itemslist",listItems);
		mv.setViewName("items");
		return mv;

	}
	/*public List<Items> getItems() {

		return itemService.getAllItems();

	}*/
	
	@RequestMapping(value = "/Items/Add")
	@ResponseBody

	public Items addItems(@RequestBody Items item) {

		return itemService.saveItem(item);

	}

	@RequestMapping(value = "/Items/{itemid}")
	@ResponseBody
	public String getUserById(@PathVariable int itemid) {

		return itemService.findById(itemid).toString();

	}

	@RequestMapping(value = "/Items/Delete/{itemid}")
	@ResponseBody
	public List<Items> deleteUserById(@PathVariable int itemid) {

		itemService.delete(itemid);
		return itemService.getAllItems();
	}

	@RequestMapping(value = "/Items/Update/{itemid}")
	@ResponseBody
	public List<Items> updateUserById(@PathVariable int itemid) {

		Items item = itemService.findById(itemid);
		item.setItemsCode("New Code 1");
		item.setItemsName("itemsNamTech");
		itemService.saveItem(item);
		return itemService.getAllItems();
	}

}
