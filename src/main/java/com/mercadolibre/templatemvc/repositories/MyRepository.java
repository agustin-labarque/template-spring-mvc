package com.mercadolibre.templatemvc.repositories;

import com.mercadolibre.templatemvc.models.MyDTO;
import com.mercadolibre.templatemvc.models.MyObject;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MyRepository implements IRepository{

    private final Map<String, MyObject> map = new HashMap<>();

    @Override
    public MyObject find(MyDTO dto) {
        return map.get(dto.getName());
    }

    @Override
    public void add(MyDTO dto, MyObject object) {
        map.put(dto.getName(), object);
    }
}
