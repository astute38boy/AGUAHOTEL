package com.csc3402.project.customer.service;

import com.csc3402.project.customer.model.Booking;
import com.csc3402.project.customer.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService{

    private final BookingRepository bookingRepository;

    public BookingServiceImpl( BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public List<Booking> listAllBookings() {
        return bookingRepository.findAll();
    }


}
