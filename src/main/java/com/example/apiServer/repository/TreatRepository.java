package com.example.apiServer.repository;

import com.example.apiServer.entity.Treat;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TreatRepository {
    @Autowired
    private EntityManager em;

    public void save (Treat treat){
        em.persist(treat);
    }

    public List<Treat> findAll(int id){
        return em.createQuery("select t from Treat t", Treat.class)
                .getResultList();
    }
}