package rent.action;

import java.io.*;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import rent.service.RegisterService;
import rent.util.StringUtil;

public class RegisterAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 private InputStream inputStream;

	private String loginName;
	
	private String password;
	
	private String realName;
	

	private String phoneNumber;
	
	 private File file1 ; //具体上传文件的 引用 , 指向临时目录中的临时文件  
	 private String file1FileName ;  // 上传文件的名字 ,FileName 固定的写法  
	 private String file1ContentType ; //上传文件的类型， ContentType 固定的写法  
	
	private RegisterService registerService;
	
	
	public RegisterService getRegisterService() {
		return registerService;
	}
	public void setRegisterService(RegisterService registerService) {
		this.registerService = registerService;
	}
	
	
	public InputStream getInputStream() {
		return inputStream;
	}
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
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
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
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
	
	 public String checkName() {
		   
		   if(registerService.checkname(loginName)){
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
		   
		   return "ajax-success";  
				   
	   }
	
	public String register() throws IOException{
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
		        registerService.saveInfo(loginName, password, phoneNumber, realName,path);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			
			
		return "login";
			}
	
	
	
}
