package rent.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import rent.model.FdModel;
import rent.util.StringUtil;

public class RegisterDao {

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
	public boolean checkRepeat(String username){
		String hql="from FdModel f where f.loginName =:username";
		Query query=getSession().createQuery(hql).setParameter("username", username);
		return (FdModel) query.uniqueResult()==null;
	}
	
	public void saveInfo(String username,String password,String phoneNumber,String realName,String idetityPic){
		
		FdModel fdModel=new FdModel();
		fdModel.setFd_id(StringUtil.getUUID());
		fdModel.setLoginName(username);
		fdModel.setPassword(password);
		fdModel.setPhoneNumber(phoneNumber);
		fdModel.setIdetityPic(idetityPic);
		fdModel.setRealName(realName);
		fdModel.setFlag("1");
		getSession().save(fdModel);
		
		}
		
}
