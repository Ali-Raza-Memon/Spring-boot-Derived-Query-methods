package com.derivedmethods.service;

import com.derivedmethods.model.Laptop;
import com.derivedmethods.repository.LaptopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LaptopService {


    @Autowired
    private LaptopRepository laptopRepository;

    public Laptop saveLaptop(Laptop laptop){
        return laptopRepository.save(laptop);
    }


    public List<Laptop> saveLaptops(List<Laptop> laptops){
        return laptopRepository.saveAll(laptops);
    }


    public List<Laptop> getLaptop(){
        return laptopRepository.findAll();
    }
    public Laptop getLaptopById(int id){
        return laptopRepository.findById(id).orElse(null);
    }

    public Laptop getLaptopByName(String name){
        return laptopRepository.findByName()
    }








}
