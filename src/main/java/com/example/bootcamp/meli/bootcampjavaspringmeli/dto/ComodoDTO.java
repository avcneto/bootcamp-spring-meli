package com.example.bootcamp.meli.bootcampjavaspringmeli.dto;

import com.example.bootcamp.meli.bootcampjavaspringmeli.entities.Comodo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Setar getters e setters
@AllArgsConstructor //gera o construtor cheio com todos argumentos
@NoArgsConstructor
public class ComodoDTO {
    private Comodo comodos;
    private Double metrosQuadrados;
}