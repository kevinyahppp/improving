package com.improving.improving.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// TODO: Auto-generated Javadoc
/**
 * The Class Reservation.
 * @author Kevin Garcia.
 */
@Entity
@Table(name = "reservations")

/**
 * Gets the time.
 *
 * @return the time
 */
@Getter 
 /**
  * Sets the time.
  *
  * @param time the new time
  */
 @Setter 
 /**
  * Instantiates a new reservation.
  */
 @NoArgsConstructor 
 /**
  * To string.
  *
  * @return the java.lang. string
  */
 @ToString
public class Reservation implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5341764209290028852L;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/** The name. */
	private String name;
	
	/** The time. */
	private LocalDateTime time;
	
}
