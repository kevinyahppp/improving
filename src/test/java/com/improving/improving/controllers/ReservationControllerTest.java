package com.improving.improving.controllers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.improving.improving.models.Reservation;
import com.improving.improving.services.IReservationService;

@ExtendWith(MockitoExtension.class)
public class ReservationControllerTest {

	@InjectMocks
	ReservationController reservationController;

	@Mock
	IReservationService reservationService;

	@Test
	public void list() {
		Reservation reservation = new Reservation();
		reservation.setId(1);
		reservation.setName("Reservation No. 1");
		reservation.setTime(LocalDateTime.now());

		Reservation reservation2 = new Reservation();
		reservation2.setId(2);
		reservation2.setName("Reservation No. 2");
		reservation2.setTime(LocalDateTime.now());

		List<Reservation> reservations = Arrays.asList(reservation, reservation2);

		when(reservationService.findAll()).thenReturn(reservations);

		List<Reservation> expectReservation = reservationController.list();

		assertThat(expectReservation.size()).isEqualTo(2);
		assertThat(expectReservation.get(0).getName()).isEqualTo(reservation.getName());
		assertThat(expectReservation.get(1).getName()).isEqualTo(reservation2.getName());
	}
}
