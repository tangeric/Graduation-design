package rent.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import rent.service.FyDeleteService;

public class FyDeleteAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private FyDeleteService fyDeleteService;

	public FyDeleteService getFyDeleteService() {
		return fyDeleteService;
	}

	public void setFyDeleteService(FyDeleteService fyDeleteService) {
		this.fyDeleteService = fyDeleteService;
	}
	
	public String delete(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String fy_id=request.getParameter("fy_id");
		fyDeleteService.delete(fy_id);
		return "delete";
	}
	public String admindelete(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String fy_id=request.getParameter("fy_id");
		fyDeleteService.delete(fy_id);
		return "admindelete";
	}

}
