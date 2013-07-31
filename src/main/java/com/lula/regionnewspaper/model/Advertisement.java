package com.lula.regionnewspaper.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name="ADVERTISEMENT")
public class Advertisement {
	@Id
    @Column(name="Id_Advertisement")
    @GeneratedValue
    private Integer idAdvertisement;
	
	
	@Column(name="Caption",length=100)
	@NotEmpty
    private String caption;
	
    @ManyToOne
    @NotFound(action=NotFoundAction.IGNORE)
    @JoinColumn(name="Id_Category")
    private Category category;
    
	@Column(name="UserName", length=50)
    private String userName;
    
	@Column(name="EmailFeedback", length=30)
    private String emailFeedback;
	
	@Column(name="Phone", length=15)
    private String phone;
	
	@Column(name="Text",length=500)
	@NotEmpty
    private String text;
	
	@Column(name="Date")
    private Date date;

	public Integer getIdAdvertisement() {
		return idAdvertisement;
	}

	public void setIdAdvertisement(Integer idAdvertisement) {
		this.idAdvertisement = idAdvertisement;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailFeedback() {
		return emailFeedback;
	}

	public void setEmailFeedback(String emailFeedback) {
		this.emailFeedback = emailFeedback;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
