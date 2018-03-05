package rent.model;

import java.io.Serializable;

public class FyMainModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String fy_id;
	
	private String title;
	
	private String notice;
	
	private String createTime;
	
	private String fd_id;
	
	private String method;
	
	private double price;
	
	private String payMethod;
	
	private String fypz;
	
	private String fcz_pic;
	
	private String flag;
	
	private String delflag;

	
	
	public String getDelflag() {
		return delflag;
	}

	public void setDelflag(String delflag) {
		this.delflag = delflag;
	}

	

	public String getFy_id() {
		return fy_id;
	}

	public void setFy_id(String fy_id) {
		this.fy_id = fy_id;
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

	


	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getFd_id() {
		return fd_id;
	}

	public void setFd_id(String fd_id) {
		this.fd_id = fd_id;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

	
	
	public String getFypz() {
		return fypz;
	}

	public void setFypz(String fypz) {
		this.fypz = fypz;
	}

	public String getFcz_pic() {
		return fcz_pic;
	}

	public void setFcz_pic(String fcz_pic) {
		this.fcz_pic = fcz_pic;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	
	
	

}
