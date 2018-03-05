package rent.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import rent.model.FyMainModel;
import rent.model.FyPicModel;
import rent.model.FyfxModel;
import rent.model.FywtModel;
import rent.model.FywzModel;
import rent.util.StringUtil;

public class FdRegisterDao {
	private SessionFactory sf;
	
	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	public Session getSession(){
		return sf.getCurrentSession();
	}
	
	
	public void savefywz(String fy_id,String district,String metro,String position,String village){
		FywzModel fywz=new FywzModel();
		fywz.setFy_id(fy_id);
		fywz.setFywz_id(StringUtil.getUUID());
		fywz.setDistrict(district);
		fywz.setMetro(metro);
		fywz.setPosition(position);
		fywz.setVillage(village);
		getSession().save(fywz);
	}
	
	public void savepic(String fy_id,String pic1,String pic2,String pic3,String pic4,String pic5,String pic6){
		FyPicModel fypic=new FyPicModel();
		fypic.setFy_id(fy_id);
		fypic.setFytp_id(StringUtil.getUUID());
		fypic.setPic1(pic1);
		fypic.setPic2(pic2);
		fypic.setPic3(pic3);
		fypic.setPic4(pic4);
		fypic.setPic5(pic5);
		fypic.setPic6(pic6);
		getSession().save(fypic);
		
	}
	
	public void savefyfx(String fy_id,int area,String room,int floor,String toliet,String year,String dinner,String direction){
		FyfxModel fyfx=new FyfxModel();
		fyfx.setFy_id(fy_id);
		fyfx.setFx_id(StringUtil.getUUID());
		fyfx.setArea(area);
		fyfx.setDinner(dinner);
		fyfx.setDirection(direction);
		fyfx.setFloor(floor);
		fyfx.setRoom(room);
		fyfx.setToliet(toliet);
		fyfx.setYear(year);
		getSession().save(fyfx);
	}
	
	
	public void savefymain(String fy_id,String fd_id,String fypz,String method,String notice,String payMethod,String title,String fcz_pic,double price){
		FyMainModel fymain =new FyMainModel();
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
		String createTime= sdf.format(date);
		fymain.setFy_id(fy_id);
		fymain.setFd_id(fd_id);
		fymain.setCreateTime(createTime);
		fymain.setMethod(method);
		fymain.setNotice(notice);
		fymain.setPayMethod(payMethod);
		fymain.setTitle(title);
		fymain.setPrice(price);
		fymain.setFypz(fypz);
		fymain.setFcz_pic(fcz_pic);
		fymain.setFlag("0");
		fymain.setDelflag("1");
		getSession().save(fymain);
	}
	public void savewt(String fy_id){
		FywtModel wt=new FywtModel();
		wt.setFlag("1");
		wt.setFy_id(fy_id);
		wt.setFywt_id(StringUtil.getUUID());
		getSession().save(wt);
	}
}
