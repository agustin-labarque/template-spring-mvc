package com.mercadolibre.templatemvc.services;

import com.mercadolibre.templatemvc.models.MyDTO;
import com.mercadolibre.templatemvc.repositories.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MyService implements IService{

    @Autowired
    private IRepository repo;

    @Override
    public ResponseEntity<String> handle(MyDTO dto) {
        return new ResponseEntity<String>(repo.find(dto).getAnotherName(), HttpStatus.OK);
    }
}
