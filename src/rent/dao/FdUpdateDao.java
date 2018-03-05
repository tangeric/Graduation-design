package rent.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import rent.model.FdModel;

public class FdUpdateDao {

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
	
	public void updatefdxx(String loginName,String phoneNumber,String realName,String idetityPic,String fd_id){
		String hql="update FdModel d set d.loginName=:loginName,d.phoneNumber=:phoneNumber,d.realName=:realName,d.idetityPic=:idetityPic where fd_id=:fd_id";
		Query query=getSession().createQuery(hql).setParameter("loginName", loginName).setParameter("phoneNumber", phoneNumber).setParameter("realName", realName).setParameter("idetityPic", idetityPic).setParameter("fd_id", fd_id);
		query.executeUpdate();
	}
	
	public void updatepw(String password,String fd_id){
		String hql="update FdModel d set d.password=:password where fd_id=:fd_id";
		Query query=getSession().createQuery(hql).setParameter("password", password).setParameter("fd_id", fd_id);
		query.executeUpdate();
	}
	
	public FdModel queryfdxx(String fd_id){
		String hql="from FdModel d where d.fd_id=:fd_id";
		Query query=getSession().createQuery(hql).setParameter("fd_id", fd_id);
		return (FdModel) query.uniqueResult();
	}
	
	public boolean checkpw(String password,String fd_id){
		String hql="from FdModel d where d.fd_id=:fd_id and d.password=:password";
		Query query=getSession().createQuery(hql).setParameter("fd_id", fd_id).setParameter("password", password);
		return (FdModel) query.uniqueResult()==null;
	}
}
