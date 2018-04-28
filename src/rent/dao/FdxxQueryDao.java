package rent.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import rent.model.FdModel;

public class FdxxQueryDao {

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
	public List<FdModel> fdxxQuery() {
		String hql="from FdModel d where d.flag=1";
		Query query=getSession().createQuery(hql);
		return query.getResultList();
	}
	public void fdxxDelete(String fd_id) {
		String hql="update FdModel d set d.flag='0' where f.fd_id=:fd_id";
		Query query=getSession().createQuery(hql).setParameter("fd_id", fd_id);
		query.executeUpdate();
	}
	public List<Object> adminfyquery(){
		String hql="select f.title,f.price,f.method,f.createTime,f.flag,w.District,p.pic1,f.fy_id,d.loginName from FyMainModel as f,FywzModel as w,FyPicModel as p,FdModel as d where f.fy_id=w.fy_id and f.fy_id=p.fy_id and f.fd_id=d.fd_id and f.delflag='1' ";
		Query query=getSession().createQuery(hql);
		return query.getResultList();
	}
}
