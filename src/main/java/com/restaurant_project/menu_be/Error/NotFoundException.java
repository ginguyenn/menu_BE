package com.restaurant_project.menu_be.Error;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String message){
        super(message);
    }
}
