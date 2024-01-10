package com.Hotel.Manzanares.Controller;

import com.Hotel.Manzanares.Entity.Habitacion;
import com.Hotel.Manzanares.Repository.RoomRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/room"))
@AllArgsConstructor
public class RoomController {

    private final RoomRepository roomRepository;
    @PostMapping("/createHabitacion")
    public void createHabitacion(@RequestBody Habitacion habitacion){
        roomRepository.save(habitacion);
    }
}
