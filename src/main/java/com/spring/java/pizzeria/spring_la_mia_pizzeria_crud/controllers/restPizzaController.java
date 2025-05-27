package com.spring.java.pizzeria.spring_la_mia_pizzeria_crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.java.pizzeria.spring_la_mia_pizzeria_crud.model.Pizza;
import com.spring.java.pizzeria.spring_la_mia_pizzeria_crud.repo.PizzaRepository;
import com.spring.java.pizzeria.spring_la_mia_pizzeria_crud.services.PizzaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@CrossOrigin
@RequestMapping("/api/pizzas")
public class restPizzaController {

    @Autowired
    PizzaService service;
    // @Autowired
    // private PizzaRepository pizzaRepository;

    @GetMapping
    public List<Pizza> index() {

        return service.findAll();
    }
    


}
