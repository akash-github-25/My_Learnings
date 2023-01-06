package com.masai.bean;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Event {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer eventId;
private LocalDate startDate;
private LocalDate endDate;
private String startTime;
private String endTime;

@ManyToMany(cascade = CascadeType.ALL,mappedBy="events")
private Set<User> users=new HashSet<>();

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Event other = (Event) obj;
	return Objects.equals(endDate, other.endDate) && Objects.equals(endTime, other.endTime)
			&& Objects.equals(eventId, other.eventId) && Objects.equals(startDate, other.startDate)
			&& Objects.equals(startTime, other.startTime) && Objects.equals(users, other.users);
}

@Override
public int hashCode() {
	return Objects.hash(endDate, endTime, eventId, startDate, startTime, users);
}



}
