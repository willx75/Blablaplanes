package DAO;

import model.Crew;

import java.util.List;

public interface CrewDAO {

    /**
     * List of all cerws
     * @return
     */
    List<Crew> getCrews();


    /**
     * Find a crew with an id
     * @param id
     * @return
     */
    Crew getCrew(int id);


    /**
     * Insert a new crew into the DB
     * @param crew
     * @return
     */
    int create(Crew crew);


    /**
     * Update a crew
     * @param crew
     */
    void update(Crew crew);

    /**
     * delete a crew
     * @param crew
     */
    void delete(Crew crew);
}
