package in.attaullah.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.attaullah.request.Passenger;
import in.attaullah.response.Ticket;
import in.attaullah.service.MakeMyTripService;

@Controller
public class MakeMyTripCnotroller {
	
	@Autowired
	private MakeMyTripService makeMyTRipService;
	
	
	@GetMapping("/")
	public String index(Model model) {
		
		model.addAttribute("passenger", new Passenger());
		
		return "index";
		
	}
	
	@PostMapping("/ticket")
	public String handleBookTicketBtn(@ModelAttribute ("Passenger") Passenger passenger , Model model){
		
		Ticket ticket=makeMyTRipService.BbookTicket(passenger);
		model.addAttribute("ticket" ,ticket);
		
		return "View-Ticket";
		
	}
	
	
	
	

}
