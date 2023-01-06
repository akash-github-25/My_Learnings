package com.masai.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
public class User {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 @NotBlank
	 @Size(max = 20)
    private String username;
	 @NotBlank
	  @Size(max = 50)
	  @Email
    private String email;
	 @NotBlank
	  @Size(max = 120)
    private String password;
	 
    public User(@NotBlank @Size(max = 20) String username, @NotBlank @Size(max = 50) @Email String email,
			@NotBlank @Size(max = 120) String password) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
	}

	@ManyToMany(fetch = FetchType.LAZY)
    private Set<Role> roles = new HashSet<>();

}
