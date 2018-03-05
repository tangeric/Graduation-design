package rent.service.impl;

import java.util.List;

import rent.dao.FdfyQueryDao;
import rent.service.FdfyQueryService;
import rent.util.Pager;

public class FdfyQueryServiceImpl implements FdfyQueryService {

	private FdfyQueryDao fdfyQueryDao;
	
	public FdfyQueryDao getFdfyQueryDao() {
		return fdfyQueryDao;
	}

	public void setFdfyQueryDao(FdfyQueryDao fdfyQueryDao) {
		this.fdfyQueryDao = fdfyQueryDao;
	}

	@Override
	public List<Object> fdfyQuery(String fd_id,int pageNum,int pageSize) {
		// TODO Auto-generated method stub
		return fdfyQueryDao.fdfyQuery(fd_id,pageNum,pageSize);
	}

	@Override
	public Pager getcount(String fd_id, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return fdfyQueryDao.getcount(fd_id, pageNum, pageSize);
	}

	@Override
	public Pager gettgcount(String fd_id, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return fdfyQueryDao.gettgcount(fd_id, pageNum, pageSize);
	}

	@Override
	public List<Object> fdtgfyQuery(String fd_id, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return fdfyQueryDao.fdtgfyQuery(fd_id, pageNum, pageSize);
	}

	
}
