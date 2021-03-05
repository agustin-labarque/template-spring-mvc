package com.mercadolibre.templatemvc.controllers;

import com.mercadolibre.templatemvc.exceptions.MyException;
import com.mercadolibre.templatemvc.models.MyDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public abstract class AbstractRestController {

    @ExceptionHandler(MyException.class)
    public ResponseEntity<String> handleMyException(MyException e){
        return new ResponseEntity<String>(e.getMessage(), e.getResponse());
    }

    public abstract ResponseEntity<String> restController(@PathVariable MyDTO dto);

}
