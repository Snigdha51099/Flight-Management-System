package com.capg.fms.bs.service;

import java.util.List;
import java.util.Optional;

import com.capg.fms.bs.dto.Booking;

public interface IBookingService {
	public Optional<Booking> getBookingDetails(long bookingId);
	public List<Booking> getAllBookingDetails();
	public Booking addBookingDetails(Booking book);
	
	public void updateBookingDetails(Booking book);
	public void deleteBookingDetails(long bookingId, Booking book);

}
