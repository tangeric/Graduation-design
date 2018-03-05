package rent.service;

public interface FyUpdateService {

	public void updatefcz(String fcz_pic,String fy_id);
	
	public void updateMain(String title,String notice,String fypz,String method,String paymethod,String fy_id,double price);
	
	public void updatefyfx(int area,String room,String dinner,String toliet,String year,int floor,String direction,String fy_id);
	
	public void updatefywz(String district,String metro,String position,String village,String fy_id);
	
	public void updatepic(String fy_id,String pic1,String pic2,String pic3,String pic4,String pic5,String pic6);
	
	public void updatepic1(String fy_id,String pic1);
	
	public void updatepic2(String fy_id,String pic2);
	
	public void updatepic3(String fy_id,String pic3);
	
	public void updatepic4(String fy_id,String pic4);
	
	public void updatepic5(String fy_id,String pic5);
	
	public void updatepic6(String fy_id,String pic6);
	
	public void updatewt(String fy_id);
}
