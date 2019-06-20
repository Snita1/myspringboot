package com.javainuse.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Items")
public class Items implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "itemsid", nullable = false)
	private int itemsId;
	@Column(name = "itemscode", nullable = false)
	private String itemsCode;
	@Column(name = "itemsname", nullable = false)
	private String itemsName;


	

	public Items(String itemsCode, String itemsName) {

		this.itemsCode = itemsCode;
		this.itemsName = itemsName;
	}

	public Items(int itemsId, String itemsCode, String itemsName) {
		super();
		this.itemsId = itemsId;
		this.itemsCode = itemsCode;
		this.itemsName = itemsName;
	}

	public Items() {
		super();
	}

	public int getItemsId() {
		return itemsId;
	}

	public void setItemsId(int itemsId) {
		this.itemsId = itemsId;
	}

	public String getItemsCode() {
		return itemsCode;
	}

	public void setItemsCode(String itemsCode) {
		this.itemsCode = itemsCode;
	}

	public String getItemsName() {
		return itemsName;
	}

	public void setItemsName(String itemsName) {
		this.itemsName = itemsName;
	}
	@Override
	public String toString() {
		return "Items [itemsId=" + itemsId + ", itemsCode=" + itemsCode + ", itemsName=" + itemsName + "]";
	}

}
