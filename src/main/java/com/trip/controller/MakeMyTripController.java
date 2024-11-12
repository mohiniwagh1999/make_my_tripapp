package com.trip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.trip.binding.Passenger;
import com.trip.binding.Ticket;
import com.trip.service.MakeMyTripService;

import reactor.core.publisher.Mono;

@Controller
public class MakeMyTripController {
	
	@Autowired
	private MakeMyTripService service;
	
	@PostMapping("/booking")
	public ResponseEntity<Mono<Ticket>> BookMyTicket(@RequestBody Passenger p)
	{
		Mono<Ticket> bookTicket = service.bookTicket(p);
		return new ResponseEntity<>(bookTicket,HttpStatus.CREATED) ;
	}
	
	
	@GetMapping("/allticket")
	public  ResponseEntity<Mono<Ticket[]>> getMyAllTicket()
	{
		Mono<Ticket[]> allTicket = service.getAllTicket();
		return new  ResponseEntity<>(allTicket,HttpStatus.OK);
	}

}
