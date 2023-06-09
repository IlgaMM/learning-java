package com.sda.she_likes_java.final_project.service;

import com.sda.she_likes_java.final_project.repository.BookingRecordRepository;

public class BookingService {
    private final BookingRecordRepository bookingServiceRepository;

    // dependency injection - providing collaborators
    public BookingService(BookingRecordRepository bookingServiceRepository) {
        this.bookingServiceRepository = bookingServiceRepository;
    }
}
