package com.example.demo;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class ClockMachineDao {

    @PersistenceContext
    private EntityManager entityManager;

    public ClockMachine save(ClockMachine clockMachine){
        entityManager.persist(clockMachine);
        return clockMachine;
    }

    public List<ClockMachine> list(){
        return entityManager
            .createQuery("select c from ClockMachine c", ClockMachine.class).getResultList();
    }

}