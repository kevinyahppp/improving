package com.improving.improving.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.improving.improving.models.Reservation;
import com.improving.improving.services.IReservationService;

// TODO: Auto-generated Javadoc
/**
 * The Class ReservationController.
 * @author Kevin Garcia.
 */
@RestController
public class ReservationController {

	/** The logger. */
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/** The reservation service. */
	@Autowired
	private IReservationService reservationService;
	
	/**
	 * List.
	 *
	 * @return the list
	 */
	@GetMapping("/reservations")
	@ResponseStatus(HttpStatus.OK)
	public List<Reservation> list() {

		logger.info("exec /list");
		
		return reservationService.findAll().stream().collect(Collectors.toList());
	}
	
}
