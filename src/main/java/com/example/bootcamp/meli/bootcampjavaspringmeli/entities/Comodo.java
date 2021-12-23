package com.example.bootcamp.meli.bootcampjavaspringmeli.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Setar getters e setters
@AllArgsConstructor //gera o construtor cheio com todos argumentos
@NoArgsConstructor
public class Comodo {
    private String nome;
    private double largura;
    private double comprimento;

}