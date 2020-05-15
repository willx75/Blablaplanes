package classDao;

import java.awt.List;
import java.util.Arrays;

public class Flight {
	private String idFlight;
	private String date;
	private String Departure_airport;
	private String Arrival_airport;
	private double travelTime;
	private double price;
	private String Typeflight;
	private Plane plane;
	private Pilot pilot;

	java.util.List<Passenger> listPassenger;

	public Flight(String dt, String departAer, String arrivelAer, double p, double tratime, String tf, Plane pl,
			Pilot plt) {
		// TODO Auto-generated constructor stub

		date = dt;
		Departure_airport = departAer;
		Arrival_airport = arrivelAer;
		travelTime = tratime;
		price = p;
		Typeflight = tf;
		listPassenger = Arrays.asList(new Passenger[plane.getNumberplace()]);
		plane = pl;
		pilot = plt;

	}

	public String getidFlight() {
		return idFlight;
	}

	public void setidFlight(String m) {
		idFlight = m;
	}

	public String getdate() {
		return date;
	}

	public void setdate(String m) {
		date = m;
	}

	public String getDeparture_airport() {
		return Departure_airport;
	}

	public void setDeparture_airport(String m) {
		Departure_airport = m;
	}

	public String getArrival_airport() {
		return Arrival_airport;
	}

	public void setArrival_airport(String m) {
		Arrival_airport = m;
	}

	public double gettravelTime() {
		return travelTime;
	}

	public void settravelTime(double m) {
		travelTime = m;
	}

	public double getprice() {
		return price;
	}

	public void setprice(double m) {
		price = m;
	}

	public String getTypeflight() {
		return Typeflight;
	}

	public void setTypeflight(String m) {
		Typeflight = m;
	}

	public Plane getplane() {
		return plane;
	}

	public void setplane(Plane m) {
		plane = m;
	}

	public String getpilot() {
		return Typeflight;
	}

	public void setpilot(Pilot m) {
		pilot = m;
	}

	public java.util.List<Passenger> getlistPassenger() {
		return listPassenger;
	}

	public void setlistPassenger(java.util.List<Passenger> lp) {
		listPassenger = lp;
	}

	public void addPassenger(Passenger p) {

		if (!listPassenger.contains(p))

			listPassenger.add(p);

	}

	public void removePassenger(Passenger p) {

		this.listPassenger.remove(p);

	}

}
