package rent.action;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import rent.model.FdModel;
import rent.service.FdUpdateService;
import rent.util.StringUtil;

public class FdUpdateAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private FdUpdateService fdUpdateService;
	
	private InputStream inputStream;
	
	private String realName;
	
	private String loginName;
	
	private String password;
	
	private String phoneNumber;
	
	 private File file1 ; //具体上传文件的 引用 , 指向临时目录中的临时文件  
	 private String file1FileName ;  // 上传文件的名字 ,FileName 固定的写法  
	 private String file1ContentType ; //上传文件的类型， ContentType 固定的写法  
	 
	 
	
	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public File getFile1() {
		return file1;
	}

	public void setFile1(File file1) {
		this.file1 = file1;
	}

	public String getFile1FileName() {
		return file1FileName;
	}

	public void setFile1FileName(String file1FileName) {
		this.file1FileName = file1FileName;
	}

	public String getFile1ContentType() {
		return file1ContentType;
	}

	public void setFile1ContentType(String file1ContentType) {
		this.file1ContentType = file1ContentType;
	}

	public FdUpdateService getFdUpdateService() {
		return fdUpdateService;
	}

	public void setFdUpdateService(FdUpdateService fdUpdateService) {
		this.fdUpdateService = fdUpdateService;
	}
	
	public String adminUpdatefd() throws IOException{
		HttpServletRequest request = ServletActionContext.getRequest();
		String fd_id=request.getSession().getAttribute("fd_id").toString();
		String name=StringUtil.getUUID();
		 String root = ServletActionContext.getServletContext().getRealPath("/img/"+name);
		 //输出流  
	        OutputStream os;
			try {
				
				File file=new File(root,file1FileName);
				if(!file.exists()){
					file.getParentFile().mkdir();
					file.createNewFile();

				}
				String path="img/"+name+"/"+file.getName();
				os = new FileOutputStream(file);
				 //输入流  
		        InputStream is = new FileInputStream(file1);  
		          
		        byte[] buf = new byte[1024];  
		        int length = 0 ;  
		          
		        while(-1 != (length = is.read(buf) ) )  
		        {  
		            os.write(buf, 0, length) ;  
		        }  
		        is.close();  
		        os.close();  
		        fdUpdateService.updatefdxx(loginName, phoneNumber, realName, path, fd_id);
	}catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			return "adminupdatefd";  
	
	}
	
	public String updatefd() throws IOException{
		HttpServletRequest request = ServletActionContext.getRequest();
		String fd_id=request.getSession().getAttribute("fd_id").toString();
		String name=StringUtil.getUUID();
		 String root = ServletActionContext.getServletContext().getRealPath("/img/"+name);
		 //输出流  
	        OutputStream os;
			try {
				
				File file=new File(root,file1FileName);
				if(!file.exists()){
					file.getParentFile().mkdir();
					file.createNewFile();

				}
				String path="img/"+name+"/"+file.getName();
				os = new FileOutputStream(file);
				 //输入流  
		        InputStream is = new FileInputStream(file1);  
		          
		        byte[] buf = new byte[1024];  
		        int length = 0 ;  
		          
		        while(-1 != (length = is.read(buf) ) )  
		        {  
		            os.write(buf, 0, length) ;  
		        }  
		        is.close();  
		        os.close();  
		        fdUpdateService.updatefdxx(loginName, phoneNumber, realName, path, fd_id);
	}catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			return "updatefd";  
	
	}
	public String queryfd(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String fd_id=request.getSession().getAttribute("fd_id").toString();
		FdModel fdModel= fdUpdateService.queryfdxx(fd_id);
		request.setAttribute("fd", fdModel);
		return "queryfd";
	}
	public String queryfdxx(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String fd_id=request.getParameter("fd_id");
		FdModel fdModel= fdUpdateService.queryfdxx(fd_id);
		request.setAttribute("fd", fdModel);
		return "queryfdxx";
	}
	
	public String updatepw(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String fd_id=request.getSession().getAttribute("fd_id").toString();
		fdUpdateService.updatepw(password, fd_id);
		return "updatepw";
	}
	public String checkpw(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String fd_id=request.getSession().getAttribute("fd_id").toString();
		if(fdUpdateService.checkpw(password, fd_id)){
			 try {
					inputStream=new ByteArrayInputStream("1".getBytes("utf-8"));
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}else{
			 try {
					inputStream=new ByteArrayInputStream("0".getBytes("utf-8"));
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return "ajax-pw";
	}
}
	
