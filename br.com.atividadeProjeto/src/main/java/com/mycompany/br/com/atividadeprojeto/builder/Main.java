package com.mycompany.br.com.atividadeprojeto.builder;

public class Main {

    public static void main(String[] args) {
        // Construção manual
        Personagem customizado = new PersonagemBuilder()
                .setClasse("Mago")
                .setArma("Livro de Feitiços")
                .addHabilidade("Invisibilidade")
                .addHabilidade("Teletransporte")
                .build();

        System.out.println("Personagem Customizado:");
        System.out.println(customizado);

        // Construção com predefinições
        DiretorDePersonagens diretor = new DiretorDePersonagens(new PersonagemBuilder());
        Personagem magoSupremo = diretor.construirMagoSupremo();

        System.out.println("\nMago Supremo:");
        System.out.println(magoSupremo);
    }
}
