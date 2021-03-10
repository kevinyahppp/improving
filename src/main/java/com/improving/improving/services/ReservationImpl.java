package com.improving.improving.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.improving.improving.dao.ReservationDao;
import com.improving.improving.models.Reservation;

// TODO: Auto-generated Javadoc
/**
 * The Class ReservationImpl.
 * @author Kevin Garcia.
 */
@Service
public class ReservationImpl implements IReservationService {
	
	/** The reservation dao. */
	@Autowired
	private ReservationDao reservationDao;

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	@Override
	@Transactional
	public List<Reservation> findAll() {
		return (List<Reservation>) reservationDao.findAll();
	}

	/**
	 * Find by id.
	 *
	 * @param id
	 * @return the reservation
	 */
	@Override
	@Transactional
	public Reservation findById(Integer id) {
		return reservationDao.findById(id).get();
	}

	/**
	 * Save.
	 *
	 * @param reservation
	 * @return the reservation
	 */
	@Override
	public Reservation save(Reservation reservation) {
		return reservationDao.save(reservation);
	}

	/**
	 * Delete by id.
	 *
	 * @param id
	 */
	@Override
	public void deleteById(Integer id) {
		reservationDao.deleteById(id);
	}

}
