package com.jayway.jerseylab;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {

	private String author;
	private String title;
	private String id;
	
	public Book() {
	}
	
	public Book(String author, String title, String id) {
		this.author = author;
		this.title = title;
		this.id = id;
	}

	@XmlElement
	public String getAuthor() {
		return author;
	}

	@XmlElement
	public String getTitle() {
		return title;
	}

	@XmlElement
	public String getId() {
		return id;
	}
	
	
	
	
}
