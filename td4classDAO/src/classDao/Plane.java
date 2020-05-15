package classDao;

public class Plane {
	private int idplane;
	private String modele;
	private String name;
	private int numberplace;
	

	public Plane(int nbP, String md, String nm) {
		numberplane = nbP;
		modele = md;
		name = nm;

	}
	
	public int getNumberplane() {
		return numberplane;
	}

	public void setNumberplane(int numberplane) {
		this.numberplane = numberplane;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String m) {
		modele = m;
	}

	public String getName() {
		return name;
	}

	public void setName(String m) {
		name = m;
	}

	public int getNumberplace() {
		return numberplace;
	}

	public void setNumberplace(int numberplace) {
		this.numberplace = numberplace;
	}

}
