package com.Hotel.Manzanares.Controller;

import com.Hotel.Manzanares.Service.ExtrasService;
import lombok.AllArgsConstructor;
import com.Hotel.Manzanares.Entity.Extras;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(("/extras"))
@AllArgsConstructor
public class ExtrasController {

    public final ExtrasService extrasService;

    @GetMapping("/{id}")
    public Optional<Extras> getExtras(@PathVariable Long id){
        return extrasService.getExtras(id);
    }

    @PostMapping("/createExtras")
    public void createExtras(@RequestBody Extras extras){
        extrasService.createExtras(extras);
    }

    @DeleteMapping("/deleteExtras/{descripcion}")
    public void deleteExtras(@PathVariable String descripcion){
        extrasService.deleteExtras(descripcion);
    }

    @PutMapping("/updateExtras/{descripcion}")
    public void updateExtras(@PathVariable String descripcion,@RequestBody Extras extras){
        extrasService.updateExtras(descripcion,extras);
    }
}
