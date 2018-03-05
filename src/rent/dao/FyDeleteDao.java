package rent.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class FyDeleteDao {

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
	public void delete(String fy_id){
		String hql="update FyMainModel f set delflag='0' where f.fy_id=:fy_id";
		Query query=getSession().createQuery(hql).setParameter("fy_id", fy_id);
		query.executeUpdate();
	}
}
