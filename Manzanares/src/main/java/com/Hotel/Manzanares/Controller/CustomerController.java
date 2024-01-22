package com.Hotel.Manzanares.Controller;

import com.Hotel.Manzanares.Entity.Usuario;
import com.Hotel.Manzanares.Service.CustomerService;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(("/customer"))
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/{id}")
    public Optional<Usuario> getUsuario(@PathVariable Long id){
        return customerService.getUsuario(id);
    }

    @PostMapping("/createUsuario")
    public void createUsuario(@RequestBody Usuario usuario){
        customerService.createUsuario(usuario);
    }

    @DeleteMapping("/deleteUsuario/{dni}")
    public void deleteUsuario(@PathVariable String dni){
        customerService.deleteUsuario(dni);
    }

    @PutMapping("/updateUsuario/{dni}")
    public void updateUsuario(@PathVariable String dni, @RequestBody Usuario usuario){
        customerService.updateUsuario(dni,usuario);
    }
}