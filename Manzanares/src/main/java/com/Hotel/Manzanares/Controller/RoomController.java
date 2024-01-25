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

    @GetMapping("/all")
    public String listHabitacion(Model model)
    {
        System.out.println("Entrada");
        DispRequest d = new DispRequest();
        d.setFechaFin("02-01-24");
        d.setFechaInicio("01-01-10");

        List<Habitacion> h = roomService.getHabitacionesDisponibles(d);
        model.addAttribute("habitaciones", h);

        return "/views/webmaster/listRooms";
    }

    @GetMapping("/formHabitacion")
    public String formHabitacion(Model model)
    {
        return "/views/webmaster/createRoom";
    }
    @PostMapping("/createHabitacion")
    public String createHabitacion(Model model, @ModelAttribute Habitacion habitacion){

        roomService.createRoom(habitacion);

        return  "/views/webmaster/createRoom";
    }

    @DeleteMapping("/deleteHabitacion/{id}")
    public void deleteHabitacion(@PathVariable Long id) {

        roomService.deleteRoom(id); }

    @PostMapping("/disponibles")
    public List<Habitacion> getHabitacionesDisponibles(@RequestBody DispRequest dispRequest) {return roomService.getHabitacionesDisponibles(dispRequest); }
}
