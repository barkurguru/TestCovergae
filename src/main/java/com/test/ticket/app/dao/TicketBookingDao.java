package com.test.ticket.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.test.ticket.app.entities.Ticket;

public interface TicketBookingDao extends CrudRepository<Ticket, Integer>{
	Ticket findByEmail(String email);
}
