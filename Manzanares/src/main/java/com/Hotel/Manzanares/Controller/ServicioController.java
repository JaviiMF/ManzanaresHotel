package com.Hotel.Manzanares.Controller;

import com.Hotel.Manzanares.Entity.Servicio;
import com.Hotel.Manzanares.Repository.ServicioRepository;
import com.Hotel.Manzanares.Service.ServicioService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(("/servicio"))
@AllArgsConstructor
public class ServicioController {

    private final ServicioService servicioService;

    @GetMapping("/{id}")
    public Optional<Servicio> getServicio(@PathVariable Long id){
       return servicioService.getServicio(id);
    }
    @PostMapping("/createServicio")
    public void createServicio(@RequestBody Servicio servicio){
        servicioService.createService(servicio);
    }
    @DeleteMapping("/deleteServicio/{descripcion}")
    public void deleteServicio(@PathVariable String descripcion){
        servicioService.deleteServicio(descripcion);
    }

    @PutMapping("/updateServicio/{descripcion}")
    public void updateServicio(@PathVariable String descripcion,@RequestBody Servicio servicio){
        servicioService.updateServicio(descripcion,servicio);
    }

}
