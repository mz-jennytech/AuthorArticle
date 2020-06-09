package com.etz.authorArticleModel;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

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
	@CreationTimestamp
    private LocalDateTime updated_at;
	
	@Column(name= "submission_count")
	private int submission_count;
	
	@Column(name= "comment_count")
	private int comment_count;
	
	@Column(name= "created_at")
	@CreationTimestamp
    private LocalDateTime createdAt;

	public User(int id, String username, String about, int submitted, LocalDateTime updated_at, int submission_count,
			int comment_count, LocalDateTime created_at) {
		
		this.id = id;
		this.username = username;
		this.about = about;
		this.submitted = submitted;
		this.updated_at = updated_at;
		this.submission_count = submission_count;
		this.comment_count = comment_count;
		this.createdAt = created_at;
	}
	
	
	
	
}
