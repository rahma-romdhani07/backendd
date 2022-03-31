package com.projet.stock.model;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Entity
@DiscriminatorValue(value="Admin")
public class Admin extends User {
	
	public Admin(String username, String email, String password  , String image) {
		super( username,  email,  password ,  image);
	}
	
	
	
	public Admin() {
		super();
	}
	

	
	public String getUsername(){
		return super.getUsername();
	}
	

	public void setUsername(){
		 super.setUsername(super.getUsername());
		 
	}
	public String getEmail(){
		return super.getEmail();
	}
	

	public void setEmail(){
		 super.setEmail(super.getEmail());
	}
	
	
	public String getUPassword(){
		return super.getPassword();
	}
	

	public void setPassword(){
		 super.setPassword(super.getPassword());
	}
	
	
	
	public String getImage(){
		return super.getImage();
	}
	

	public void setImage(){
		 super.setImage(super.getImage());
	}
	
	
}