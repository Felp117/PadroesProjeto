package com.mycompany.br.com.atividadeprojeto.builder;

import java.util.ArrayList;
import java.util.List;

public class Personagem {

    private String classe;
    private String arma;
    private List<String> habilidades;

    public Personagem() {
        this.habilidades = new ArrayList<>();
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void addHabilidade(String habilidade) {
        this.habilidades.add(habilidade);
    }

    @Override
    public String toString() {
        return "Classe: " + classe
                + "\nArma: " + arma
                + "\nHabilidades: " + String.join(", ", habilidades);
    }
}
