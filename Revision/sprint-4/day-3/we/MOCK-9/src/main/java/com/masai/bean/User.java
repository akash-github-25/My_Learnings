package com.masai.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	@NotNull(message="First name cannot be null and cannot contain special Characters")
	@Pattern(regexp = "^[A-Za-z]*")
	private String firstName;
	@NotNull(message="Last name cannot be null and cannot contain special characters")
	@Pattern(regexp = "^[A-Za-z]*")
	private String lastName;
	@Pattern(regexp = "^[0-9]*", message = "Mobile number must have 10 digits")
	@Size(min = 10,max = 10)
	private String mobileNumber;
	private String address;
	@NotNull
	@Min(8)
	private Integer age;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
//	@Pattern(regexp = "^(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.[!@#&()–[{}]:;',?/*~$^+=<>]).{6,12}$", message = "Invalid Password pattern. Password must contain 6 to 12 characters at least one digit, lower, upper case and one special character.")
	private String password;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL,mappedBy="user")
	private List<Fir> firs=new ArrayList<>();
	
}
