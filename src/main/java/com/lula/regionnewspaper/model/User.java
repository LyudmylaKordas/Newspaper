package com.lula.regionnewspaper.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {

	@Id
    @Column(name="Id_User")
    @GeneratedValue
    private Integer idUser;
     
    @Column(name="FirstName", length=25)
    private String firstName;
    
    @Column(name="LastName", length=25)
    private String lastName;
    
    @Column(name="Login", length=25)
    private String login;

	@Column(name="Password", length=25)
    private String password;
    
    @Column(name="Email", length=25)
    private String email;
    
	@Column(name="Phone", length=25)
    private String phone;
    
    public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


}
