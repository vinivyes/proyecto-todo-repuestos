package com.todorepuestos.controller;

import com.todorepuestos.domain.Orden;
import com.todorepuestos.domain.Repuesto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HistorialController {
    
    List<Orden> ordenes = new ArrayList<Orden>();
     
    @GetMapping("/historial/listado")
    public String inicio(Model model) {
      
        ordenes.add(new Orden(
            new Date(1455142134), 
            "test@test.com", 
            "Pendiente Pago", 
            null, 
            new Date(1455142134), 
            null, 
            "Domicilio", 
            "Teste de Direccion", 
            Long.parseLong("0"), 
            "Tarjeta"
        ));
        
        ordenes.add(new Orden(
            new Date(1455142134), 
            "test2@test.com", 
            "Completo", 
            null, 
            new Date(1455142134), 
            null, 
            "Domicilio", 
            "Teste de Direccion", 
            Long.parseLong("0"), 
            "Tarjeta"
        ));
        
        model.addAttribute("ordenes",ordenes);

        return "/historial/listado";
    }
}
