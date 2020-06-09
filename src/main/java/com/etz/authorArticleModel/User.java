package com.etz.authorArticleModel;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;


@Entity
@Table(name = "mostactive_author")
@Data
public class User {	
	
	@Id
	@Column(name= "id")
	private int id;
	
	@Column(name= "username")
	private String username;
	
	@Column(name= "about")
	private String about;
	
	@Column(name= "submitted")
	private int submitted;
	
	@Column(name= "updated_at")
	private String updated_at;
	
	@Column(name= "submission_count")
	private int submission_count;
	
	@Column(name= "comment_count")
	private int comment_count;
	
	@Column(name= "created_at")
	private int created_at;
	
	
}
