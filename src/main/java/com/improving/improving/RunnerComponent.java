package com.improving.improving;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.improving.improving.dao.ReservationDao;
import com.improving.improving.models.Reservation;

// TODO: Auto-generated Javadoc
/**
 * The Class RunnerComponent.
 * 
 * @author Kevin Garcia.
 */
@Component
public class RunnerComponent implements CommandLineRunner {

	/** The logger. */
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	/** The reservation dao. */
	@Autowired
	private ReservationDao reservationDao;

	/**
	 * Run.
	 *
	 * @param args
	 * @throws Exception the exception
	 */
	@Override
	public void run(String... args) throws Exception {
		reservationDao.deleteAll();

		for (int i = 1; i <= 10; i++) {
			reservationDao.save(new Reservation("Reservation No. " + i, LocalDateTime.now()));
		}

		reservationDao.findAll().forEach(reservation -> {
			logger.info("{}", reservation);
		});
	}
}
