package com.irctc.service;

import com.irctc.model.Ticket;
import com.irctc.request.Passenger;

public interface TicketService {
	
	
	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(Integer ticketNo);
	

}
