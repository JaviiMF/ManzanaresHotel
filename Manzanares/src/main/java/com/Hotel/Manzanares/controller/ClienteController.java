package com.Hotel.Manzanares.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/views/clientes")
public class ClienteController {
	
	@GetMapping("/login")
	public String loggear() {
		return "/views/clientes/login";
	}
}
