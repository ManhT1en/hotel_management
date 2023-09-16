package com.prasad.reservationservice.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class HotelNotFoundException extends  RuntimeException
{
    public HotelNotFoundException()
    {

    }
    public HotelNotFoundException(String message)
    {
        super(message);
    }
}
