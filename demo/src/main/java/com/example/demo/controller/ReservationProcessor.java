package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import com.example.demo.entity.Reservation;
import com.example.demo.repository.ReservationRepository;

@MessageEndpoint
public class ReservationProcessor 
{
	@Autowired
	private ReservationRepository reservationRepository;
	
	@ServiceActivator (inputChannel = Sink.INPUT)
	public void acceptNewReservation(String rn)
	{
		this.reservationRepository.save(new Reservation(rn));
	}
}
