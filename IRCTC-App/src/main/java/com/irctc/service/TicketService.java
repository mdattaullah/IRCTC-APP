package com.irctc.service;

import java.util.List;

import com.irctc.model.Ticket;
import com.irctc.request.Passenger;

public interface TicketService {
	
	
	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(Integer ticketNo);
	
	public List<Ticket> getAllTickets();
	

}
