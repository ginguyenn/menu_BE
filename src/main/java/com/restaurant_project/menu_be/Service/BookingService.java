package com.restaurant_project.menu_be.Service;

import com.restaurant_project.menu_be.Error.NotFoundException;
import com.restaurant_project.menu_be.Persistence.Booking;
import com.restaurant_project.menu_be.Repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;

    //add Constructor
    @Autowired
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }


    //get all bookings
    public List<Booking> getAllBooking(){
        return bookingRepository.findAll();
    }

    //get 1 booking
    public Booking getBookingById(Long id) {
        return bookingRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Booking not found"));
    }
    //create booking
    public Booking createBooking(Booking booking){
        return bookingRepository.save(booking);
    }

    //update booking
    public Booking updateBooking(Long id, Booking updateBooking){
        //declare existingBooking
        Booking existingBooking = getBookingById(id);
        existingBooking.setName(updateBooking.getName());
        existingBooking.setPerson(updateBooking.getPerson());
        existingBooking.setTime(updateBooking.getTime());
        existingBooking.setTime(updateBooking.getTime());
        return bookingRepository.save(existingBooking);
    }

    //delete booking
    public void deleteBooking(Long id){
        bookingRepository.deleteById(id);
    }
}
