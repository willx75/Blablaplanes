package DAO;

import model.User;
import java.util.List;

public interface UserDAO {

    /**
     * List of all users
     *
     * @return
     */
    List<User> getUsers();


    /**
     * Find a user with username
     * @param username
     * @return
     */
    User getUser(String username);

    /**
     * Insert a new User into the DB
     * @param user
     * @return
     */
    int create(User user);

    /**
     * Update a user
     * @param user
     */
    void update(User user);

    /**
     * delete a user
     * @param user
     */
    void delete(User user);




}
