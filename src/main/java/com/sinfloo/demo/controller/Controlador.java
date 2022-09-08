package com.sinfloo.demo.controller;

import com.sinfloo.demo.interfaceService.IpersonaService;
import com.sinfloo.demo.interfaces.IPersona;
import com.sinfloo.demo.modelo.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class Controlador {
    
    @Autowired
    private IpersonaService service;
    
    @GetMapping(value = "/listar")
    public String listar(Model model){
        List<Persona>personas = service.listar();
        model.addAttribute("personas", personas);
        return "index";
    }
    
}
