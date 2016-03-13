package AutoWiringUsingAnnotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private String name;
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	////Autowired annotation on variable/setters is equivalent to autowire="byType"
	@Autowired//AutowiringByType
	//@Resource//AutoWiringByName
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
