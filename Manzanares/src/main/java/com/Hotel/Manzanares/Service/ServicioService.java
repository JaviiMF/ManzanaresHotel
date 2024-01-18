package com.Hotel.Manzanares.Service;

import com.Hotel.Manzanares.Entity.Servicio;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ServicioService {

    Optional<Servicio> getServicio(Long id);

    void createService(Servicio servicio);

    void deleteServicio(String descripcion);

    void updateServicio(String descripcion, Servicio servicio);
}
