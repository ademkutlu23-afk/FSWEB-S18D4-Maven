package com.workintech.s18d1.controller;

import com.workintech.s18d1.dao.BurgerDao;
import com.workintech.s18d1.entity.Burger;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/burger")
public class BurgerController {

    private final BurgerDao burgerDao;
    public BurgerController(BurgerDao burgerDao) {
        this.burgerDao = burgerDao;
    }
    @GetMapping
    public List<Burger> findAll(){
        return burgerDao.findAll();
    }
    @GetMapping("/{id}")
    public Burger findById(@PathVariable int id){
        return burgerDao.findById(id);
    }
    @PostMapping
    public Burger create (@RequestBody Burger burger){
        return burgerDao.save(burger);
    }
    @GetMapping("/price/{price}")
    public List<Burger> getByPrice(@PathVariable double price){
        return burgerDao.findByPrice(price);
    }
}
