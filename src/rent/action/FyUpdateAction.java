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

import rent.service.FyUpdateService;
import rent.util.StringUtil;

public class FyUpdateAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private FyUpdateService fyUpdateService;
	
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
	
	private File fypic1;
	
	private String fypic1FileName;
	
	private String fypic1ContentType;
	
	private File fypic2;
	
	private String fypic2FileName;
	
	private String fypic2ContentType;
	
	private File fypic3;
	
	private String fypic3FileName;
	
	private String fypic3ContentType;
	
	private File fypic4;
	
	private String fypic4FileName;
	
	private String fypic4ContentType;

	private File fypic5;
	
	private String fypic5FileName;
	
	private String fypic5ContentType;

	private File fypic6;
	
	private String fypic6FileName;
	
	private String fypic6ContentType;

	
	public FyUpdateService getFyUpdateService() {
		return fyUpdateService;
	}

	public void setFyUpdateService(FyUpdateService fyUpdateService) {
		this.fyUpdateService = fyUpdateService;
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
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

	
	
	public File getFypic1() {
		return fypic1;
	}

	public void setFypic1(File fypic1) {
		this.fypic1 = fypic1;
	}

	public String getFypic1FileName() {
		return fypic1FileName;
	}

	public void setFypic1FileName(String fypic1FileName) {
		this.fypic1FileName = fypic1FileName;
	}

	public String getFypic1ContentType() {
		return fypic1ContentType;
	}

	public void setFypic1ContentType(String fypic1ContentType) {
		this.fypic1ContentType = fypic1ContentType;
	}



	public String getFypic2FileName() {
		return fypic2FileName;
	}

	public void setFypic2FileName(String fypic2FileName) {
		this.fypic2FileName = fypic2FileName;
	}

	public String getFypic2ContentType() {
		return fypic2ContentType;
	}

	public void setFypic2ContentType(String fypic2ContentType) {
		this.fypic2ContentType = fypic2ContentType;
	}

	

	public String getFypic3FileName() {
		return fypic3FileName;
	}

	public void setFypic3FileName(String fypic3FileName) {
		this.fypic3FileName = fypic3FileName;
	}

	public String getFypic3ContentType() {
		return fypic3ContentType;
	}

	public void setFypic3ContentType(String fypic3ContentType) {
		this.fypic3ContentType = fypic3ContentType;
	}

	

	public String getFypic4FileName() {
		return fypic4FileName;
	}

	public void setFypic4FileName(String fypic4FileName) {
		this.fypic4FileName = fypic4FileName;
	}

	public String getFypic4ContentType() {
		return fypic4ContentType;
	}

	public void setFypic4ContentType(String fypic4ContentType) {
		this.fypic4ContentType = fypic4ContentType;
	}

	

	public String getFypic5FileName() {
		return fypic5FileName;
	}

	public void setFypic5FileName(String fypic5FileName) {
		this.fypic5FileName = fypic5FileName;
	}

	public String getFypic5ContentType() {
		return fypic5ContentType;
	}

	public void setFypic5ContentType(String fypic5ContentType) {
		this.fypic5ContentType = fypic5ContentType;
	}


	public File getFypic2() {
		return fypic2;
	}

	public void setFypic2(File fypic2) {
		this.fypic2 = fypic2;
	}

	public File getFypic3() {
		return fypic3;
	}

	public void setFypic3(File fypic3) {
		this.fypic3 = fypic3;
	}

	public File getFypic4() {
		return fypic4;
	}

	public void setFypic4(File fypic4) {
		this.fypic4 = fypic4;
	}

	public File getFypic5() {
		return fypic5;
	}

	public void setFypic5(File fypic5) {
		this.fypic5 = fypic5;
	}

	public File getFypic6() {
		return fypic6;
	}

	public void setFypic6(File fypic6) {
		this.fypic6 = fypic6;
	}

	public String getFypic6FileName() {
		return fypic6FileName;
	}

	public void setFypic6FileName(String fypic6FileName) {
		this.fypic6FileName = fypic6FileName;
	}

	public String getFypic6ContentType() {
		return fypic6ContentType;
	}

	public void setFypic6ContentType(String fypic6ContentType) {
		this.fypic6ContentType = fypic6ContentType;
	}

	public void updatefczpic() throws IOException{
		HttpServletRequest request = ServletActionContext.getRequest();
		String fy_id=request.getParameter("fy_id");
			if(fypic1FileName!=null){
				String name=StringUtil.getUUID();
				String root = ServletActionContext.getServletContext().getRealPath("/"+name);
				 OutputStream os;
					try {
						
						File file=new File(root,fypic1FileName);
						if(!file.exists()){
							file.getParentFile().mkdir();
							file.createNewFile();

						}
						String path=name+"/"+file.getName();
						os = new FileOutputStream(file);
						 //输入流  
				        InputStream is = new FileInputStream(fypic1);  
				          
				        byte[] buf = new byte[1024];  
				        int length = 0 ;  
				          
				        while(-1 != (length = is.read(buf) ) )  
				        {  
				            os.write(buf, 0, length) ;  
				        }  
				        is.close();  
				        os.close();
				        fyUpdateService.updatepic1(fy_id,path);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}		
			}
			if(fypic2FileName!=null){
				String name=StringUtil.getUUID();
				String root = ServletActionContext.getServletContext().getRealPath("/"+name);
				 OutputStream os;
					try {
						
						File file=new File(root,fypic2FileName);
						if(!file.exists()){
							file.getParentFile().mkdir();
							file.createNewFile();

						}
						String path=name+"/"+file.getName();
						os = new FileOutputStream(file);
						 //输入流  
				        InputStream is = new FileInputStream(fypic2);  
				          
				        byte[] buf = new byte[1024];  
				        int length = 0 ;  
				          
				        while(-1 != (length = is.read(buf) ) )  
				        {  
				            os.write(buf, 0, length) ;  
				        }  
				        is.close();  
				        os.close();
				        fyUpdateService.updatepic2(fy_id,path);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}		
			}
			if(fypic3FileName!=null){
				String name=StringUtil.getUUID();
				String root = ServletActionContext.getServletContext().getRealPath("/"+name);
				 OutputStream os;
					try {
						
						File file=new File(root,fypic3FileName);
						if(!file.exists()){
							file.getParentFile().mkdir();
							file.createNewFile();

						}
						String path=name+"/"+file.getName();
						os = new FileOutputStream(file);
						 //输入流  
				        InputStream is = new FileInputStream(fypic3);  
				          
				        byte[] buf = new byte[1024];  
				        int length = 0 ;  
				          
				        while(-1 != (length = is.read(buf) ) )  
				        {  
				            os.write(buf, 0, length) ;  
				        }  
				        is.close();  
				        os.close();
				        fyUpdateService.updatepic3(fy_id,path);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}		
			}
			if(fypic4FileName!=null){
				String name=StringUtil.getUUID();
				String root = ServletActionContext.getServletContext().getRealPath("/"+name);
				 OutputStream os;
					try {
						
						File file=new File(root,fypic4FileName);
						if(!file.exists()){
							file.getParentFile().mkdir();
							file.createNewFile();

						}
						String path=name+"/"+file.getName();
						os = new FileOutputStream(file);
						 //输入流  
				        InputStream is = new FileInputStream(fypic4);  
				          
				        byte[] buf = new byte[1024];  
				        int length = 0 ;  
				          
				        while(-1 != (length = is.read(buf) ) )  
				        {  
				            os.write(buf, 0, length) ;  
				        }  
				        is.close();  
				        os.close();
				        fyUpdateService.updatepic4(fy_id,path);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}		
			}
			if(fypic5FileName!=null){
				String name=StringUtil.getUUID();
				String root = ServletActionContext.getServletContext().getRealPath("/"+name);
				 OutputStream os;
					try {
						
						File file=new File(root,fypic5FileName);
						if(!file.exists()){
							file.getParentFile().mkdir();
							file.createNewFile();

						}
						String path=name+"/"+file.getName();
						os = new FileOutputStream(file);
						 //输入流  
				        InputStream is = new FileInputStream(fypic5);  
				          
				        byte[] buf = new byte[1024];  
				        int length = 0 ;  
				          
				        while(-1 != (length = is.read(buf) ) )  
				        {  
				            os.write(buf, 0, length) ;  
				        }  
				        is.close();  
				        os.close();
				        fyUpdateService.updatepic5(fy_id,path);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}		
			}
			if(fypic6FileName!=null){
				String name=StringUtil.getUUID();
				String root = ServletActionContext.getServletContext().getRealPath("/"+name);
				 OutputStream os;
					try {
						
						File file=new File(root,fypic6FileName);
						if(!file.exists()){
							file.getParentFile().mkdir();
							file.createNewFile();

						}
						String path=name+"/"+file.getName();
						os = new FileOutputStream(file);
						 //输入流  
				        InputStream is = new FileInputStream(fypic6);  
				          
				        byte[] buf = new byte[1024];  
				        int length = 0 ;  
				          
				        while(-1 != (length = is.read(buf) ) )  
				        {  
				            os.write(buf, 0, length) ;  
				        }  
				        is.close();  
				        os.close();
				        fyUpdateService.updatepic6(fy_id,path);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}		
			}
	}
	public void updateMain() throws IOException{
		System.out.println("sss"+fczpicFileName);
		String name=StringUtil.getUUID();
		HttpServletRequest request = ServletActionContext.getRequest();
		String fy_id=request.getParameter("fy_id");
		 String root = ServletActionContext.getServletContext().getRealPath("/"+name);
		 if(fczpicFileName!=null){
			//输出流  
		        OutputStream os;
				try {
					File file=new File(root,fczpicFileName);
					if(!file.exists()){
						file.getParentFile().mkdir();
						file.createNewFile();

					}
					String path=name+"/"+file.getName();
					
					
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
			        fyUpdateService.updatefcz(path, fy_id);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 }
		 
			fyUpdateService.updateMain(title, notice, fypz, zlfs, paymethod, fy_id,Double.parseDouble(price));
	}
	public String saveall() throws IOException{
		HttpServletRequest request = ServletActionContext.getRequest();
		String fy_id=request.getParameter("fy_id");
		System.out.println("主键"+fy_id);
		updateMain();
		updatefczpic();
		fyUpdateService.updatefyfx(Integer.parseInt(area), room, dinner, toliet, year, Integer.parseInt(floor), direction, fy_id);
		fyUpdateService.updatefywz(district, metro, position, village, fy_id);
		fyUpdateService.updatewt(fy_id);
		return "update";
	}
}
