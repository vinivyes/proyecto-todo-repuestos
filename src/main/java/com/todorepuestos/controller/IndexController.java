
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
        marcas.add(new Marca("BMW","https://seeklogo.com/images/B/bmw-logo-248C3D90E6-seeklogo.com.png","Repuestos BMW"));
        marcas.add(new Marca("Audi","https://s1.cdn.autoevolution.com/images/news/audi-reveals-updated-logo-10315_1.jpg","Repuestos Audi"));
        marcas.add(new Marca("Fiat","https://i.pinimg.com/originals/02/9a/49/029a490fc0db2e3f9bee94254b38188a.png","Repuestos Fiat"));
        marcas.add(new Marca("Mercedes Benz","https://logos-download.com/wp-content/uploads/2016/02/Mercedes-Benz_Logo_2011.png","Repuestos Mercedes Benz"));
        marcas.add(new Marca("Toyota","https://1000logos.net/wp-content/uploads/2021/04/Toyota-logo.png","Repuestos Toyota"));
        model.addAttribute("Marcas", marcas);
        return "index";
    }
}
