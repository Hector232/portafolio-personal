package com.example.MiPrimwerServidorWeb;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello(){

        return "hola desde mi controlador spring";

    }

    @GetMapping("/saludo")
    public String saludar(@RequestParam String nombre){

        return "Hola " + nombre + " este es mi servidor";

    }

    @PostMapping("/mensaje")
    public String recibirMensaje(@RequestBody String mensaje){

        return "Recibi tu mensaje" + mensaje;

    }



}
