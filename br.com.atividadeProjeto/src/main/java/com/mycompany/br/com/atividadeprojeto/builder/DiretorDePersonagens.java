package com.mycompany.br.com.atividadeprojeto.builder;

public class DiretorDePersonagens {

    private PersonagemBuilder builder;

    public DiretorDePersonagens(PersonagemBuilder builder) {
        this.builder = builder;
    }

    public Personagem construirMagoSupremo() {
        return builder
                .setClasse("Mago")
                .setArma("Cajado Arcano")
                .addHabilidade("Bola de Fogo")
                .addHabilidade("Tempestade Arcana")
                .addHabilidade("Escudo Mágico")
                .build();
    }

    public Personagem construirGuerreiroTanque() {
        return builder
                .setClasse("Guerreiro")
                .setArma("Espada e Escudo")
                .addHabilidade("Provocação")
                .addHabilidade("Resistência Imbatível")
                .addHabilidade("Investida")
                .build();
    }

    public Personagem construirArqueiroFurtivo() {
        return builder
                .setClasse("Arqueiro")
                .setArma("Arco Longo")
                .addHabilidade("Tiro Preciso")
                .addHabilidade("Camuflagem")
                .addHabilidade("Armamento Explosivo")
                .build();
    }
}
