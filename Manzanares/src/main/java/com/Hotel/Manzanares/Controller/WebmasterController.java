package com.Hotel.Manzanares.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/views/webmaster")
public class WebmasterController {
	
	@GetMapping("/crearHabitaciones")
	public String crearHabitaciones() {
		return "/views/webmaster/crearHabitaciones";
	}

	@GetMapping("/crearOfertas")
	public String crearOfertas() {
		return "/views/webmaster/crearOfertas";
	}

	@GetMapping("/crearServicios")
	public String crearServicios() {
		return "/views/webmaster/crearServicios";
	}

	@GetMapping("/crearUsuarios")
	public String crearUsuarios() {
		return "/views/webmaster/crearUsuarios";
	}

	@GetMapping("/habitaciones")
	public String habitaciones() {
		return "/views/webmaster/habitaciones";
	}

	@GetMapping("/ofertas")
	public String ofertas() {
		return "/views/webmaster/ofertas";
	}

	@GetMapping("/servicios")
	public String servicios() {
		return "/views/webmaster/servicios";
	}

	@GetMapping("/usuarios")
	public String usuarios() {
		return "/views/webmaster/usuarios";
	}
}
