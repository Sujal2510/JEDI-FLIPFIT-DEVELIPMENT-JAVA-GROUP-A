/**
 * 
 */
package com.flipfit.bean;

/**
 * 
 */
public class Booking {
	private String bookingId;
    private String userId;
    private String slotId;
    private String centerId;
    private boolean bookingStatus;
    /**
	 * @return the bookingId
	 */
	public String getBookingId() {
		return bookingId;
	}
	/**
	 * @param bookingId the bookingId to set
	 */
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
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
	 * @return the slotId
	 */
	public String getSlotId() {
		return slotId;
	}
	/**
	 * @param slotId the slotId to set
	 */
	public void setSlotId(String slotId) {
		this.slotId = slotId;
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
	 * @return the bookingStatus
	 */
	public boolean isBookingStatus() {
		return bookingStatus;
	}
	/**
	 * @param bookingStatus the bookingStatus to set
	 */
	public void setBookingStatus(boolean bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

}
