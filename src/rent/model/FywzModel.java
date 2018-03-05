package rent.model;

import java.io.Serializable;

public class FywzModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String fywz_id;
	
	private String District;
	
	private String village;
	
	private String metro;
	
	private String position;
	
	private String fy_id;

	

	public String getFywz_id() {
		return fywz_id;
	}

	public void setFywz_id(String fywz_id) {
		this.fywz_id = fywz_id;
	}

	public String getFy_id() {
		return fy_id;
	}

	public void setFy_id(String fy_id) {
		this.fy_id = fy_id;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getMetro() {
		return metro;
	}

	public void setMetro(String metro) {
		this.metro = metro;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	
	
	

}
