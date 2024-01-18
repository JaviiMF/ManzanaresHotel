package com.Hotel.Manzanares.Service;

import com.Hotel.Manzanares.Entity.Descuento;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface DescuentoService {

    Optional<Descuento> getDescuento(Long id);

    void createDescuento(Descuento descuento);

    void deleteDescuento(String descripcion);

    void updateDescuento(String descripcion,Descuento descuento);
}
