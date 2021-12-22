package com.example.bootcamp.meli.bootcampjavaspringmeli.controller;

import com.example.bootcamp.meli.bootcampjavaspringmeli.model.NumeroRomanos;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumeroRomanoController {

    @GetMapping("/converterromanos/{number}")
    public ResponseEntity<String> getNumeroRomano(@PathVariable Integer number) {
        String result = NumeroRomanos.intToRoman(number);

        if (number != null) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.status(404).build();
    }
}
