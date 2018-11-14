package com.example.demo;

import java.util.stream.Stream;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Reservation;
import com.example.demo.repository.ReservationRepository;



@EnableDiscoveryClient
@IntegrationComponentScan
@EnableBinding(Sink.class)
@SpringBootApplication
public class DemoCloudApplication
{

	public static void main(String[] args) 
	{
		SpringApplication.run(DemoCloudApplication.class, args);
	}
	


}

@Component
class SampleDataCLR implements CommandLineRunner
{
	private final ReservationRepository reservationRepository;
	
	@Autowired
	public SampleDataCLR(ReservationRepository reservationRepository)
	{
		this.reservationRepository=reservationRepository;
	}

	@Override
	public void run(String... args) throws Exception
	{
		// TODO Auto-generated method stub
		Stream.of("Josh","Juerguen","Andrew","Bridget","Onsi","Phill","Sthepane","Cornelia")
		.forEach(name->reservationRepository.save(new Reservation(name)));
		reservationRepository.findAll().forEach(System.out::println);	
	}

}
