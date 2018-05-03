package rent.service;

import java.util.List;

import rent.model.FdModel;

public interface FdxxQueryService {

	public List<FdModel> fdxxQuery();
	
	public List<FdModel> delfdxxQuery();
	
	public void fdxxDelete(String fd_id);
	
	public List<Object> adminfyquery();
	
	public List<Object> deletefyquery();
	
	public void fdxxrecover(String fd_id);
	
}
