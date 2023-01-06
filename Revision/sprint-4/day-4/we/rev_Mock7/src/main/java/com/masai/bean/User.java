package com.masai.bean;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
@Id	
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer UserId;
@Column(unique = true)
private String Email;
@Pattern(regexp = "[A-Za-z]",message = "First Name must not contain numbers or special characters")
private String FirstName;
@Pattern(regexp = "[A-Za-z]",message="Last Name must not contain numbers or special characters")
private String LastName;
@NotNull(message = "Phone number should not be null")
@Pattern(regexp="^[0-9]{10}",message="Mobile number must have 10 digits")
private String MobileNumber;
@Past(message = "The date of birth must be in the past")
private LocalDate DateOfBirth;
@Pattern(regexp = "^(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.[!@#&()–[{}]:;',?/*~$^+=<>]).{6,12}$", message = "Password should be alphanumeric and must contain 6-12 characters having at least one special character, one upper case, one lowercase, and one digit.")
private String password;


@JsonIgnore
@ManyToMany(cascade = CascadeType.ALL)
private Set<Event> events=new HashSet<>();

@Override
public int hashCode() {
	return UserId;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
    User other = (User) obj;
	return Objects.equals(Email, other.Email) && Objects.equals(FirstName, other.FirstName)
			&& Objects.equals(LastName, other.LastName) && Objects.equals(MobileNumber, other.MobileNumber);
}

}
