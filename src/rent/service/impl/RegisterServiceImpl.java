package rent.service.impl;

import rent.dao.RegisterDao;
import rent.service.RegisterService;

public class RegisterServiceImpl implements RegisterService {

	private RegisterDao registerDao;
	
	
	public RegisterDao getRegisterDao() {
		return registerDao;
	}


	public void setRegisterDao(RegisterDao registerDao) {
		this.registerDao = registerDao;
	}

    public boolean checkname(String username){
		return registerDao.checkRepeat(username);
    	
    }
	@Override
	public void saveInfo(String username,String password,String phoneNumber,String realName,String idetityPic) {
		// TODO Auto-generated method stub
		 registerDao.saveInfo(username, password,phoneNumber,realName,idetityPic);
	}

}
