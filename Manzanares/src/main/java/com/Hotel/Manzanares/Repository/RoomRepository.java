package com.Hotel.Manzanares.Repository;

import com.Hotel.Manzanares.Entity.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Habitacion,Long> {
}
