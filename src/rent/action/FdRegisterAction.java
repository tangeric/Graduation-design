package rent.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import rent.service.FdRegisterService;
import rent.util.StringUtil;

public class FdRegisterAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private FdRegisterService fdRegisterService;
	

	
	private String zlfs;
	
	private String title;
	
	private String notice;
	
	private String paymethod;
	
	private String price;
	
	private String district;
	
	private String metro;
	
	private String village;
	
	private String position;
	
	private String fypz;
	
	private String area;
	
	private String floor;
	
	private String room;
	
	private String dinner;
	
	private String toliet;
	
	private String year;
	
	private String direction;
	
	private File fczpic;
	
	private String fczpicFileName ;  // 上传文件的名字 ,FileName 固定的写法  
	
	private String fczpicContentType ; //上传文件的类型， ContentType 固定的写法  
	
	private List<File> fypic;
	
	private List<String> fypicFileName;
	
	private List<String> fypicContentType;
	
	private String fy_id=StringUtil.getUUID();

	public FdRegisterService getFdRegisterService() {
		return fdRegisterService;
	}

	public void setFdRegisterService(FdRegisterService fdRegisterService) {
		this.fdRegisterService = fdRegisterService;
	}

	

	public String getZlfs() {
		return zlfs;
	}

	public void setZlfs(String zlfs) {
		this.zlfs = zlfs;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public String getPaymethod() {
		return paymethod;
	}

	public void setPaymethod(String paymethod) {
		this.paymethod = paymethod;
	}


	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getMetro() {
		return metro;
	}

	public void setMetro(String metro) {
		this.metro = metro;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	

	

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getFypz() {
		return fypz;
	}

	public void setFypz(String fypz) {
		this.fypz = fypz;
	}


	

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
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

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public File getFczpic() {
		return fczpic;
	}

	public void setFczpic(File fczpic) {
		this.fczpic = fczpic;
	}

	public String getFczpicFileName() {
		return fczpicFileName;
	}

	public void setFczpicFileName(String fczpicFileName) {
		this.fczpicFileName = fczpicFileName;
	}

	public String getFczpicContentType() {
		return fczpicContentType;
	}

	public void setFczpicContentType(String fczpicContentType) {
		this.fczpicContentType = fczpicContentType;
	}

	public List<File> getFypic() {
		return fypic;
	}

	public void setFypic(List<File> fypic) {
		this.fypic = fypic;
	}

	public List<String> getFypicFileName() {
		return fypicFileName;
	}

	public void setFypicFileName(List<String> fypicFileName) {
		this.fypicFileName = fypicFileName;
	}

	public List<String> getFypicContentType() {
		return fypicContentType;
	}

	public void setFypicContentType(List<String> fypicContentType) {
		this.fypicContentType = fypicContentType;
	}
	
	public void saveMain() throws IOException{
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String fd_id= session.getAttribute("fd_id").toString();
		String name=StringUtil.getUUID();
		 String root = ServletActionContext.getServletContext().getRealPath("/img/"+name);
		 //输出流  
	        OutputStream os;
			try {
				
				File file=new File(root,fczpicFileName);
				if(!file.exists()){
					file.getParentFile().mkdir();
					file.createNewFile();
 
				}
				String path= "img/"+name+"/"+file.getName();
				
				
				os = new FileOutputStream(file);
				 //输入流  
		        InputStream is = new FileInputStream(fczpic);  
		          
		        byte[] buf = new byte[1024];  
		        int length = 0 ;  
		          
		        while(-1 != (length = is.read(buf) ) )  
		        {  
		            os.write(buf, 0, length) ;  
		        }  
		        is.close();  
		        os.close();  
		        fdRegisterService.savefymain(fy_id,fd_id,fypz, zlfs, notice, paymethod, title, path, Double.parseDouble(price));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			
			
		
			}
	
	public void savepic() throws IOException{
		String name=StringUtil.getUUID();
		 String root = ServletActionContext.getServletContext().getRealPath("/img/"+name);
		 List<String> pathStr=new ArrayList<String>();
		 
		 for(int i=0;i<=5;i++){
		 //输出流  
	        OutputStream os;
			try {
				
				File file=new File(root,fypicFileName.get(i));
				if(!file.exists()){
					file.getParentFile().mkdir();
					file.createNewFile();

				}
				String path="img/"+name+"/"+file.getName();
				os = new FileOutputStream(file);
				 //输入流  
		        InputStream is = new FileInputStream(fypic.get(i));  
		          
		        byte[] buf = new byte[1024];  
		        int length = 0 ;  
		          
		        while(-1 != (length = is.read(buf) ) )  
		        {  
		            os.write(buf, 0, length) ;  
		        }  
		        is.close();  
		        os.close();
		        
		        pathStr.add(i, path);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		 }
		 fdRegisterService.savepic(fy_id,pathStr.get(0), pathStr.get(1), pathStr.get(2), pathStr.get(3), pathStr.get(4), pathStr.get(5));
	
	}
	
	
	
	public String save() throws IOException{
		saveMain();
		savepic();
		fdRegisterService.savefyfx(fy_id,Integer.parseInt(area),room,Integer.parseInt(floor), toliet, year, dinner, direction);
		
		fdRegisterService.savefywz(fy_id,district, metro, position, village);

		fdRegisterService.savewt(fy_id);
		return "register";
	}
}
