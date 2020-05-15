package InterfaceDao;

import classDao.Passenger;
import classDao.Plane;

public class PassengerDAO extends DAO<Passenger>{
	private DAOFactory daofactory;

	public PassengerDAO(DAOFactory f) {

		daofactory = f;
	}

	@Override
	public boolean create(Passenger obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Passenger obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Passenger obj) {
		// TODO Auto-generated method stub
		return false;
	}

	

	

}
