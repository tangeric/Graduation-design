package rent.service.impl;

import rent.dao.FdUpdateDao;
import rent.model.FdModel;
import rent.service.FdUpdateService;

public class FdUpdateServiceImpl implements FdUpdateService {

	private FdUpdateDao fdUpdateDao;
	
	public FdUpdateDao getFdUpdateDao() {
		return fdUpdateDao;
	}

	public void setFdUpdateDao(FdUpdateDao fdUpdateDao) {
		this.fdUpdateDao = fdUpdateDao;
	}

	@Override
	public void updatefdxx(String loginName, String phoneNumber, String realName, String idetityPic,
			String fd_id) {
		// TODO Auto-generated method stub
		fdUpdateDao.updatefdxx(loginName, phoneNumber, realName, idetityPic, fd_id);
	}

	@Override
	public FdModel queryfdxx(String fd_id) {
		// TODO Auto-generated method stub
		return fdUpdateDao.queryfdxx(fd_id);
	}

	@Override
	public void updatepw(String password, String fd_id) {
		// TODO Auto-generated method stub
		fdUpdateDao.updatepw(password, fd_id);
	}

	@Override
	public boolean checkpw(String password, String fd_id) {
		// TODO Auto-generated method stub
		return fdUpdateDao.checkpw(password, fd_id);
	}

	
}
