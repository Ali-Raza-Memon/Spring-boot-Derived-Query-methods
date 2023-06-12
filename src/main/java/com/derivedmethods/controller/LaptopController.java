package com.derivedmethods.controller;


import com.derivedmethods.model.Laptop;
import com.derivedmethods.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController {

    @Autowired
    private LaptopService service;




    @PostMapping("/addLaptop")
    public Laptop addLaptop(@RequestBody Laptop laptop){
        return service.saveLaptop(laptop);
    }



}
