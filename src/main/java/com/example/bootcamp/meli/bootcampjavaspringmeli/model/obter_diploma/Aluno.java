package com.example.bootcamp.meli.bootcampjavaspringmeli.model.obter_diploma;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

import static com.example.bootcamp.meli.bootcampjavaspringmeli.model.obter_diploma.Disciplina.getMedia;

@Data
@AllArgsConstructor
public class Aluno {
    private String nome;
    private List<Disciplina> disciplinas;

    public String getFormado(Aluno aluno) {
        return "Aluno: " + aluno.getNome() + "\n" +
                "Média: " + getMedia(aluno.disciplinas) + "\n" +
                "Você foi aprovado!!! \n" +
                ",_\n" +
                "| `\"\"---..._____\n" +
                "'-...______    _````\"\"\"\"\"\"\"'`|\n" +
                "       \\   ```` ``\"---...__  |\n" +
                "       |`              |   ``!\n" +
                "       |               |     A \n" +
                "       |               /\\   /#\\\n" +
                "       /`--..______..-'  |  ###\n" +
                "      |   /  `\\    /`--. |  ###\n" +
                "     _|  |  .-;`-./;-.  ||  ###\n" +
                "    / \\  \\ /\\_|    |_/\\ //\\ ##'\n" +
                "    |  `-' \\__/ _  \\__/ |  |`#\n" +
                "    \\_,                 /_/\n" +
                "       `\\              /\n" +
                "         '.  '.__.'  .'\n" +
                "           `-,____,-'\n" +
                "            /\"\"\"I\"\"\\\n" +
                "           /`---'--'\\";
    }

    public String getReprovado(Aluno aluno) {
        return "Aluno: " + aluno.getNome() + "\n" +
                "Média: " + getMedia(aluno.disciplinas) + "\n" +
                "Você foi Reprovado!!!\n" +
                "\\|/\n" +
                "- o -\n" +
                "/-`-.\n" +
                ":   :\n" +
                ":TNT:\n" +
                ":___:\n";
    }


    public boolean getPassou(Aluno aluno) {
        return getMedia(aluno.disciplinas) > 9;
    }
}
