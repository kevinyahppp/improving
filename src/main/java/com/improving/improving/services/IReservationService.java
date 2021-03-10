package com.improving.improving.services;

import java.util.List;

import com.improving.improving.models.Reservation;


// TODO: Auto-generated Javadoc
/**
 * The Interface IReservationService.
 * @author Kevin Garcia.
 */
public interface IReservationService {

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	List<Reservation> findAll();
	
	/**
	 * Find by id.
	 *
	 * @param id
	 * @return the reservation
	 */
	Reservation findById(Integer id);
	
	/**
	 * Save.
	 *
	 * @param reservation
	 * @return the reservation
	 */
	Reservation save(Reservation reservation);
	
	/**
	 * Delete by id.
	 *
	 * @param id
	 */
	void deleteById(Integer id);
}
