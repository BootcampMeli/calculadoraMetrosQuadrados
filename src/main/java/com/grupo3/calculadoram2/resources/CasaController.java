package com.grupo3.calculadoram2.resources;

import com.grupo3.calculadoram2.domain.Casa;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/casa")
public class CasaController {

    private Casa casa;

    @GetMapping
    public Casa getCasa(){
        return casa;
    }

    @PostMapping
    public Casa addCasa(@RequestBody Casa casa){
        this.casa = casa;

        return this.casa;
    }

}