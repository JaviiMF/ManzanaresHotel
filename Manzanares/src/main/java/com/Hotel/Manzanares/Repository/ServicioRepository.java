package com.Hotel.Manzanares.Repository;

import com.Hotel.Manzanares.Entity.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicioRepository extends JpaRepository<Servicio, Long> {
    public void deleteByDescripcion(@Param("descripcion") String descripcion);

    public Servicio findServicioByDescripcion(String descripcion);
}
