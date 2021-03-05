package com.mercadolibre.templatemvc.services;

import com.mercadolibre.templatemvc.models.MyDTO;
import org.springframework.http.ResponseEntity;

public interface IService {
    ResponseEntity<String> handle(MyDTO dto);
}
