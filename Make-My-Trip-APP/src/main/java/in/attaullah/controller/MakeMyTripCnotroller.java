package in.attaullah.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.attaullah.request.Passenger;
import in.attaullah.response.Ticket;
import in.attaullah.service.MakeMyTripService;
import java.util.List;

@Controller
public class MakeMyTripCnotroller {

    @Autowired
    private MakeMyTripService makeMyTRipService;


    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("passenger", new Passenger());

        return "index";

    }
    @GetMapping("/search")
    public String search(Model model) {

        model.addAttribute("ticket", new Ticket());

        return "search";

    }

    @PostMapping("/ticket")
    public String handleBookTicketBtn(Passenger passenger, Model model) {

        Ticket ticket = makeMyTRipService.bookTicket(passenger);
        model.addAttribute("ticket", ticket);

        return "View-Ticket";

    }

    @GetMapping("/tickets")
    public String viewTickets(Model model) {

        List <Ticket> tickets=makeMyTRipService.getAllTickets();

        model.addAttribute("tickets", tickets);

        return "data";

    }
    @PostMapping("/search-ticket")
    public String searchTicket(@RequestParam("ticketNo") Integer ticketNo,Model model) {

        Ticket ticket = makeMyTRipService.getTicket(ticketNo);

        model.addAttribute("ticket", ticket);

        return "search";

    }
}
