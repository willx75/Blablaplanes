package DAO;

import model.Crew;
import model.CrewMember;
import model.Flight;

import java.time.LocalDateTime;
import java.util.List;

public interface FlightDAO {

    /**
     * List of all flights
     * @return
     */
    List<Flight> getFlights();


    /**
     * List of all flights that have a departure date after the giving date
     * @param time
     * @return
     */
    List<Flight> getFlights(LocalDateTime time);

    /**
     * List of all flights that have a giving person as a member of the crew
     * @param crewMember
     * @return
     */
    List<Flight> getFlights(CrewMember crewMember);

    /**
     * Get a flight with an id
     * @param id
     * @return
     */
    Flight getFlight(int id);

    /**
     * Insert a new flight into the DB
     * @param flight
     * @return
     */
    int create(Flight flight);

    /**
     * update a flight
     * @param flight
     */
    void update(Flight flight);

    /**
     * delete a flight
     * @param flight
     */
    void delete(Flight flight);
}
