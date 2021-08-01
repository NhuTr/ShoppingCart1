package com.Cart.Cart;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.Cart.Cart.Book.Book;
import com.Cart.Cart.User.User;

@Entity
@Table(name = "cart_item")
public class Cart {
	private Integer cart_id;
	private String book_id;
	private String user_id;
	private Integer quantity;
	
	//@ManyToOne
	//@JoinColumn(name = "book_id")
	//private Book book;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id",
	 referencedColumnName = "user_id"
	)
	private User user;
	
	
	public Cart() {

	}
	
	public Cart(String book_id, String user_id, Integer quantity) {
		this.book_id = book_id;
		this.user_id = user_id;
		this.quantity = quantity;
	}

	public Cart(Integer cart_id, String book_id, String user_id, Integer quantity) {
		this.cart_id = cart_id;
		this.book_id = book_id;
		this.user_id = user_id;
		this.quantity = quantity;
	}
	
	public Cart(String book_id, String user_id, Integer quantity, Book book, User user) {
		
		this.book_id = book_id;
		this.user_id = user_id;
		this.quantity = quantity;
		//this.book = book;
		this.user = user;
	}
	

	//public Cart(String book_id, String user_id, Integer quantity, Book book) {
		//this.book_id = book_id;
		//this.user_id = user_id;
		//this.quantity = quantity;
		//this.book = book;
	//}
	

	@Override
	public String toString() {
		return "Cart [cart_id=" + cart_id + ", book_id=" + book_id + ", user_id=" + user_id + ", quantity=" + quantity
				+ "]";
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getCart_id() {
		return cart_id;
	}
	public void setCart_id(Integer cart_id) {
		this.cart_id = cart_id;
	}
	public String getBook_id() {
		return book_id;
	}
	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	//public Book getBook() {
	//	return book;
	//}

	//public void setBook(Book book) {
	//	this.book = book;
	//}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public void assignUser(User user){
	    this.user = user;
	  }

	

	
	
	
	
	

	
}
