package com.ysquare.SpringServiceRepository.service;

import com.ysquare.SpringServiceRepository.model.Laptop;
import com.ysquare.SpringServiceRepository.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository laptopRepository;
    public void addLaptop(Laptop laptop) {
        System.out.println("Laptop added..");
        laptopRepository.save(laptop);
    }

    public  boolean isGoodForProgramming(Laptop laptop) {
        return true;
    }
}
