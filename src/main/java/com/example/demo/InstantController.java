package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InstantController {

    @Autowired
    ClockMachineDao myDao;

    @PostMapping
    public ClockMachine save(@RequestBody ClockMachine clockMachine){
        myDao.save(clockMachine);
        return clockMachine;
    }

    @GetMapping
    public List<ClockMachine> list(){
        return myDao.list();
    }
}
