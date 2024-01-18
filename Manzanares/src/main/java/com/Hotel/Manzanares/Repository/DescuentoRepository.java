package com.Hotel.Manzanares.Repository;

import com.Hotel.Manzanares.Entity.Descuento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DescuentoRepository extends JpaRepository<Descuento,Long> {

    public void deleteByDescripcion(@Param("descripcion") String descripcion);

    public Descuento findByDescripcion(String descripcion);
}
