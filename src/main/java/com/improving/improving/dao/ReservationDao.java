package com.improving.improving.dao;

import org.springframework.data.repository.CrudRepository;

import com.improving.improving.models.Reservation;

/**
 * The Interface ReservationDao.
 * @author Kevin Garcia.
 */
public interface ReservationDao extends CrudRepository<Reservation, Integer> {

}
