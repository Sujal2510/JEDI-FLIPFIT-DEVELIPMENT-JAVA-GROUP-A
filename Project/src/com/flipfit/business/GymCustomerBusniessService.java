/**
 * 
 */
package com.flipfit.business;

import java.sql.Date;

/**
 * 
 */
public class GymCustomerBusniessService {
	public void registerUser() {}
    public void viewCentersByArea(String area) {}
    public void viewSlotAvailability(String centerId, Date date) {}
    public void bookSlot(String slotId, String centerId) {}
    public void cancelBooking(String bookingId) {}
    public void viewPlan(Date date) {}
}
