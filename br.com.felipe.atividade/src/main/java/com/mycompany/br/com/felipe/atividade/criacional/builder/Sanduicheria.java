package com.mycompany.br.com.felipe.atividade.criacional.builder;

public class Sanduicheria {

    public static void main(String[] args) {
        // Sanduíche básico
        Sanduiche sanduicheBasico = new Sanduiche.Builder()
                .comPao("Pão branco")
                .comCarne("Presunto")
                .build();

        // Sanduíche completo
        Sanduiche sanduicheCompleto = new Sanduiche.Builder()
                .comPao("Pão integral")
                .comCarne("Peito de frango")
                .comQueijo("Cheddar")
                .comAlface(true)
                .comTomate(true)
                .comMolho("Barbecue")
                .build();

        // Outro exemplo gourmet
        Sanduiche gourmet = new Sanduiche.Builder()
                .comPao("Ciabatta")
                .comCarne("Rosbife")
                .comQueijo("Brie")
                .comAlface(true)
                .comTomate(false)
                .comMolho("Mostarda Dijon")
                .build();

        // Imprimindo os resultados
        System.out.println(sanduicheBasico);
        System.out.println(sanduicheCompleto);
        System.out.println(gourmet);
    }
}
