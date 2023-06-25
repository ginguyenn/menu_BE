package com.restaurant_project.menu_be.Controller;

import com.restaurant_project.menu_be.Model.BookingEntity;
import com.restaurant_project.menu_be.Repository.BookingRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    private final BookingRepository bookingRepository;
    //constructor
    public BookingController(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }



    //create booking
    @PostMapping("")
    public BookingEntity createBooking(@RequestBody BookingEntity booking){
        return bookingRepository.save(booking);
    }
}
