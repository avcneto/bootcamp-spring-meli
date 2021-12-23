package com.example.bootcamp.meli.bootcampjavaspringmeli.controller.calculadora_imobiliaria;

import com.example.bootcamp.meli.bootcampjavaspringmeli.dto.ComodoDTO;
import com.example.bootcamp.meli.bootcampjavaspringmeli.entities.Casa;
import com.example.bootcamp.meli.bootcampjavaspringmeli.entities.Comodo;
import com.example.bootcamp.meli.bootcampjavaspringmeli.service.calculadora_imobiliaria.CasaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CasaController {
    @Autowired
    private CasaService casaService;

    @PostMapping("/area/nomeDaCasa")
    public double getMetrosQuadrados(@RequestBody Casa casa) {
        return casaService.metroQuadrados(casa);
    }

    @PostMapping("/valor/nomeDaCasa")
    public double getValorCasa(@RequestBody Casa casa) {
        return casaService.valorCasa(casa);
    }

    @PostMapping("/maiorComodo/nomeDaCasa")
    public Comodo getMaiorComodo(@RequestBody Casa casa) {
        return casaService.maiorComodo(casa);
    }

    @PostMapping("/areaComodos/nomeDaCasa")
    public List<ComodoDTO> getAreaComodos(@RequestBody Casa casa) {
        return casaService.areaComodos(casa);
    }
}