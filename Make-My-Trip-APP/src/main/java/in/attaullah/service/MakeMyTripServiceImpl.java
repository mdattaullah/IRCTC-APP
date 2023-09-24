package in.attaullah.service;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.attaullah.request.Passenger;
import in.attaullah.response.Ticket;


@Service
public class MakeMyTripServiceImpl implements MakeMyTripService {

	@Override
	public Ticket BbookTicket(Passenger passenger) {
		String apiUrl="http://localhost:8272/ticket";
		RestTemplate tr=new RestTemplate();
		ResponseEntity <Ticket> responseEntity=tr.postForEntity(apiUrl, passenger, Ticket.class);
		Ticket responseBody=responseEntity.getBody();
		
		// TODO Auto-generated method stub
		return responseBody;
	}

	@Override
	public List<Ticket> getAllTickets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket getTicket(Integer ticketNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
