package com.grupo3.calculadoram2.resources;

import com.grupo3.calculadoram2.domain.Casa;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/casa")
public class CasaController {

    private Casa casa;

    @GetMapping
    public ResponseEntity<Casa> getCasa(){
        return ResponseEntity.ok().body(this.casa);
    }

    @PostMapping
    public ResponseEntity<Object> addCasa(@RequestBody Casa casa){
        this.casa = casa;

        return ResponseEntity.status(201).build();
    }

}