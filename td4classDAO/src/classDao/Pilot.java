package classDao;

public class Pilot {

	private String mail;
	private double experiences;
	private String certificate;

	public Pilot(String m,double exp,String cert) {
		mail = m;
		experiences = exp;
		certificate=cert;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String m) {
		mail = m;
	}

	public double getExperiences() {
		return experiences;
	}

	public void setExperiences(String m) {
		mail = m;
	}

}
