package DAO;

import model.CrewMember;

import java.util.List;

public interface CrewMemberDAO {

    /**
     * List of all crew member
     * @return
     */
    List<CrewMember> getAllCrewMember();

    /**
     * Find a crew member giving her id
     * @param id
     * @return
     */
    CrewMember getCrewMember(int id);

    /**
     * Insert a new Crew member in the DB
     * @param crewMember
     * @return
     */
    int create(CrewMember crewMember);

    /**
     * Update a crew member
     * @param crewMember
     */
    void update(CrewMember crewMember);

    /**
     * delete a crew member
     * @param crewMember
     */
    void delete(CrewMember crewMember);


}
