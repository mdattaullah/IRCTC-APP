package com.irctc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irctc.model.Ticket;

public interface TicketRepo  extends JpaRepository<Ticket, Integer>{

}
