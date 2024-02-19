package com.ysquare.SpringServiceRepository.repository;

import com.ysquare.SpringServiceRepository.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop laptop) {
        System.out.println("Laptop Saved through repository");
    }
}
