package com.example.apiServer.controller;

import com.example.apiServer.dto.treat.TreatResponse;
import com.example.apiServer.service.TreatService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/treat")
@RequiredArgsConstructor
public class TreatController {
    @Autowired
    private TreatService treatService;

    @PostMapping("/")
    public ResponseEntity<TreatResponse> treat(@RequestBody )
}
