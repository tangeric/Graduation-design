package rent.service;

import java.util.List;

import rent.util.Pager;

public interface FdfyQueryService {

	public List<Object> fdfyQuery(String fd_id,int pageNum,int pageSize);
	
	public Pager getcount(String fd_id,int pageNum,int pageSize);
	
	public Pager gettgcount(String fd_id,int pageNum,int pageSize);
	
	public List<Object> fdtgfyQuery(String fd_id,int pageNum,int pageSize);
}
