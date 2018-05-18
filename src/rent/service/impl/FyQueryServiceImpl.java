package rent.service.impl;

import java.util.List;

import rent.dao.FyQueryDao;
import rent.service.FyQueryService;
import rent.util.Pager;

public class FyQueryServiceImpl implements FyQueryService {
	
	private FyQueryDao fyQueryDao;
	
	

	public FyQueryDao getFyQueryDao() {
		return fyQueryDao;
	}



	public void setFyQueryDao(FyQueryDao fyQueryDao) {
		this.fyQueryDao = fyQueryDao;
	}

	

	@Override
	public Pager getcount(String title,String district, String room, String dinner, String toliet, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return fyQueryDao.getcount(title,district, room, dinner, toliet, pageNum, pageSize);
	}



	@Override
	public List<Object> getfyMain(String title,String district,String room,String dinner,String toliet,int pageNum,int pageSize) {
		// TODO Auto-generated method stub
		return fyQueryDao.getfyMain(title,district,room,dinner,toliet,pageNum,pageSize);
	}
	
}
