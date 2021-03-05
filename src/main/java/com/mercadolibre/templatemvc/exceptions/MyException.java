package com.mercadolibre.templatemvc.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class MyException extends Exception{

    HttpStatus response;

    public MyException(String s, HttpStatus r){
        super(s);
        response = r;
    }
}
