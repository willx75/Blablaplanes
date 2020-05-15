package DAO;

import model.Airport;

import java.util.List;

public interface AirportDAO {

    /**
     * @return List of all airports
     */
    List<Airport> getAirports();


    /**
     * @param airport
     * @return id of the new airport
     */
    int create(Airport airport);

    /**
     * @param id
     * @return The airport with  -the specified id
     */
    Airport getAirport(int id);


    /**
     * Update an airport
     * @param airport
     */
    void update(Airport airport);

    /**
     * Delete an airport from the database
     *
     * @param airport
     */
    void delete(Airport airport);


}
