package InterfaceDao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
//classe d'instanciation de toute les dao et connection a la bdd
public class DAOFactory {

	private static final String FILE_PROPERTIES = "/interfaceDao/dao.properties";

	private static final String PROPERTY_URL = "url";

	private static final String PROPERTY_DRIVER = "driver";

	private static final String PROPERTY_NAME_user = "nameuser";

	private static final String PROPERTY_Password = "pass";

	private String url;

	private String username;

	private String password;

	DAOFactory(String url, String username, String password) {

		this.url = url;

		this.username = username;

		this.password = password;

	}

	/*
	 * 
	 * Méthode chargée de récupérer les informations de connexion à la base de
	 * 
	 * données, charger le driver JDBC et retourner une instance de la Factory
	 * 
	 */

	public static DAOFactory getInstance() throws Exception {

		Properties properties = new Properties();

		String url;

		String driver;

		String nomUtilisateur;

		String motDePasse;

		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

		InputStream fileProperties = classLoader.getResourceAsStream(FILE_PROPERTIES);

		if (fileProperties == null) {

			throw new Exception("Le fichier properties " + FILE_PROPERTIES + " est introuvable.");

		}

		try {

			properties.load(fileProperties);

			url = properties.getProperty(PROPERTY_URL);

			driver = properties.getProperty(PROPERTY_DRIVER);

			nomUtilisateur = properties.getProperty(PROPERTY_NAME_user);

			motDePasse = properties.getProperty(PROPERTY_Password);

		} catch (IOException e) {

			throw new Exception("Impossible de charger le fichier properties " + FILE_PROPERTIES);

		}

		try {

			Class.forName(driver);

		} catch (ClassNotFoundException e) {

			throw new Exception("Le driver est introuvable dans le classpath.");

		}

		DAOFactory instance = new DAOFactory(url, nomUtilisateur, motDePasse);

		return instance;

	}

	/* Méthode chargée de fournir une connexion à la base de données */

	Connection getConnection() throws SQLException {

		return DriverManager.getConnection(url, username, password);

	}

	/*
	 * 
	 * Méthodes de récupération de l'implémentation des différents DAO
	 * 
	 */

	public DAO getPiloteDAO() {

		return new PilotDAO(this);

	}
	
	public DAO getPlaneDAO() {

		return new PlaneDAO(this);

	}
	
	public DAO getPassengerDAO() {
		return new PassengerDAO(this);
	}
	
	public DAO getFlightDAO() {
		return new FlightDAO(this);
	}

}