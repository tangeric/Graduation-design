package rent.service.impl;

import java.util.List;

import rent.dao.FdxxQueryDao;
import rent.model.FdModel;
import rent.service.FdxxQueryService;

public class FdxxQueryServiceImpl implements FdxxQueryService {

	private FdxxQueryDao fdxxQueryDao;
	
	
	public FdxxQueryDao getFdxxQueryDao() {
		return fdxxQueryDao;
	}


	public void setFdxxQueryDao(FdxxQueryDao fdxxQueryDao) {
		this.fdxxQueryDao = fdxxQueryDao;
	}


	@Override
	public List<FdModel> fdxxQuery() {
		// TODO Auto-generated method stub
		return fdxxQueryDao.fdxxQuery();
	}
	
	public void fdxxDelete(String fd_id) {
		 fdxxQueryDao.fdxxDelete(fd_id);
	}

}
