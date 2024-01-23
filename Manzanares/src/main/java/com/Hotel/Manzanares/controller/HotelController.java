package com.Hotel.Manzanares.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/views/hotel")
public class HotelController {
	
	@GetMapping("/servicios")
	public String servicios() {
		return "/views/hotel/servicios";
	}
	
	@GetMapping("/habitaciones")
	public String habitaciones() {
		return "/views/hotel/habitaciones";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "/views/hotel/contact";
	}
}
