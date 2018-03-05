package rent.service;

import java.util.List;

import rent.util.Pager;

public interface AdminService {

	public Pager getcount(int pageNum,int pageSize);
	
	public List<Object> adminquery(int pageNum,int pageSize);
	
	public void check(String fy_id);
	
	public void savewt(String fy_id,String admin_id,String reason);
	
	public void updatewt(String reason,String fy_id);
	
	public List<Object> getfyxx(String fy_id);
}
