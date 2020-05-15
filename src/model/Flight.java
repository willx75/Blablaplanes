package model;

import java.time.LocalDateTime;

public class Flight {
    private int idFlight;
    private String commercialNumber;
    private String atcNumber;
    private Airport departureAirport;
    private LocalDateTime departureTime;
    private Airport arrivalAirport;
    private LocalDateTime arrivalTime;
    private Plane plane;
    private Crew crew;
    private String notamURL;
    private String ofpURL;
    private String weatherMapURL;

    public Crew getCrew() {
        return crew;
    }

    public void setCrew(Crew crew) {
        this.crew = crew;
    }

    public int getIdFlight() {
        return idFlight;
    }

    public void setIdFlight(int idFlight) {
        this.idFlight = idFlight;
    }

    public String getCommercialNumber() {
        return commercialNumber;
    }

    public void setCommercialNumber(String commercialNumber) {
        this.commercialNumber = commercialNumber;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getAtcNumber() {
        return atcNumber;
    }

    public void setAtcNumber(String atcNumber) {
        this.atcNumber = atcNumber;
    }

    public String getNotamURL() {
        return notamURL;
    }

    public void setNotamURL(String notamURL) {
        this.notamURL = notamURL;
    }

    public String getOfpURL() {
        return ofpURL;
    }

    public void setOfpURL(String ofpURL) {
        this.ofpURL = ofpURL;
    }

    public String getWeatherMapURL() {
        return weatherMapURL;
    }

    public void setWeatherMapURL(String weatherMapURL) {
        this.weatherMapURL = weatherMapURL;
    }
}
