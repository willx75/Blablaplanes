package model;

import java.util.List;

public class Crew {
    private List<CrewMember> crewMembers;

    public List<CrewMember> getCrewMembers() {
        return crewMembers;
    }

    public void setCrewMembers(List<CrewMember> crewMembers) {
        this.crewMembers = crewMembers;
    }
}
