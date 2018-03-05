package rent.service;

public interface FdRegisterService {

	public void savefywz(String fy_id,String district,String metro,String position,String village);
	
	public void savefyfx(String fy_id,int area,String room,int floor,String toliet,String year,String dinner,String direction);
	
	
	public void savefymain(String fy_id,String fd_id,String fypz,String method,String notice,String payMethod,String title,String fcz_pic,double price);
	
	public void savepic(String fy_id,String pic1,String pic2,String pic3,String pic4,String pic5,String pic6);

	public void savewt(String fy_id);
}
