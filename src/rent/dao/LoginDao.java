package rent.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import rent.model.AdminModel;
import rent.model.FdModel;

public class LoginDao {

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
	//管理员登录
	public AdminModel getAdminModel(String username,String password){
		String hql="from AdminModel a where a.loginName=:loginName and a.password=:password";
		Query query=getSession().createQuery(hql).setParameter("loginName",username).setParameter("password",password);
		return (AdminModel) query.uniqueResult();
	}
	//房东登录
	public FdModel getFdModel(String username,String password){
		String hql="from FdModel f where f.loginName=:username and f.password=:password";
		Query query=getSession().createQuery(hql).setParameter("username", username).setParameter("password", password);
		return (FdModel) query.uniqueResult();
	}
	
}
