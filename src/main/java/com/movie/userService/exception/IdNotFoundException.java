package com.movie.userService.exception;

public class IdNotFoundException extends RuntimeException{
    public  IdNotFoundException(String error){
        super(error);
    }
}
