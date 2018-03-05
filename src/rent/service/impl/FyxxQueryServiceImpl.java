package rent.service.impl;

import java.util.List;

import rent.dao.FyxxQueryDao;
import rent.service.FyxxQueryService;

public class FyxxQueryServiceImpl implements FyxxQueryService  {
	
	private FyxxQueryDao fyxxQueryDao;
	

	public FyxxQueryDao getFyxxQueryDao() {
		return fyxxQueryDao;
	}


	public void setFyxxQueryDao(FyxxQueryDao fyxxQueryDao) {
		this.fyxxQueryDao = fyxxQueryDao;
	}


	@Override
	public List<Object> getfyxx(String fy_id) {
		// TODO Auto-generated method stub
		return fyxxQueryDao.getfyxx(fy_id);
	}

	
	

}
