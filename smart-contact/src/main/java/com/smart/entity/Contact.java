package com.smart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact")
public class Contact {

	@Override
	public String toString() {
		return "contact [Cid=" + Cid + ", name=" + name + ", secondName=" + secondName + ", work=" + work + ", email="
				+ email + ", phone=" + phone + ", image=" + image + ", description=" + description + "]";
	}
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Cid;
	private String name;
	private String secondName;
	private String work;
	@Column(unique = true)
	private String email;
	private String phone;
	private String image;
	private String description;
	public Contact(int cid, String name, String secondName, String work, String email, String phone, String image,
			String description) {
		super();
		Cid = cid;
		this.name = name;
		this.secondName = secondName;
		this.work = work;
		this.email = email;
		this.phone = phone;
		this.image = image;
		this.description = description;
	}
	public Contact() {
		super();
	}
	

}
