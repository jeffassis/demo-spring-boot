package com.jeff.spring.boot.web.conversor;

import com.jeff.spring.boot.domain.Cargo;
import com.jeff.spring.boot.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToCargoConverter implements Converter<String, Cargo> {
    @Autowired
    private CargoService service;

    @Override
    public Cargo convert(String text) {
        if (text.isEmpty()){
            return null;
        }
        Long id = Long.valueOf(text);
        return service.buscarPorId(id);
    }
}
