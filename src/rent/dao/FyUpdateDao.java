package rent.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class FyUpdateDao {

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
	
	public void updatefcz(String fcz_pic,String fy_id){
		String hql="update FyMainModel f set f.fcz_pic=:fcz_pic where f.fy_id=:fy_id";
		Query query=getSession().createQuery(hql).setParameter("fcz_pic",fcz_pic ).setParameter("fy_id", fy_id);
		query.executeUpdate();
	}
	
	public void updateMain(String title,String notice,String fypz,String method,String paymethod,String fy_id,double price){
		String hql="update FyMainModel f set f.title=:title, f.notice=:notice, f.fypz=:fypz,f.method=:method, f.payMethod=:paymethod,f.price=:price where f.fy_id=:fy_id";
		Query query=getSession().createQuery(hql).setParameter("title", title).setParameter("notice", notice).setParameter("method", method).setParameter("paymethod", paymethod).setParameter("fypz", fypz).setParameter("price", price).setParameter("fy_id", fy_id);
		query.executeUpdate();
	}
	
	public void updatefyfx(int area,String room,String dinner,String toliet,String year,int floor,String direction,String fy_id){
		String hql="update FyfxModel x set x.area=:area,x.room=:room,x.dinner=:dinner,x.toliet=:toliet,x.floor=:floor,x.direction=:direction,x.year=:year where x.fy_id=:fy_id";
		Query query=getSession().createQuery(hql).setParameter("area", area).setParameter("room", room).setParameter("dinner", dinner).setParameter("toliet", toliet).setParameter("year", year).setParameter("floor", floor).setParameter("direction", direction).setParameter("fy_id", fy_id);
		query.executeUpdate();
	}
	public void updatefywz(String district,String metro,String position,String village,String fy_id){
		String hql="update FywzModel w set w.District=:district,w.metro=:metro,w.position=:position,w.village=:village where w.fy_id=:fy_id";
		Query query=getSession().createQuery(hql).setParameter("district", district).setParameter("metro", metro).setParameter("position", position).setParameter("village", village).setParameter("fy_id", fy_id);
		query.executeUpdate();
	}
	public void updatepic(String fy_id,String pic1,String pic2,String pic3,String pic4,String pic5,String pic6){
		String hql="update FyPicModel p set p.pic1=:pic1, p.pic2=:pic2,p.pic3=:pic3,p.pic4=:pic4,p.pic5=:pic5,p.pic6=:pic6 where p.fy_id=:fy_id";
		Query query=getSession().createQuery(hql).setParameter("pic1", pic1).setParameter("pic2", pic2).setParameter("pic3", pic3).setParameter("pic4", pic4).setParameter("pic5", pic5).setParameter("pic6", pic6).setParameter("fy_id", fy_id);
		query.executeUpdate();
	}
	public void updatewt(String fy_id){
		String hql="update FywtModel t set t.Flag='1' where t.fy_id=:fy_id";
		Query query=getSession().createQuery(hql).setParameter("fy_id", fy_id);
		query.executeUpdate();
	}
	public void updatepic1(String fy_id,String pic1){
		String hql="update FyPicModel p set p.pic1=:pic1 where p.fy_id=:fy_id";
		Query query=getSession().createQuery(hql).setParameter("pic1", pic1).setParameter("fy_id", fy_id);
		query.executeUpdate();
	}
	public void updatepic2(String fy_id,String pic2){
		String hql="update FyPicModel p set p.pic2=:pic2 where p.fy_id=:fy_id";
		Query query=getSession().createQuery(hql).setParameter("pic2", pic2).setParameter("fy_id", fy_id);
		query.executeUpdate();
	}
	public void updatepic3(String fy_id,String pic3){
		String hql="update FyPicModel p set p.pic3=:pic3 where p.fy_id=:fy_id";
		Query query=getSession().createQuery(hql).setParameter("pic3", pic3).setParameter("fy_id", fy_id);
		query.executeUpdate();
	}
	public void updatepic4(String fy_id,String pic4){
		String hql="update FyPicModel p set p.pic4=:pic4 where p.fy_id=:fy_id";
		Query query=getSession().createQuery(hql).setParameter("pic4", pic4).setParameter("fy_id", fy_id);
		query.executeUpdate();
	}
	public void updatepic5(String fy_id,String pic5){
		String hql="update FyPicModel p set p.pic5=:pic5 where p.fy_id=:fy_id";
		Query query=getSession().createQuery(hql).setParameter("pic5", pic5).setParameter("fy_id", fy_id);
		query.executeUpdate();
	}
	public void updatepic6(String fy_id,String pic6){
		String hql="update FyPicModel p set p.pic6=:pic6 where p.fy_id=:fy_id";
		Query query=getSession().createQuery(hql).setParameter("pic6", pic6).setParameter("fy_id", fy_id);
		query.executeUpdate();
	}
}
