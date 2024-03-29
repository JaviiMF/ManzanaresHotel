package com.Hotel.Manzanares.Controller;

import com.Hotel.Manzanares.Entity.Usuario;
import com.Hotel.Manzanares.Request.LoginRequest;
import com.Hotel.Manzanares.Service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;
import lombok.AllArgsConstructor;

@Controller
@RequestMapping(("/customer"))
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/{id}")
    public Optional<Usuario> getUsuario(@PathVariable Long id){
        return customerService.getUsuario(id);
    }

    /*@PostMapping("/createUsuario")
    public void createUsuario(@RequestBody Usuario usuario){
        customerService.createUsuario(usuario);
    }
*/
    @PostMapping("/createUsuario")
    public String createUsuario(@ModelAttribute Usuario usuario, Model model){
        customerService.createUsuario(usuario);
        return "/views/hotel/habitaciones";
    }
    @GetMapping("/login")
    public String mostrarFormularioLogin(Model model) {
        System.out.println("Holaaaaaaaaaaa");
        model.addAttribute("usuario", new Usuario());
        model.addAttribute("LoginRequest", new LoginRequest());
        return "login"; // Nombre de la vista Thymeleaf (sin extensión)
    }

    @GetMapping("/checkout")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("usuario", new Usuario());
        model.addAttribute("LoginRequest", new LoginRequest());
        return "views/hotel/checkout";
    }



    @DeleteMapping("/deleteUsuario/{dni}")
    public void deleteUsuario(@PathVariable String dni){
        customerService.deleteUsuario(dni);
    }

    @PutMapping("/updateUsuario/{dni}")
    public void updateUsuario(@PathVariable String dni, @RequestBody Usuario usuario){
        customerService.updateUsuario(dni,usuario);
    }

    @GetMapping("/all")
    public List<Usuario> getAllUsuarios(){
        return customerService.getAllUsuarios();
    }

    @PostMapping("/login")
    public String loginUsuario(@ModelAttribute LoginRequest loginRequest){
        String vista = "";

        if(customerService.loginUsuario(loginRequest).equals("Recepcionista")){
            vista = "views/recepcionista/clientes";
        } else if (customerService.loginUsuario(loginRequest).equals("Webmaster")){
            vista = "views/webmaster/habitaciones";
        } else {
            vista = "Home";
        }

        return vista;
    }
}