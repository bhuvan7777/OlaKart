package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {
	
	@Id
	private String category_name;
	private int category_id;
	
	
	
	
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(String category_name, int category_id) {
		super();
		this.category_name = category_name;
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	@Override
	public String toString() {
		return "Category [category_name=" + category_name + ", category_id=" + category_id + "]";
	}
	
	
	

}
