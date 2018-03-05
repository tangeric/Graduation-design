package rent.service.impl;

import java.util.List;

import rent.dao.AdminDao;
import rent.service.AdminService;
import rent.util.Pager;

public class AdminServiceImpl implements AdminService {

	private AdminDao adminDao;
	
	
	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	@Override
	public Pager getcount(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return adminDao.getcount(pageNum, pageSize);
	}

	@Override
	public List<Object> adminquery(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return adminDao.adminquery(pageNum, pageSize);
	}

	@Override
	public void check(String fy_id) {
		// TODO Auto-generated method stub
		adminDao.check(fy_id);
	}

	@Override
	public void savewt(String fy_id, String admin_id, String reason) {
		// TODO Auto-generated method stub
		adminDao.savewt(fy_id, admin_id, reason);
	}

	@Override
	public void updatewt(String reason, String fy_id) {
		// TODO Auto-generated method stub
		adminDao.updatewt(reason, fy_id);
	}

	@Override
	public List<Object> getfyxx(String fy_id) {
		// TODO Auto-generated method stub
		return adminDao.getfyxx(fy_id);
	}
	
	

}
