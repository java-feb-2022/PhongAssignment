package com.phong.SoloProj.Models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity 
@Table(name="book")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message = "Book Name is required!")
	@Size(min = 5, max = 1000)
	private String booktitle;
	
	@NotEmpty(message = "Recommendation Yes/No")
	@Size(min = 2, max = 3)
	private String Recommend;
	
	
	@NotEmpty(message = "What's Great About It is required!")
	@Size(min = 5, max = 1000)
	private String whatsgreat;
	

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private User user;

	//upload image
	private String imgurl;  

	public String getImgurl() {
		return imgurl;
	}


	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getBooktitle() {
		return booktitle;
	}


	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}


	public String getRecommend() {
		return Recommend;
	}


	public void setRecommend(String recommend) {
		Recommend = recommend;
	}


	public String getWhatsgreat() {
		return whatsgreat;
	}


	public void setWhatsgreat(String whatsgreat) {
		this.whatsgreat = whatsgreat;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	 
 
	
	

}
