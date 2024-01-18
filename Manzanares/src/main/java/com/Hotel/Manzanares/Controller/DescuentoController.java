package com.Hotel.Manzanares.Controller;


import com.Hotel.Manzanares.Entity.Descuento;
import com.Hotel.Manzanares.Service.DescuentoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(("/descuento"))
@AllArgsConstructor
public class DescuentoController {

    private final DescuentoService descuentoService;

    @GetMapping("/{id}")
    Optional<Descuento>getDescuento(@PathVariable Long id){
        return descuentoService.getDescuento(id);
    }

    @PostMapping("/createDescuento")
    public void createDescuento(@RequestBody Descuento descuento){
        descuentoService.createDescuento(descuento);
    }

    @DeleteMapping("/deleteDescuento/{descripcion}")
    public void deleteDescuento(@PathVariable String descripcion){
        descuentoService.deleteDescuento(descripcion);
    }
    @PutMapping("/updateDescuento/{descripcion}")
    public void updateDescuento(@PathVariable String descripcion,@RequestBody Descuento descuento ) {
        descuentoService.updateDescuento(descripcion,descuento);
    }
}
