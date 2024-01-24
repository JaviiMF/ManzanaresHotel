package com.Hotel.Manzanares.Controller;

import com.Hotel.Manzanares.Entity.Reserva;
import com.Hotel.Manzanares.Request.ReserveRequest;
import com.Hotel.Manzanares.Service.ReserveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(("/reserve"))
@AllArgsConstructor
public class ReserveController {

    private final ReserveService reserveService;

    @PostMapping("/createReserve")
    public String createReserve(@RequestBody ReserveRequest reserveRequest){
        return reserveService.createReserve(reserveRequest);
    }

    @GetMapping("/payReserve")
    public Boolean payReserve(){
        return reserveService.payReserve();
    }

    @GetMapping("/activeReserve")
    public List<Reserva> getReservasActivas(){
        return reserveService.getReservasActivas();
    }
}
