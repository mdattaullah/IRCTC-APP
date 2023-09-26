package in.attaullah.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import in.attaullah.request.Passenger;
import in.attaullah.response.Ticket;


@Service
public class MakeMyTripServiceImpl implements MakeMyTripService {

	@Override
	public Ticket bookTicket(Passenger passenger) {
		String apiUrl="http://localhost:8252/ticket";
		RestTemplate tr=new RestTemplate();
		ResponseEntity <Ticket> responseEntity=tr.postForEntity(apiUrl, passenger, Ticket.class);
		Ticket responseBody=responseEntity.getBody();

		// TODO Auto-generated method stub
		return responseBody;
	}

	@Override
	public List<Ticket> getAllTickets() {

		String apiUrl="http://localhost:8252/tickets";

		RestTemplate rt=new RestTemplate();

		ResponseEntity <Ticket[]> froEntity=rt.getForEntity(apiUrl, Ticket[].class);

		Ticket [] body=froEntity.getBody();

        List <Ticket> tickets= Arrays.asList(body);

		return tickets;
	}

	@Override
	public Ticket getTicket(Integer ticketNo) {

        String apiUrl="http://localhost:8252/ticket/{ticketNo}";

        RestTemplate rt=new RestTemplate();

        ResponseEntity<Ticket> forEntity = rt.getForEntity(apiUrl, Ticket.class, ticketNo);

        Ticket body= forEntity.getBody();

		return body;
	}

}
