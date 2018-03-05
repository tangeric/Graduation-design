package rent.model;

import java.io.Serializable;

public class FyfxModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String fx_id;
	
	private String room;
	
	private String dinner;
	
	private String toliet;
	
	private String year;
	
	private int area;
	
	private int floor;
	
	private String direction;
	
	private String fy_id;

	

	public String getFx_id() {
		return fx_id;
	}

	public void setFx_id(String fx_id) {
		this.fx_id = fx_id;
	}

	public String getFy_id() {
		return fy_id;
	}

	public void setFy_id(String fy_id) {
		this.fy_id = fy_id;
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

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	

}
