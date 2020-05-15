package InterfaceDao;

import classDao.Flight;
import classDao.Pilot;

public class FlightDAO extends DAO<Flight> {
	private DAOFactory daofactory;

	public FlightDAO(DAOFactory f) {

		daofactory = f;
	}

	@Override
	public boolean create(Flight obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Flight obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Flight obj) {
		// TODO Auto-generated method stub
		return false;
	}

	
}

