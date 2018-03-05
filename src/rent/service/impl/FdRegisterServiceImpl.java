package rent.service.impl;

import rent.dao.FdRegisterDao;
import rent.service.FdRegisterService;

public class FdRegisterServiceImpl implements FdRegisterService {
	
	private FdRegisterDao fdRegisterDao;
	
	

	public FdRegisterDao getFdRegisterDao() {
		return fdRegisterDao;
	}

	public void setFdRegisterDao(FdRegisterDao fdRegisterDao) {
		this.fdRegisterDao = fdRegisterDao;
	}

	@Override
	public void savefywz(String fy_id,String district, String metro, String position, String village) {
		// TODO Auto-generated method stub
		fdRegisterDao.savefywz(fy_id,district, metro, position, village);
	}

	@Override
	public void savefyfx(String fy_id,int area, String room, int floor, String toliet, String year, String dinner,
			String direction) {
		// TODO Auto-generated method stub
		fdRegisterDao.savefyfx(fy_id,area, room, floor, toliet, year, dinner, direction);
	}



	@Override
	public void savefymain(String fy_id,String fd_id,String fypz, String method, String notice, String payMethod, String title, String fcz_pic,
			double price) {
		// TODO Auto-generated method stub
		fdRegisterDao.savefymain(fy_id,fd_id, fypz,method, notice, payMethod, title, fcz_pic, price);
	}

	@Override
	public void savepic(String fy_id,String pic1, String pic2, String pic3, String pic4, String pic5, String pic6) {
		// TODO Auto-generated method stub
		fdRegisterDao.savepic(fy_id,pic1, pic2, pic3, pic4, pic5, pic6);
	}

	@Override
	public void savewt(String fy_id) {
		// TODO Auto-generated method stub
		fdRegisterDao.savewt(fy_id);
	}

	
}
