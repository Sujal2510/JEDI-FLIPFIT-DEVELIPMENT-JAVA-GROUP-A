/**
 * 
 */
package com.flipfit.bean;

import java.util.List;

/**
 * 
 */
public class GymOwner {
	private String gymOwnerId;
    private List<String> arraycenterId;
    private String name;
    private String email;
    private boolean approved;
    /**
	 * @return the gymOwnerId
	 */
	public String getGymOwnerId() {
		return gymOwnerId;
	}
	/**
	 * @param gymOwnerId the gymOwnerId to set
	 */
	public void setGymOwnerId(String gymOwnerId) {
		this.gymOwnerId = gymOwnerId;
	}
	/**
	 * @return the arraycenterId
	 */
	public List<String> getArraycenterId() {
		return arraycenterId;
	}
	/**
	 * @param arraycenterId the arraycenterId to set
	 */
	public void setArraycenterId(List<String> arraycenterId) {
		this.arraycenterId = arraycenterId;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the approved
	 */
	public boolean isApproved() {
		return approved;
	}
	/**
	 * @param approved the approved to set
	 */
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	
}
