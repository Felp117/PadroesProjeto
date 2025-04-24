package com.mycompany.br.com.atividadeprojeto.builder;

public class PersonagemBuilder {

    private Personagem personagem;

    public PersonagemBuilder() {
        this.personagem = new Personagem();
    }

    public PersonagemBuilder setClasse(String classe) {
        personagem.setClasse(classe);
        return this;
    }

    public PersonagemBuilder setArma(String arma) {
        personagem.setArma(arma);
        return this;
    }

    public PersonagemBuilder addHabilidade(String habilidade) {
        personagem.addHabilidade(habilidade);
        return this;
    }

    public Personagem build() {
        return personagem;
    }
}
