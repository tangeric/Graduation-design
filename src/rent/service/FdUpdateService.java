package rent.service;

import rent.model.FdModel;

public interface FdUpdateService {

	public void updatefdxx(String loginName,String phoneNumber,String realName,String idetityPic,String fd_id);
	
	public FdModel queryfdxx(String fd_id);
	
	public void updatepw(String password,String fd_id);
	
	public boolean checkpw(String password,String fd_id);
}
