package InterfaceDao;

import classDao.Pilot;
import classDao.Plane;

public class PlaneDAO extends DAO<Plane>{
	private DAOFactory daofactory;

	public PlaneDAO(DAOFactory f) {

		daofactory = f;
	}

	@Override
	public boolean create(Plane obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Plane obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Plane obj) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
