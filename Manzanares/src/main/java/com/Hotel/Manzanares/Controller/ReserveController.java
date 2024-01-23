package com.Hotel.Manzanares.Controller;

import com.Hotel.Manzanares.Request.ReserveRequest;
import com.Hotel.Manzanares.Service.ReserveService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/reserve"))
@AllArgsConstructor
public class ReserveController {

    private final ReserveService reserveService;

    @PostMapping("/createReserve")
    public String createReserve(@RequestBody ReserveRequest reserveRequest){
        return reserveService.createReserve(reserveRequest);
    }

}
