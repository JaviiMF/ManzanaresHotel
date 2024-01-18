package com.Hotel.Manzanares.Repository;

import com.Hotel.Manzanares.Entity.Gama;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface GamaRepository extends JpaRepository<Gama, Long> {

    public void deleteGamaByNombre(@Param("nombre") String nombre);

    public Gama findByNombre(String nombre);
}
