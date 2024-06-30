package com.univer.students.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class ProductosController {
    @PostMapping
    public ResponseEntity<String> save2(@RequestBody ProductoResquest resquest){
        
    }

}
