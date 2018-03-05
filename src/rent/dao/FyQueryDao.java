package rent.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import rent.model.FyMainModel;
import rent.util.Pager;

public class FyQueryDao {
	
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
	
	public Pager getcount(String district,String room,String dinner,String toliet,int pageNum,int pageSize){
		StringBuilder countHql=new StringBuilder("select f.title,f.price,f.method,f.createTime,w.position,w.metro,w.village,x.area,x.room,x.dinner,x.toliet,x.year,x.floor,x.direction,p.pic1 from FyMainModel as f,FyfxModel as x,FywzModel as w,FyPicModel as p where f.fy_id=x.fy_id and f.fy_id=w.fy_id and f.fy_id=p.fy_id and f.delflag='1' and f.flag='1'");
		if(district!=null&&!district.equals("")){
			countHql.append(" and w.District like :district");
		}
		if(room!=null&&!room.equals("")){
			countHql.append(" and x.room like :room");
		}
		if(dinner!=null&&!dinner.equals("")){
			countHql.append(" and x.dinner like :dinner");
		}
		if(toliet!=null&&!toliet.equals("")){
			countHql.append(" and x.toliet like :toliet");
		}
		
		Query countQuery=getSession().createQuery(countHql.toString());
		
		if(district!=null&&!district.equals("")){
			countQuery.setParameter("district", "%"+district+"%");
		}
		if(room!=null&&!room.equals("")){
			countQuery.setParameter("room", "%"+room+"%");
		}
		if(dinner!=null&&!dinner.equals("")){
			countQuery.setParameter("dinner","%"+dinner+"%");
		}
		if(toliet!=null&&!toliet.equals("")){
			countQuery.setParameter("toliet", "%"+toliet+"%");
		}
		
		List<?> countResult=countQuery.list();
		int totalRecord=countResult.size();
		System.out.println(totalRecord);
		
		int totalPage=totalRecord/pageSize;
		
		if(totalPage%pageSize!=0){
			totalPage++;
		}
		Pager page=new Pager(pageSize, pageNum,totalRecord, totalPage);
		
		return page;
	}
	
	public List<Object> getfyMain(String district,String room,String dinner,String toliet,int pageNum,int pageSize){
	
		
		
		StringBuilder hql1=new StringBuilder("select f.title,f.price,f.method,f.createTime,w.position,w.metro,w.village,x.area,x.room,x.dinner,x.toliet,x.year,x.floor,x.direction,p.pic1,f.fy_id,w.District from FyMainModel as f,FyfxModel as x,FywzModel as w,FyPicModel as p where f.fy_id=x.fy_id and f.fy_id=w.fy_id and f.fy_id=p.fy_id and f.delflag='1' and f.flag='1' ");
		int fromIndex=pageSize*(pageNum-1);
		if(district!=null&&!district.equals("")){
			hql1.append(" and w.District like :district");
		}
		if(room!=null&&!room.equals("")){
			hql1.append(" and x.room like :room");
		}
		if(dinner!=null&&!dinner.equals("")){
		
			hql1.append(" and x.dinner like :dinner");
		}
		if(toliet!=null&&!toliet.equals("")){
			
			hql1.append(" and x.toliet like :toliet");
		}
		
		
		
		Query query1=getSession().createQuery(hql1.toString());
		
		if(district!=null&&!district.equals("")){
			query1.setParameter("district", "%"+district+"%");
		}
		if(room!=null&&!room.equals("")){
			query1.setParameter("room", "%"+room+"%");
		}
		if(dinner!=null&&!dinner.equals("")){
			query1.setParameter("dinner","%"+dinner+"%");
		}
		if(toliet!=null&&!toliet.equals("")){
			query1.setParameter("toliet", "%"+toliet+"%");
		}
		query1.setFirstResult(fromIndex);
		query1.setMaxResults(pageSize);
		
		
//		String hql="select f.title,f.price,f.method,f.createTime,w.position,w.metro,w.village,x.area,x.room,x.dinner,x.toliet,x.year,x.floor,x.direction,p.pic1 from FyMainModel as f,FyfxModel as x,FywzModel as w,FyPicModel as p where f.fy_id=x.fy_id and f.fy_id=w.fy_id and f.fy_id=p.fy_id and f.delflag='1' and f.flag='1' ";
//		Query query=getSession().createQuery(hql);
		return query1.getResultList();
	}
	

}
