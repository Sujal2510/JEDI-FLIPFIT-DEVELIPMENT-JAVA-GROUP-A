/**
 * 
 */
package com.flipfit.bean;

import java.util.*;
/**
 * 
 */
public class GymCustomer {
	private String userId;
	private String name;
    private String email;
    private String phoneNumber;
    private List<String> bookings;    //stores Booking Ids.
    /**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
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
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the bookings
	 */
	public List<String> getBookings() {
		return bookings;
	}
	/**
	 * @param bookings the bookings to set
	 */
	public void setBookings(List<String> bookings) {
		this.bookings = bookings;
	}

//    public void register() {}
//    public List<Gym> viewCenters(String area) { return null; }
//    public List<Slot> viewAvailability(Date date, String centerId) { return null; }
//    public Booking bookSlot(String slotId, String centerId) { return null; }
//    public void cancelBooking(String bookingId) {}
//    public List<Booking> viewPlan(Date date) { return null; }
}
