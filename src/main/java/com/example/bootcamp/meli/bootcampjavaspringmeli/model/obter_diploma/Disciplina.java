package com.example.bootcamp.meli.bootcampjavaspringmeli.model.obter_diploma;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


@Data
@AllArgsConstructor
public class Disciplina {
    private String nome;
    private double nota;

    public static double getMedia(List<Disciplina> disciplinas) {
        return disciplinas.stream()
                .map(Disciplina::getNota)
                .reduce(0.0, Double::sum) / disciplinas.size();
    }
}
