package com.Hotel.Manzanares.Controller;


import com.Hotel.Manzanares.Entity.Descuento;
import com.Hotel.Manzanares.Service.DescuentoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(("/descuento"))
@AllArgsConstructor
public class DescuentoController {

    private final DescuentoService descuentoService;

    @GetMapping("/{id}")
    Optional<Descuento>getDescuento(@PathVariable Long id){
        return descuentoService.getDescuento(id);
    }

    @GetMapping("/formDescuento")
    public String formDescuento()
    {
        return "/views/webmaster/createOferta";
    }
    @PostMapping("/createDescuento")
    public String  createDescuento(@ModelAttribute Descuento descuento, Model model){
        descuentoService.createDescuento(descuento);

        return "/views/webmaster/createOferta";
    }

    @DeleteMapping("/deleteDescuento/{id}")
    public void deleteDescuento(@PathVariable Long id){
        descuentoService.deleteDescuento(id);
    }
    @PutMapping("/updateDescuento/{id}")
    public void updateDescuento(@PathVariable Long id,@RequestBody Descuento descuento ) {
        descuentoService.updateDescuento(id,descuento);
    }
    @GetMapping("/allDescuentos")
    public String getAllDescuentos(Model model){
        List<Descuento> d = descuentoService.getAllDescuentos();
        model.addAttribute("descuento", d);

        return "/views/webmaster/listOferta";
    }
}
