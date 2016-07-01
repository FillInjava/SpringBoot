package com.springboot.SpringAPP.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class BookMark {
	@ManyToOne
	@JsonIgnore
	private Account account;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String uri;
	private String description;
	
	public BookMark() {
		
	}
	public BookMark(Account account,String uri,String description) {
		this.account = account;
		this.uri = uri;
		this.description = description;
	}
	public Account getAccount() {
		return account;
	}
	public Long getId() {
		return id;
	}
	public String getUri() {
		return uri;
	}
	public String getDescription() {
		return description;
	}
	
	
	
}
