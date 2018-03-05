package rent.service.impl;

import rent.dao.FyDeleteDao;
import rent.service.FyDeleteService;

public class FyDeleteServiceImpl implements FyDeleteService {

	private FyDeleteDao fyDeleteDao;
	
	public FyDeleteDao getFyDeleteDao() {
		return fyDeleteDao;
	}

	public void setFyDeleteDao(FyDeleteDao fyDeleteDao) {
		this.fyDeleteDao = fyDeleteDao;
	}

	@Override
	public void delete(String fy_id) {
		// TODO Auto-generated method stub
		fyDeleteDao.delete(fy_id);
	}

}
