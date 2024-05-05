package com.example.apiServer.repository;

import com.example.apiServer.entity.Treat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreatJpaRepository extends JpaRepository<Treat, Long> {
}