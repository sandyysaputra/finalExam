package id.web.skyforce.bank.model;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	
	@Column(name="first_name", nullable=false, length=50)
	private String firstName;
	
	@Column(name="last_name", nullable=false, length=50)
	private String lastName;
	
	@Column(name="gender", nullable=false, length=1)
	private Character gender;
	
	@Column(name="birth_date")
	private Date birDate;
	
	@Column(name="id_number", nullable=false, length=20)
	private String idNumber;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private Set<Address> addresses = new HashSet<>();
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private Set<Account> accounts = new HashSet<>();
	
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Character getGender() {
		return gender;
	}
	public void setGender(Character gender) {
		this.gender = gender;
	}
	public Date getBirDate() {
		return birDate;
	}
	public void setBirDate(Date birDate) {
		this.birDate = birDate;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
	

}
