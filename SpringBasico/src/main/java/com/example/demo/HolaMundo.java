package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Indicamos que es un controlador REST
@RestController
public class HolaMundo {

    // Indica que el método se ejecutará cuando se haga una petición GET a la URL raiz '/'
    @RequestMapping("/")
    public String hola(){
        return "Hola Mundo";
    }
}
