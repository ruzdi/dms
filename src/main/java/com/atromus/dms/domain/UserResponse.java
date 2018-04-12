package com.atromus.dms.domain;

/**
 * @author ruzdi
 *
 */
public class UserResponse {
	
    private String id;
    private String firstName;
    private String lastName;
    private String cellPhone;
    private String workPhone;
    private AddressRequest address;
    
    public UserResponse() {}
    
    
    public UserResponse(String id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
    
    public UserResponse(String id, String firstName, String lastName, String cellPhone, String workPhone, AddressRequest address) {
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

	public AddressRequest getAddress() {
		return address;
	}

	public void setAddress(AddressRequest address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", cellPhone=" + cellPhone
				+ ", workPhone=" + workPhone + ", address=" + address + "]";
	}

}