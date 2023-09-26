package in.attaullah.service;

import java.util.List;

import in.attaullah.request.Passenger;
import in.attaullah.response.Ticket;

public interface MakeMyTripService {

	public Ticket bookTicket(Passenger passenger);

	public  List<Ticket> getAllTickets();

	public Ticket getTicket(Integer ticketNo);

}

