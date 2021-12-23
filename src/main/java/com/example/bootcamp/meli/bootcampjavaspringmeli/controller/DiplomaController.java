package com.example.bootcamp.meli.bootcampjavaspringmeli.controller;

import com.example.bootcamp.meli.bootcampjavaspringmeli.model.Aluno;
import com.example.bootcamp.meli.bootcampjavaspringmeli.model.Disciplina;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.example.bootcamp.meli.bootcampjavaspringmeli.model.Aluno.getPassou;

@RestController
public class DiplomaController {

    @PostMapping("/aluno")
    public boolean getDiploma(@RequestBody Aluno aluno) {
        return getPassou(aluno);
    }
}
