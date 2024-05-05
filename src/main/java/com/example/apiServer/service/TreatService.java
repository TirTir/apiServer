package com.example.apiServer.service;

import com.example.apiServer.entity.Treat;
import com.example.apiServer.repository.TreatRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TreatService {
    @Autowired
    private TreatRepository treatRepository;

    // 진료 내역
    @Transactional
    public Treat findById(Long id){
        Optional<Treat> treat = treatRepository.findById(id);
        return treat.get();
    }

    @Transactional
    public List<Treat> findAllByIdentity(String identity){
        return treatRepository.findAllByIdentity(identity);
    }
}
