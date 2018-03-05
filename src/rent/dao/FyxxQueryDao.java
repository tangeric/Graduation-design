package rent.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class FyxxQueryDao {

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
	public List<Object> getfyxx(String fy_id){
		String hql="select f.title,f.price,f.method,f.createTime,w.position,w.metro,w.village,x.area,x.room,x.dinner,x.toliet,x.year,x.floor,x.direction,p.pic1,f.fypz,f.notice,f.payMethod,w.District,p.pic2,p.pic3,p.pic4,p.pic5,p.pic6,f.fy_id,d.phoneNumber,d.idetityPic from FyMainModel as f,FyfxModel as x,FywzModel as w,FyPicModel as p,FdModel as d where f.fy_id=x.fy_id and f.fy_id=w.fy_id and f.fy_id=p.fy_id and f.fd_id=d.fd_id and f.delflag='1' and f.fy_id=:fy_id ";
		Query query=getSession().createQuery(hql).setParameter("fy_id", fy_id);
		return query.getResultList();
	}
}
