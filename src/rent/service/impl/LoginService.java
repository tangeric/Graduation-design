package rent.service.impl;

import rent.dao.LoginDao;
import rent.model.AdminModel;
import rent.model.FdModel;

public class LoginService {

	private LoginDao loginDao;

	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}
	
	public boolean checkAdminLogin(String username,String password){
		 return loginDao.getAdminModel(username, password)!=null;
	}
	
	public AdminModel getadmin(String username,String password){
		return loginDao.getAdminModel(username, password);
	}
	
	public FdModel getmodel(String username,String password){
		return loginDao.getFdModel(username, password);
	}
	
	public boolean checkFdLogin(String username,String password){
		 return loginDao.getFdModel(username, password)!=null;
	}
}
