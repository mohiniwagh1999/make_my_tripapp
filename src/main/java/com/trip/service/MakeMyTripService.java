package com.trip.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.trip.binding.Passenger;
import com.trip.binding.Ticket;

import reactor.core.publisher.Mono;

@Service
public class MakeMyTripService {
	
	private final String book_ticket_url="http://localhost:8081/ticket";
	private final String get_ticket_url="http://localhost:8081/tickets";
	
	
	//book ticket
	public Mono<Ticket> bookTicket(Passenger p)
	{
		//logic to send post request
		
		WebClient webClient=WebClient.create();
		return webClient.post()
		                .uri(book_ticket_url)
		                .body(BodyInserters.fromValue(p))
		                .retrieve()
		                .bodyToMono(Ticket.class);
		
	}
	
	//get all ticket
	public Mono<Ticket[]> getAllTicket()
	{
		//logic to get request
		WebClient webClient=WebClient.create();
		
		return webClient.post()
		                .uri(get_ticket_url)
		                .retrieve()
		                .bodyToMono(Ticket[].class);
		
		
	}

}
