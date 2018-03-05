package rent.service.impl;

import rent.dao.FyUpdateDao;
import rent.service.FyUpdateService;

public class FyUpdateServiceImpl implements FyUpdateService {

	
	private FyUpdateDao fyUpdateDao;
	
	
	public FyUpdateDao getFyUpdateDao() {
		return fyUpdateDao;
	}

	public void setFyUpdateDao(FyUpdateDao fyUpdateDao) {
		this.fyUpdateDao = fyUpdateDao;
	}

	@Override
	public void updateMain(String title, String notice, String fypz, String method, String paymethod,  String fy_id,
			double price) {
		// TODO Auto-generated method stub
		fyUpdateDao.updateMain(title, notice, fypz, method, paymethod, fy_id, price);
	}

	@Override
	public void updatefyfx(int area, String room, String dinner, String toliet, String year, int floor,
			String direction, String fy_id) {
		// TODO Auto-generated method stub
		fyUpdateDao.updatefyfx(area, room, dinner, toliet, year, floor, direction, fy_id);
	}

	@Override
	public void updatefywz(String district, String metro, String position, String village, String fy_id) {
		// TODO Auto-generated method stub
		fyUpdateDao.updatefywz(district, metro, position, village, fy_id);
	}

	@Override
	public void updatepic(String fy_id, String pic1, String pic2, String pic3, String pic4, String pic5, String pic6) {
		// TODO Auto-generated method stub
		fyUpdateDao.updatepic(fy_id, pic1, pic2, pic3, pic4, pic5, pic6);
	}

	@Override
	public void updatefcz(String fcz_pic, String fy_id) {
		// TODO Auto-generated method stub
		fyUpdateDao.updatefcz(fcz_pic, fy_id);
	}

	@Override
	public void updatepic1(String fy_id, String pic1) {
		// TODO Auto-generated method stub
		fyUpdateDao.updatepic1(fy_id, pic1);
	}

	@Override
	public void updatepic2(String fy_id, String pic2) {
		// TODO Auto-generated method stub
		fyUpdateDao.updatepic2(fy_id, pic2);
	}

	@Override
	public void updatepic3(String fy_id, String pic3) {
		// TODO Auto-generated method stub
		fyUpdateDao.updatepic3(fy_id, pic3);
	}

	@Override
	public void updatepic4(String fy_id, String pic4) {
		// TODO Auto-generated method stub
		fyUpdateDao.updatepic4(fy_id, pic4);
	}

	@Override
	public void updatepic5(String fy_id, String pic5) {
		// TODO Auto-generated method stub
		fyUpdateDao.updatepic5(fy_id, pic5);
	}

	@Override
	public void updatepic6(String fy_id, String pic6) {
		// TODO Auto-generated method stub
		fyUpdateDao.updatepic6(fy_id, pic6);
	}

	@Override
	public void updatewt(String fy_id) {
		// TODO Auto-generated method stub
		fyUpdateDao.updatewt(fy_id);
	}

	
}
