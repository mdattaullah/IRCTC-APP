package com.irctc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.irctc.model.Ticket;
import com.irctc.request.Passenger;
import com.irctc.service.TicketService;

@RestController
public class TicketController {
	
	
	@Autowired
	private TicketService ticketService;
	
	@PostMapping( value="/ticket", consumes="application/json",produces="application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger){
		Ticket ticket= ticketService.bookTicket(passenger);
		return new ResponseEntity<> (ticket, HttpStatus.CREATED);
		
	}
	
	
	@GetMapping(value="/ticket/{ticketNo}",produces="application/json")
	public ResponseEntity<Ticket> getTicket(@PathVariable ("ticketNo")  Integer ticketNo){
		Ticket ticket=ticketService.getTicket(ticketNo);
		return new ResponseEntity<> (ticket, HttpStatus.OK);
		
	}

	
	
	
	
}
