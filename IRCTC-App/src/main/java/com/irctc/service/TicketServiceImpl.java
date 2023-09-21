package com.irctc.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctc.model.Ticket;
import com.irctc.repo.TicketRepo;
import com.irctc.request.Passenger;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepo ticketRepo;

	@Override
	public Ticket bookTicket(Passenger passenger) {

		Ticket ticket = new Ticket();
		BeanUtils.copyProperties(passenger, ticket);
		ticket.setTicketPrice(1990);
		ticket.setTicketStatus("Confirmed");
		ticket = ticketRepo.save(ticket);
		return ticket;
	}

	@Override
	public Ticket getTicket(Integer ticketNo) {
		Optional <Ticket> findById= ticketRepo.findById(ticketNo);
		if(findById.isPresent()){
			return findById.get();
			
		}
		// TODO Auto-generated method stub
		return null;
	}

}
