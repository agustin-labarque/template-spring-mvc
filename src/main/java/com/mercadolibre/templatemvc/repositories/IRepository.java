package com.mercadolibre.templatemvc.repositories;

import com.mercadolibre.templatemvc.models.MyDTO;
import com.mercadolibre.templatemvc.models.MyObject;

public interface IRepository {
    MyObject find(MyDTO dto);
    void add(MyDTO dto, MyObject object);
}
