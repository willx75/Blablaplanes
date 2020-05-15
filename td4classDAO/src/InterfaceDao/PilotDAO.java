package InterfaceDao;

import classDao.Pilot;

public class PilotDAO extends DAO<Pilot> {
	private DAOFactory daofactory;

	public PilotDAO(DAOFactory f) {

		daofactory = f;
	}

	@Override
	public boolean create(Pilot obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Pilot obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Pilot obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
