package com.example.jetty_jersey.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.jetty_jersey.JwTokenHelper;
import com.example.jetty_jersey.DAO.DAOFactory;
import com.example.jetty_jersey.DAO.PassengerDAO;
import com.example.jetty_jersey.DAO.ReservationDAO;
import com.example.jetty_jersey.model.Connection;
import com.example.jetty_jersey.model.Flight;
import com.example.jetty_jersey.model.ID;
import com.example.jetty_jersey.model.Passenger;

@Path("/passengers")
public class PassengerRessource {

    private PassengerDAO daoPassenger = DAOFactory.getInstance().getPassengerDAO();
    private ReservationDAO daoReservation = DAOFactory.getInstance().getReservationDAO();

    @POST
    @Path("/get")
    public List<Passenger> getUser(ID identification) {
	return daoPassenger.get(identification.getId());
    }

    // Inscription
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/signup")
    public String signup(Passenger p) {
	if (daoPassenger.checkEmailExist(p.getMail())) {
	    return "{" + "\"status\":\"400\"," + "\"error\":\"Email already used\"" + "}";
	}
	return daoPassenger.put(p);
    }

    // Connexion
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/signin")
    public String signin(Connection c) {
	return daoPassenger.connect(c);
    }

    // Retourne la liste des vols dont la reservation a ete confirmer
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/myflight/confirmed")
    public List<Flight> getFlightReservationConfirmed(@HeaderParam("token") String token) {
	if (JwTokenHelper.getInstance().isTokenInvalid(token)
		|| !JwTokenHelper.getInstance().getUserType(token).equals("passenger")) {
	    return null;
	}
	String id = JwTokenHelper.getInstance().getIdFromToken(token);
	return daoReservation.getFlightForPassenger(id, "1");
    }

    // Retourne la liste des vols dont la reservation en attente de confirmation
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/myflight/waiting")
    public List<Flight> getFlightReservation(@HeaderParam("token") String token) {
	if (JwTokenHelper.getInstance().isTokenInvalid(token)
		|| !JwTokenHelper.getInstance().getUserType(token).equals("passenger")) {
	    return null;
	}
	String id = JwTokenHelper.getInstance().getIdFromToken(token);
	return daoReservation.getFlightForPassenger(id, "0");
    }

}