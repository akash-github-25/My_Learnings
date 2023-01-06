package com.masai.bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnore;

//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//import jakarta.validation.constraints.AssertFalse.List;
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
	@Column(unique = true)	
private String Email;
@Pattern(regexp = "^[a-zA-Z]}",message = "Firstname must contain a special character and must not be empty")
@NotNull(message ="Firstname should not be empty")
private String firstName;
@Pattern(regexp = "^[a-zA-Z]",message="Lastname must contain  a special character and must not be empty")
@NotNull(message ="LastName should not be empty")
private String lastName;
@NotNull(message = "Phone number should not be null")
@Pattern(regexp="^[0-9]{10}",message="Enter a 10 digit mobile number")
private String mobileNumber;
@Past(message = "Date of birth should be in future")
private LocalDate dateOfBirth;
private String password;

@JsonIgnore
@OneToMany(cascade = CascadeType.ALL)
List<Mail> mails=new ArrayList<>();


}
