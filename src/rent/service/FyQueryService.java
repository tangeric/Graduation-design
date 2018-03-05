package rent.service;

import java.util.List;

import rent.util.Pager;

public interface FyQueryService {

	public List<Object> getfyMain(String district,String room,String dinner,String toliet,int pageNum,int pageSize);

	public Pager getcount(String district,String room,String dinner,String toliet,int pageNum,int pageSize);
}
