package com.example.apiServer.controller;

import com.example.apiServer.auth.jwt.CustomJwtFilter;
import com.example.apiServer.dto.treat.TreatResponse;
import com.example.apiServer.entity.Treat;
import com.example.apiServer.service.TreatService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/treat")
@RequiredArgsConstructor
public class TreatController {
    @Autowired
    private TreatService treatService;

    @GetMapping("/")
    public ResponseEntity<Treat> treat(@RequestBody TreatResponse treatResponse){
        Treat treat = treatService.findAllByIdentity();
        return ResponseEntity.ok()
                .body(treat);
    }
}
