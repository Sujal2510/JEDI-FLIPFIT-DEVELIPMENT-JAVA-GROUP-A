/**
 * 
 */
package com.flipfit.bean;

import java.sql.Date;
import java.util.List;

/**
 * 
 */
public class Slot {
	private String slotId;
    private Date startTime;
    private Date endTime;
    private Date date;
    private int seatCapacity;
    private int seatsBooked;			//may be it is array
    private String centerId;
    private boolean isClosed;
    private List<Waitlist> waitlistedBookings;
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
	 * @return the startTime
	 */
	public Date getStartTime() {
		return startTime;
	}
	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	/**
	 * @return the endTime
	 */
	public Date getEndTime() {
		return endTime;
	}
	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the seatCapacity
	 */
	public int getSeatCapacity() {
		return seatCapacity;
	}
	/**
	 * @param seatCapacity the seatCapacity to set
	 */
	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	/**
	 * @return the seatsBooked
	 */
	public int getSeatsBooked() {
		return seatsBooked;
	}
	/**
	 * @param seatsBooked the seatsBooked to set
	 */
	public void setSeatsBooked(int seatsBooked) {
		this.seatsBooked = seatsBooked;
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
	 * @return the isClosed
	 */
	public boolean isClosed() {
		return isClosed;
	}
	/**
	 * @param isClosed the isClosed to set
	 */
	public void setClosed(boolean isClosed) {
		this.isClosed = isClosed;
	}
	/**
	 * @return the waitlistedBookings
	 */
	public List<Waitlist> getWaitlistedBookings() {
		return waitlistedBookings;
	}
	/**
	 * @param waitlistedBookings the waitlistedBookings to set
	 */
	public void setWaitlistedBookings(List<Waitlist> waitlistedBookings) {
		this.waitlistedBookings = waitlistedBookings;
	}


//    public boolean isAvailable() { return false; }
//    public boolean bookSeat() { return false; }
//    public void cancelSeat() {}
}
