package com.atromus.dms.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author ruzdi
 *
 */
@Document(collection = "users")
@JsonInclude(Include.NON_EMPTY)
public class User {
	
	@Id
    private String id;
    private String firstName;
    private String lastName;
    @JsonInclude(Include.NON_NULL)
    private String cellPhone;
    private String workPhone;
    
    @JsonInclude(Include.NON_EMPTY)
    private Address address;
    
    public User() {}
    
    
    public User(String id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
    
    public User(String id, String firstName, String lastName, String cellPhone, String workPhone, Address address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.cellPhone = cellPhone;
		this.workPhone = workPhone;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", cellPhone=" + cellPhone
				+ ", workPhone=" + workPhone + ", address=" + address + "]";
	}

}