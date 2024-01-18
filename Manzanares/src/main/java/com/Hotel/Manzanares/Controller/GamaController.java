package com.Hotel.Manzanares.Controller;


import com.Hotel.Manzanares.Entity.Gama;
import com.Hotel.Manzanares.Service.GamaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(("/gama"))
@AllArgsConstructor
public class GamaController {

    private final GamaService gamaService;
    @GetMapping("/{id}")
    public Optional<Gama> getGama(@PathVariable Long id){return gamaService.getGama(id);}
    @PostMapping("/createGama")
    public void createGama(@RequestBody Gama gama){gamaService.createGama(gama);}

    @DeleteMapping("/deleteGama/{nombre}")
    public void deleteGama(@PathVariable String nombre){gamaService.deleteGama(nombre);}

    @PutMapping("/updateGama/{nombre}")
    public void updateGama(@PathVariable String nombre,@RequestBody Gama gama){
        gamaService.updateGama(nombre,gama);
    }
}
