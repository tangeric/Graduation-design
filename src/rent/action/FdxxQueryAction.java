package rent.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import rent.model.FdModel;
import rent.service.FdxxQueryService;

public class FdxxQueryAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private FdxxQueryService fdxxQueryService;

	public FdxxQueryService getFdxxQueryService() {
		return fdxxQueryService;
	}

	public void setFdxxQueryService(FdxxQueryService fdxxQueryService) {
		this.fdxxQueryService = fdxxQueryService;
	}
	
	public String fdxxQuery() {
		HttpServletRequest request = ServletActionContext.getRequest();
		List<FdModel> fdlist= fdxxQueryService.fdxxQuery();
		request.setAttribute("fdlist", fdlist);
		return "fdxxquery";
	}
	
	public String delfdxxQuery() {
		HttpServletRequest request = ServletActionContext.getRequest();
		List<FdModel> fdlist= fdxxQueryService.delfdxxQuery();
		request.setAttribute("delfdlist", fdlist);
		return "delfdxxquery";
	}
	
	public String fdxxdel() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String fd_id= request.getParameter("fd_id");
		fdxxQueryService.fdxxDelete(fd_id);
		return "fdxxdel";
	}
	
	public String fdxxrec() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String fd_id= request.getParameter("fd_id");
		fdxxQueryService.fdxxrecover(fd_id);;
		return "fdxxrec";
	}
	
	public String adminfy() {
		HttpServletRequest request = ServletActionContext.getRequest();
		List<Object> adminlist= fdxxQueryService.adminfyquery();
		request.setAttribute("adminlist", adminlist);
		return "adminfy";
	}
	public String querydelfy() {
		HttpServletRequest request = ServletActionContext.getRequest();
		List<Object> relist= fdxxQueryService.deletefyquery();
		request.setAttribute("relist", relist);
		return "querydelfy";
	}
	
}
