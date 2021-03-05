package com.mercadolibre.templatemvc.controllers;

import com.mercadolibre.templatemvc.models.MyDTO;
import com.mercadolibre.templatemvc.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController extends AbstractRestController{

    @Autowired
    private IService service;

    @GetMapping(path = "/{path}")
    public ResponseEntity<String> restController(@PathVariable MyDTO dto){ return service.handle(dto); }

}
