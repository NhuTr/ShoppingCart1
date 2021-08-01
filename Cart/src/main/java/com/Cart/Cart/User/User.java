package com.Cart.Cart.User;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.Cart.Cart.Cart;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="user" )
public class User {
	private int user_id;
	private String userName, password, name, address;
	
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUsername(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public User(int user_id, String userName, String password, String name, String address, Set<Cart> cart) {
		super();
		this.user_id = user_id;
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.address = address;
		this.cart = cart;
	}
	public User() {

	}
	@JsonIgnore
	@OneToOne (
			mappedBy= "cart_item"
			)
	private Set<Cart> cart =new HashSet<>();



	@Override
	public String toString() {
		return "Users [id=" + user_id + ", username=" + userName + ", password=" + password + ", name=" + name + ", address="
				+ address + ", cart=" + cart + "]";
	}
	
	
	
	
	
	

}