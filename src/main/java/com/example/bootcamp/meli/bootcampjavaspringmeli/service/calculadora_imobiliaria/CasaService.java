package com.example.bootcamp.meli.bootcampjavaspringmeli.service.calculadora_imobiliaria;


import com.example.bootcamp.meli.bootcampjavaspringmeli.dto.ComodoDTO;
import com.example.bootcamp.meli.bootcampjavaspringmeli.entities.Casa;
import com.example.bootcamp.meli.bootcampjavaspringmeli.entities.Comodo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CasaService {
    public double metroQuadrados(Casa casa) {
        double metrosTotais = 0;

        for (Comodo cmd : casa.getComodos()) {
            metrosTotais += cmd.getComprimento() * cmd.getLargura();
        }
        return metrosTotais;
    }

    public double valorCasa(Casa casa) {
        return metroQuadrados(casa) * 800;
    }

    public Comodo maiorComodo(Casa casa) {
        double comodoMaior = 0;

        Comodo comodos = new Comodo();

        for (Comodo cmd : casa.getComodos()) { //percorrendo todos os comodos da casa
            double m = cmd.getComprimento() * cmd.getLargura();
            if (m > comodoMaior) {
                comodos = cmd;
                comodoMaior = m;
            }
        }
        return comodos;
    }

    public List<ComodoDTO> areaComodos(Casa casa) {
        List<ComodoDTO> comodoDTO = new ArrayList<>();
        for (Comodo cmd : casa.getComodos()) {
            comodoDTO.add(new ComodoDTO(cmd, cmd.getComprimento() * cmd.getLargura()));
        }
        return comodoDTO;
    }
}