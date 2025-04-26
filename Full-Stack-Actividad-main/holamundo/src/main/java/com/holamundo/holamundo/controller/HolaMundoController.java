package com.holamundo.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class HolaMundoController {

    @GetMapping("/h")
    public String holaMundo() {
        return "Hola mundo";
    }

    @GetMapping("/holanombre/{nombre}/{edad}")
    public String holaMundoNombre(@PathVariable String nombre, @PathVariable int edad){
    return "¡Hola Mundo! " + nombre +" Tu edad es: " + edad;
    }

    @GetMapping("/usuario")
    public String obeternerUsuario(@RequestParam String name ) {
        return "Hola " + name;
    }
// hola
}
