package rent.model;

import java.io.Serializable;

public class FywtModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String fywt_id;
	
	private String fy_id;
	
	private String admin_id;
	
	private String reason;
	
	private String Flag;

	

	public String getFywt_id() {
		return fywt_id;
	}

	public void setFywt_id(String fywt_id) {
		this.fywt_id = fywt_id;
	}

	public String getFy_id() {
		return fy_id;
	}

	public void setFy_id(String fy_id) {
		this.fy_id = fy_id;
	}

	public String getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getFlag() {
		return Flag;
	}

	public void setFlag(String flag) {
		Flag = flag;
	}
	
	

}
