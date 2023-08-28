package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long booksid;
    
    private String title;
    
    @ManyToOne
    @JoinColumn(name="authorid",referencedColumnName = "authorid")
    private Author author;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	Books(){
		
	}

	public Books(Long booksid, String title, Author author) {
		super();
		this.booksid = booksid;
		this.title = title;
		this.author = author;
	}

	public Long getBooksid() {
		return booksid;
	}

	public void setBooksid(Long booksid) {
		this.booksid = booksid;
	}
    
    
}

