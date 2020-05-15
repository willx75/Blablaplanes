package DAO;

import model.Alert;
import model.User;

import java.time.LocalDateTime;
import java.util.List;

public interface AlertDAO {


    /**
     * List of all alerts
     * @return
     */
    List<Alert> getAlerts();

    /**
     * List of all alerts that were sent after a date
     * @param time
     * @return
     */
    List<Alert> getAlerts(LocalDateTime time);

    /**
     * List of all alerts that were sent to a specific user
     * @param user
     * @return
     */
    List<Alert> getAlerts(User user);

    /**
     * Get a specific alert from here id
     * @param id
     * @return
     */
    Alert getAlert(int id);


    /**
     * Insert an alert to the DB
     * @param alert
     * @return id
     */
    int create(Alert alert);

    /**
     * Update an alert
     * @param alert
     */
    void update(Alert alert);

    /**
     * Delete an alert
     * @param alert
     */
    void delete(Alert alert);
}

