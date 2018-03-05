package rent.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import rent.service.AdminService;
import rent.util.Pager;

public class AdminAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private AdminService adminService;
	
	private String reason;
	
	

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
	public String toaddwt(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String fy_id=request.getParameter("fy_id");
		request.setAttribute("fy_id", fy_id);
		return "towt";
	}
	
	public String queryxx(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String fy_id=request.getParameter("fy_id");
		List<Object> list=adminService.getfyxx(fy_id);
		request.setAttribute("list", list.get(0));
		return "adqueryxx";
	}
	
	public String querydshfy(){
		HttpServletRequest request = ServletActionContext.getRequest();
		int pageSize=6;
		String pageNumStr=request.getParameter("pageNum");
		int pageNum=1;
		if(pageNumStr!=null&&!pageNumStr.trim().equals("")){
			pageNum=Integer.parseInt(pageNumStr);//页码
		}
		List<Object> list=adminService.adminquery(pageNum, pageSize);
		Pager page=adminService.getcount(pageNum, pageSize);
		request.setAttribute("list", list);
		request.setAttribute("page", page);
		return "querydshfy";
	}

	public String passfy(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String fy_id=request.getParameter("fy_id");
		adminService.check(fy_id);
		return "passfy";
	}
	
	public String addwt(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String fy_id = request.getParameter("fy_id");
		String admin_id = request.getSession().getAttribute("admin_id").toString();
		adminService.savewt(fy_id, admin_id, reason);
		return "addwt";
	}
	public String updatewt(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String fy_id = request.getParameter("fy_id");
		adminService.updatewt(reason, fy_id);
		return "updatewt";
	}
}
