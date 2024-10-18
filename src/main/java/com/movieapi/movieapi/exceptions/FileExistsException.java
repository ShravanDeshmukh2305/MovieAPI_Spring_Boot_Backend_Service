package com.movieapi.movieapi.exceptions;

public class FileExistsException extends RuntimeException{

    public  FileExistsException(String message){
        super(message);
    }
}
