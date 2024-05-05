package com.example.apiServer.controller;

import com.example.apiServer.service.TreatService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class TreatController {
    @Autowired
    private TreatService treatService;
}
