package com.Hotel.Manzanares.Controller;

import com.Hotel.Manzanares.Entity.Habitacion;
import com.Hotel.Manzanares.Request.DispRequest;
import com.Hotel.Manzanares.Service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(("/room"))
@AllArgsConstructor
public class RoomController {

    private final RoomService roomService;
    @PostMapping("/createHabitacion")
    public void createHabitacion(@RequestBody Habitacion habitacion){
        roomService.createRoom(habitacion);
    }

    @DeleteMapping("/deleteHabitacion/{id}")
    public void deleteHabitacion(@PathVariable Long id) { roomService.deleteRoom(id); }

    @PostMapping("/disponibles")
    public List<Habitacion> getHabitacionesDisponibles(@RequestBody DispRequest dispRequest) {return roomService.getHabitacionesDisponibles(dispRequest); }

    @GetMapping("/all")
    public String getAllHabitaciones(Model model) {
        System.out.println("saleeee");
        List<Habitacion> habitaciones = roomService.getAllHabitaciones();
        model.addAttribute("habitaciones", habitaciones);
        return "views/hotel/habitaciones";
    }
}
