package com.abhishek.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


//@Entity annotation tells Hibernate that this is the object table that will be created, by default it has the table will have the same name 
// as that of the class name, suppose if we want to change that, then we can do it by the use of attributes


@Entity(name = "User_Details")
public class UserDetails {

	
//Similar to above case if we want to change the name of the column, then in that case we can use other annotation such as @Column
//Instead of using these annotations on the parameters we can also use these on the getter methods.	
	
	
	@Id
	@Column(name="User_Id")
	private int id;
	@Column(name = "User_Name")
	private String userName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
