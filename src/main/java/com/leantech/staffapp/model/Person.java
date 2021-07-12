package com.leantech.staffapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
@Table(name="PERSON")
public class Person {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotBlank
    @Size(min = 3, max = 50)
	@Column(name = "name")
	private String name;
	
    @NotBlank
    @Size(min = 3, max = 50)
    @Column(name = "last_name")
	private String lastName;
    
    @NotBlank
    @Size(min=3 , max =20)
    @Column(name = "cell_phone")
    private String cellPhone;
    
    @NotBlank
    @Size(min=3 , max =50)
    @Column(name = "address")
    private String address;

    @NotBlank
    @Size(min=3 , max =50)
    @Column(name = "city_name")
    private String cityName;
	
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


}
