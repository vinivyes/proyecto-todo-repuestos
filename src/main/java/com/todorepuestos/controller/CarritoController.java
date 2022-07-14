package com.todorepuestos.controller;

import com.todorepuestos.domain.Carrito;
import com.todorepuestos.domain.Orden;
import com.todorepuestos.domain.Marca;
import com.todorepuestos.domain.Repuesto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarritoController {
    
    public List<Carrito> carrito = new ArrayList<Carrito>();
    
    //Añadir pruebas al carrito
    public CarritoController() {
        
        carrito.add(new Carrito(new Repuesto(new Marca("Volkswagen"), "Motor", "https://servicios.educacionvial.go.cr/Images/logo-dgev.png", "Test", 950000.00), 2));
        carrito.add(new Carrito(new Repuesto(new Marca("Chevrolet"), "Suspensión", "https://servicios.educacionvial.go.cr/Images/logo-dgev.png", "Test 2", 250000.00), 5));
           
    }
    
    @GetMapping("/carrito")
    public String inicio(Model model) {
           
        model.addAttribute("carrito",carrito);

        return "/carrito/index";
    }
}
