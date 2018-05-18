package rent.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import rent.service.FyQueryService;
import rent.util.Pager;

public class FyQueryAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private FyQueryService fyQueryService;
	
	private String title;
	
	private String district;
	
	private String room;
	
	private String dinner;
	
	private String toliet;

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getDinner() {
		return dinner;
	}

	public void setDinner(String dinner) {
		this.dinner = dinner;
	}

	public String getToliet() {
		return toliet;
	}

	public void setToliet(String toliet) {
		this.toliet = toliet;
	}

	public FyQueryService getFyQueryService() {
		return fyQueryService;
	}

	public void setFyQueryService(FyQueryService fyQueryService) {
		this.fyQueryService = fyQueryService;
	}
	
	public String query(){
		HttpServletRequest request = ServletActionContext.getRequest();
		int pageSize=6;
		String pageNumStr=request.getParameter("pageNum");
		int pageNum=1;
		if(pageNumStr!=null&&!pageNumStr.trim().equals("")){
			pageNum=Integer.parseInt(pageNumStr);//页码
		}
		System.out.println(toliet);
		List<Object> list= fyQueryService.getfyMain(title,district,room,dinner,toliet,pageNum,pageSize);
		Pager page=fyQueryService.getcount(title,district, room, dinner, toliet, pageNum, pageSize);
		request.setAttribute("list", list);
		request.setAttribute("page", page);
		request.setAttribute("title", title);
		request.setAttribute("district", district);
		request.setAttribute("room", room);
		request.setAttribute("dinner", dinner);
		request.setAttribute("toliet", toliet);
		return "queryfy";
	}

}
