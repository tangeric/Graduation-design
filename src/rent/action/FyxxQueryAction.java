package rent.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import rent.service.FyxxQueryService;

public class FyxxQueryAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private FyxxQueryService fyxxQueryService;

	public FyxxQueryService getFyxxQueryService() {
		return fyxxQueryService;
	}

	public void setFyxxQueryService(FyxxQueryService fyxxQueryService) {
		this.fyxxQueryService = fyxxQueryService;
	}
	public String queryxx(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String fy_id=request.getParameter("fy_id");
		List<Object> list= fyxxQueryService.getfyxx(fy_id);
		System.out.println(list.size());
		request.setAttribute("list", list.get(0));
		return "querymx";
	}
	
	public String qupdatexx(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String fy_id=request.getParameter("fy_id");
		List<Object> list= fyxxQueryService.getfyxx(fy_id);
		request.setAttribute("list", list.get(0));
		Object[] str=(Object[]) list.get(0);
		String[] fypz=str[15].toString().split(",");
		for(int i=0;i<fypz.length;i++){
			if(fypz[i].trim().equals("洗衣机")){
				request.setAttribute("washer", "11");
			}
			if(fypz[i].trim().equals("空调")){
				request.setAttribute("ac", "11");
			}
			if(fypz[i].trim().equals("电视")){
				request.setAttribute("tv", "11");
			}
			if(fypz[i].trim().equals("床")){
				request.setAttribute("bed", "11");
			}
			if(fypz[i].trim().equals("Wifi")){
				request.setAttribute("wifi", "11");
			}
			if(fypz[i].trim().equals("厨房")){
				request.setAttribute("kic", "11");
			}
			if(fypz[i].equals("冰箱")){
				request.setAttribute("fridge", "11");
			}
			if(fypz[i].trim().equals("阳台")){
				request.setAttribute("balcony", "11");
			}
		}
		return "qupdate";
	}

}
