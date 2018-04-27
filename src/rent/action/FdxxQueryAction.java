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
	
	public String fdxxdel() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String fd_id= request.getParameter("fd_id");
		fdxxQueryService.fdxxDelete(fd_id);
		return "fdxxdel";
	}

}
