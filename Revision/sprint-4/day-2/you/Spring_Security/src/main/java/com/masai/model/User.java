package com.masai.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class User {
	@Id
	@GeneratedValue
private Integer id;
private String name;
private String username;
private String password;
@ElementCollection
@Column(name="role")
private Set<String> roles;
}
