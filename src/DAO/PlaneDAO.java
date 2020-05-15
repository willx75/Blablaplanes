package DAO;

import model.Plane;

import java.util.List;

public interface PlaneDAO {

    /**
     * @return List of planes
     */
    List<Plane> getPlanes();

    /**
     * find a plane giving her id
     * @param id
     * @return
     */
    Plane getPlane(int id);

    /**
     * Insert a new plan in the DB
     *
     * @param plane
     * @return The id of the new plane
     */
    int create(Plane plane);

    /**
     * Update a plane
     * @param plane
     */
    void update(Plane plane);

    /**
     * Delete a plane
     * @param plane
     */
    void delete(Plane plane);

}
