/**
 * 
 */
package com.flipfit.bean;

import java.util.List;

/**
 * 
 */
public class GymCenter {
	private String ownerId;
    private String centerId;
    private String name;
    private String location;
    private String area;
    private List<String> slotList;
    /**
	 * @return the ownerId
	 */
	public String getOwnerId() {
		return ownerId;
	}
	/**
	 * @param ownerId the ownerId to set
	 */
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	/**
	 * @return the centerId
	 */
	public String getCenterId() {
		return centerId;
	}
	/**
	 * @param centerId the centerId to set
	 */
	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}
	/**
	 * @return the slotList
	 */
	public List<String> getSlotList() {
		return slotList;
	}
	/**
	 * @param slotList the slotList to set
	 */
	public void setSlotList(List<String> slotList) {
		this.slotList = slotList;
	}


//    public void slotStatus() {}
//    public void slotDisable() {}
}
