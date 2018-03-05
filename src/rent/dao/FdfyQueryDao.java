package rent.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import rent.util.Pager;

public class FdfyQueryDao {

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
	
	public Pager getcount(String fd_id,int pageNum,int pageSize){
		String hql="select f.title,f.price,f.method,f.createTime,w.position,w.metro,w.village,x.area,x.room,x.dinner,x.toliet,x.year,x.floor,x.direction,p.pic1,f.fy_id,f.fd_id from FyMainModel as f,FyfxModel as x,FywzModel as w,FyPicModel as p,FywtModel as t where f.fy_id=x.fy_id and f.fy_id=w.fy_id and f.fy_id=p.fy_id and f.fy_id=t.fy_id and f.fd_id like :fd_id and f.delflag='1' and f.flag='0' ";
		Query countQuery=getSession().createQuery(hql).setParameter("fd_id", fd_id);
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
	
	public List<Object> fdfyQuery(String fd_id,int pageNum,int pageSize){
		String hql="select f.title,f.price,f.method,f.createTime,w.position,w.metro,w.village,x.area,x.room,x.dinner,x.toliet,x.year,x.floor,x.direction,p.pic1,f.fy_id,t.reason from FyMainModel as f,FyfxModel as x,FywzModel as w,FyPicModel as p,FywtModel as t where f.fy_id=x.fy_id and f.fy_id=w.fy_id and f.fy_id=p.fy_id and f.fy_id=t.fy_id and f.delflag='1' and f.flag='0' and f.fd_id=:fd_id ";
		int fromIndex=pageSize*(pageNum-1);
		Query query=getSession().createQuery(hql).setParameter("fd_id", fd_id);
		query.setFirstResult(fromIndex);
		query.setMaxResults(pageSize);
		return query.getResultList();
	}
	
	public Pager gettgcount(String fd_id,int pageNum,int pageSize){
		String hql="select f.title,f.price,f.method,f.createTime,w.position,w.metro,w.village,x.area,x.room,x.dinner,x.toliet,x.year,x.floor,x.direction,p.pic1,f.fy_id,f.fd_id from FyMainModel as f,FyfxModel as x,FywzModel as w,FyPicModel as p,FywtModel as t where f.fy_id=x.fy_id and f.fy_id=w.fy_id and f.fy_id=p.fy_id and f.fy_id=t.fy_id and f.fd_id like :fd_id and f.delflag='1' and f.flag='1' ";
		Query countQuery=getSession().createQuery(hql).setParameter("fd_id", fd_id);
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
	
	public List<Object> fdtgfyQuery(String fd_id,int pageNum,int pageSize){
		String hql="select f.title,f.price,f.method,f.createTime,w.position,w.metro,w.village,x.area,x.room,x.dinner,x.toliet,x.year,x.floor,x.direction,p.pic1,f.fy_id,t.reason from FyMainModel as f,FyfxModel as x,FywzModel as w,FyPicModel as p,FywtModel as t where f.fy_id=x.fy_id and f.fy_id=w.fy_id and f.fy_id=p.fy_id and f.fy_id=t.fy_id and f.delflag='1' and f.flag='1' and f.fd_id=:fd_id ";
		int fromIndex=pageSize*(pageNum-1);
		Query query=getSession().createQuery(hql).setParameter("fd_id", fd_id);
		query.setFirstResult(fromIndex);
		query.setMaxResults(pageSize);
		return query.getResultList();
	}
}
