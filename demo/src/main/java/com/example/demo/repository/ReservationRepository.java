package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entity.Reservation;

@RepositoryRestResource
public interface ReservationRepository extends JpaRepository<Reservation, Long>
{
	
}
