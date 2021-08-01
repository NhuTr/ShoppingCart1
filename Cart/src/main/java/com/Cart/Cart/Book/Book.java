package com.Cart.Cart.Book;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.Cart.Cart.Cart;

@Entity
public class Book {
	
	private Integer id;
	private String name, author, genre,ISBN;
	@ManyToOne
	Cart cart;
	

	public Book(Integer id, String name, String author, String genre, String iSBN) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.genre = genre;
		ISBN = iSBN;
	}
	
	public Book() {
	
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	
	

}
