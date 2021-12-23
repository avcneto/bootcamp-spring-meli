package com.example.bootcamp.meli.bootcampjavaspringmeli.controller.obter_diploma;

import com.example.bootcamp.meli.bootcampjavaspringmeli.model.obter_diploma.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DiplomaController {
    @Autowired
    private static Aluno aluno;

    @PostMapping("/aluno")
    public String getDiploma(@RequestBody Aluno aluno) {
        boolean passou = aluno.getPassou(aluno);
        if (passou) {
            return aluno.getFormado(aluno);
        } else {
            return aluno.getReprovado(aluno);
        }
    }
}