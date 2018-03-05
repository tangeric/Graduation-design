package rent.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import rent.service.FdfyQueryService;
import rent.util.Pager;

public class FdfyQueryAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private FdfyQueryService fdfyQueryService;

	public FdfyQueryService getFdfyQueryService() {
		return fdfyQueryService;
	}

	public void setFdfyQueryService(FdfyQueryService fdfyQueryService) {
		this.fdfyQueryService = fdfyQueryService;
	}
	
	public String queryfdfy(){
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		int pageSize=6;
		String pageNumStr=request.getParameter("pageNum");
		int pageNum=1;
		if(pageNumStr!=null&&!pageNumStr.trim().equals("")){
			pageNum=Integer.parseInt(pageNumStr);//页码
		}
		String fd_id= session.getAttribute("fd_id").toString();
		List<Object> list=fdfyQueryService.fdfyQuery(fd_id,pageNum,pageSize);
		Pager page=fdfyQueryService.getcount(fd_id, pageNum, pageSize);
		request.setAttribute("list", list);
		request.setAttribute("page", page);
		return "fdfyquery";
	}
	
	public String querytgfdfy(){
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		int pageSize=6;
		String pageNumStr=request.getParameter("pageNum");
		int pageNum=1;
		if(pageNumStr!=null&&!pageNumStr.trim().equals("")){
			pageNum=Integer.parseInt(pageNumStr);//页码
		}
		String fd_id= session.getAttribute("fd_id").toString();
		List<Object> list=fdfyQueryService.fdtgfyQuery(fd_id, pageNum, pageSize);
		Pager page=fdfyQueryService.gettgcount(fd_id, pageNum, pageSize);
		request.setAttribute("list", list);
		request.setAttribute("page", page);
		return "tgfdfyquery";
	}

}
