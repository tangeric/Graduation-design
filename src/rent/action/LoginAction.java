package rent.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;


import com.opensymphony.xwork2.ActionSupport;

import rent.model.AdminModel;
import rent.model.FdModel;
import rent.service.impl.LoginService;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	private LoginService loginService;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginService getLoginService() {
		return loginService;
	}
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	public String adminLogin(){
		HttpServletRequest request = ServletActionContext.getRequest();
		if(!loginService.checkAdminLogin(username, password)){
			request.setAttribute("error", "error");
			return "adminerror";
		}
		HttpSession session = request.getSession();
		AdminModel adminModel=loginService.getadmin(username, password);
		session.setAttribute("admin_id", adminModel.getAdmin_id());
		return "list";
	}
	public String fdLogin(){
		HttpServletRequest request = ServletActionContext.getRequest();
		if(!loginService.checkFdLogin(username, password)){
			request.setAttribute("error", "error");
			return "fderror";
		}
		HttpSession session = request.getSession();
		FdModel fdModel= loginService.getmodel(username, password);
		session.setAttribute("fd_id", fdModel.getFd_id());
		return "fdlist";
	}

}
