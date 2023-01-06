package com.masai.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Driver {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer driverId;
	
	@NotNull(message="First Name must not contain numbers or special characters")
	@Pattern(regexp="^[A-Z][a-z]*")
	private String firstName;
	@Pattern(regexp="^[A-Z][a-z]*")
	private String lastName;
	@Pattern(regexp = "^[0-9]*", message = "Mobile number must have 10 digits")
	@Size(min = 10,max = 10)
	private String mobileNumber;
	private Integer[] currentPosition;
	
	
	@JsonIgnore
	@OneToOne
    private User user;
	
}
