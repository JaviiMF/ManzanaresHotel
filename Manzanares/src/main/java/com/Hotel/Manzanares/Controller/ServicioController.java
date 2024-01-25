package com.Hotel.Manzanares.Controller;

import com.Hotel.Manzanares.Entity.Servicio;
import com.Hotel.Manzanares.Repository.ServicioRepository;
import com.Hotel.Manzanares.Service.ServicioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(("/servicio"))
@AllArgsConstructor
public class ServicioController {

    private final ServicioService servicioService;
    @GetMapping("/formServicio")
    public String formServicio()
    {
        return "/views/webmaster/createService";
    }
    @GetMapping("/{id}")
    public Optional<Servicio> getServicio(@PathVariable Long id){
       return servicioService.getServicio(id);
    }
    @PostMapping("/createServicio")
    public String createServicio(@RequestBody Servicio servicio){

        servicioService.createService(servicio);

        return "/views/webmaster/createService";
    }
    @DeleteMapping("/deleteServicio/{id}")
    public void deleteServicio(@PathVariable Long id){
        servicioService.deleteServicio(id);
    }

    @PutMapping("/updateServicio/{id}")
    public void updateServicio(@PathVariable Long id,@ModelAttribute Servicio servicio){
        servicioService.updateServicio(id,servicio);
    }

    @GetMapping("/all")
    public String listServicios(Model model)
    {
        List<Servicio> s = servicioService.getAllServicio();
        model.addAttribute("servicio", s);

        return "/views/webmaster/listServices";
    }

    @GetMapping("/getUpdateServicio/{id}")
    public String getUpdateServicio(Model model, @ModelAttribute Servicio servicio)
    {


        return "/views/webmaster/listServices";
    }
}
