package model;

public class CrewMember extends User{
    private int idCrewMember;
    private String name;
    private Poste poste;

    enum Poste {
        CAPTAIN, FIRST_OFFICER, SECOND_OFFICIER, HOSTESS, STEWARD
    }

    public int getIdCrewMember() {
        return idCrewMember;
    }

    public void setIdCrewMember(int idCrewMember) {
        this.idCrewMember = idCrewMember;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Poste getPoste() {
        return poste;
    }

    public void setPoste(Poste poste) {
        this.poste = poste;
    }
}

