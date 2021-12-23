package com.example.bootcamp.meli.bootcampjavaspringmeli.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Aluno {
    private String nome;
    private List<Disciplina> disciplinas;

    private double getMedia(List<Disciplina> disciplinas) {
        return disciplinas.stream()
                .map(Disciplina::getNota)
                .reduce(0.0, Double::sum) / disciplinas.size();
    }

    public static boolean getPassou(Aluno aluno) {
        return aluno.getMedia(aluno.disciplinas) > 9;
    }
}
