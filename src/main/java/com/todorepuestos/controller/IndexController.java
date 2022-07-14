
package com.todorepuestos.controller;

import com.todorepuestos.domain.Marca;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {
    
    List<Marca> marcas = new ArrayList<Marca>();
    
    @GetMapping("/")
    public String inicio(Model model) {
        
        marcas.add(new Marca("Volkswagen","https://www.carlogos.org/logo/Volkswagen-emblem-2014-1920x1080.png","Repuestos Volkswagen"));
        
        return "index";
    }
}
