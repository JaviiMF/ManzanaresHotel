package com.Hotel.Manzanares.Repository;

import com.Hotel.Manzanares.Entity.Extras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ExtrasRepository extends JpaRepository<Extras, Long> {

    public void deleteByDescripcion(@Param("descripcion") String descripcion);

    public Extras findByDescripcion(String descripcion);
}
