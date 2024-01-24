package com.Hotel.Manzanares.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/views/recepcionista")
public class RecepcionistaController {
	
	@GetMapping("/clientes")
	public String clientes() {
		return "/views/recepcionista/clientes";
	}
	
	@GetMapping("/crearClientes")
	public String crearClientes() {
		return "/views/recepcionista/crearClientes";
	}
	
	@GetMapping("/crearReservas")
	public String crearReservas() {
		return "/views/recepcionista/crearReservas";
	}

	@GetMapping("/llegadas")
	public String llegadas() {
		return "/views/recepcionista/llegadas";
	}
}
