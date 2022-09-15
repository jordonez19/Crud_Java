package com.sinfloo.demo.controller;
import com.sinfloo.demo.interfaceService.IpersonaService;
import com.sinfloo.demo.modelo.User;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class Controlador {
    
    @Autowired
    private IpersonaService service;
    
    @GetMapping(value = "/listar")
    public String listar(Model model){
        List<User> users = service.listar();
        model.addAttribute("personas" , users);
        return "index-testing";
        /* averiguar atributo users */
    }

    @GetMapping(value = "/nuevo")
    public String agregar(Model model){
        model.addAttribute("persona" , new User());
        return "form";
    }
    @PostMapping("/save")
    public String save(@Validated User p, Model model){
        service.save(p);
        return  "redirect:/listar";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<User> persona = service.listarId(id);
        model.addAttribute("persona",persona);
        return "form";
    }


    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable int id, Model model){
        service.delete(id);
        return  "redirect:/listar";

    }


}
