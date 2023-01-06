package com.masai.bean;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Fir {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer FirId;
	private String crimeDetail;
//	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime timeStamp;
	private String policeStation;
	
	@ManyToOne
	private User user;
}
