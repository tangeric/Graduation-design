package rent.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import rent.model.FywtModel;
import rent.util.Pager;
import rent.util.StringUtil;

public class AdminDao {

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
		String hql="select f.title,f.price,f.method,f.createTime,w.position,w.metro,w.village,x.area,x.room,x.dinner,x.toliet,x.year,x.floor,x.direction,p.pic1,f.fypz,f.notice,f.payMethod,w.District,p.pic2,p.pic3,p.pic4,p.pic5,p.pic6,f.fy_id,d.phoneNumber,d.idetityPic,f.fcz_pic from FyMainModel as f,FyfxModel as x,FywzModel as w,FyPicModel as p,FdModel as d where f.fy_id=x.fy_id and f.fy_id=w.fy_id and f.fy_id=p.fy_id and f.fd_id=d.fd_id and f.fy_id=:fy_id ";
		Query query=getSession().createQuery(hql).setParameter("fy_id", fy_id);
		return query.getResultList();
	}
	
	public Pager getcount(int pageNum,int pageSize){
		String hql="select f.title,f.price,f.method,f.createTime,w.position,w.metro,w.village,x.area,x.room,x.dinner,x.toliet,x.year,x.floor,x.direction,p.pic1,f.fy_id from FyMainModel as f,FyfxModel as x,FywzModel as w,FyPicModel as p where f.fy_id=x.fy_id and f.fy_id=w.fy_id and f.fy_id=p.fy_id and f.delflag='1' and f.flag='0' ";
		Query countQuery=getSession().createQuery(hql);
		List<?> countResult=countQuery.list();
		int totalRecord=countResult.size();
		System.out.println("共有"+totalRecord+"条记录");
		int totalPage=totalRecord/pageSize;
		if(totalPage%pageSize!=0){
			totalPage++;
		}
		Pager page=new Pager(pageSize, pageNum,totalRecord, totalPage);
		
		return page;
	}
	
	public List<Object> adminquery(int pageNum,int pageSize){
		String hql="select f.title,f.price,f.method,f.createTime,w.position,w.metro,w.village,x.area,x.room,x.dinner,x.toliet,x.year,x.floor,x.direction,p.pic1,f.fy_id,t.Flag from FyMainModel as f,FyfxModel as x,FywzModel as w,FyPicModel as p,FywtModel as t where f.fy_id=x.fy_id and f.fy_id=w.fy_id and f.fy_id=p.fy_id and f.fy_id=t.fy_id and f.delflag='1' and f.flag='0' ";
		int fromIndex=pageSize*(pageNum-1);
		Query query=getSession().createQuery(hql);
		query.setFirstResult(fromIndex);
		query.setMaxResults(pageSize);
		return query.getResultList();
	}
	public void check(String fy_id){
		String hql="update FyMainModel f set flag='1' where f.fy_id=:fy_id";
		Query query=getSession().createQuery(hql).setParameter("fy_id", fy_id);
		query.executeUpdate();
	}
	public void savewt(String fy_id,String admin_id,String reason){
		FywtModel wt=new FywtModel();
		wt.setAdmin_id(admin_id);
		wt.setFlag("1");
		wt.setFy_id(fy_id);
		wt.setFywt_id(StringUtil.getUUID());
		wt.setReason(reason);
		getSession().save(wt);
	}
	
	public void updatewt(String reason,String fy_id){
		String hql="update FywtModel t set t.reason=:reason,t.Flag='0' where t.fy_id=:fy_id";
		Query query=getSession().createQuery(hql).setParameter("reason", reason).setParameter("fy_id", fy_id);
		query.executeUpdate();
	}
}
