/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.br.com.felipe.atividade.comportamentais.observer;

public class Main {

    public static void main(String[] args) {
        Noticia plataforma = new Noticia();

        // Criando assinantes
        Observer leitor1 = new Leitor("Carlos");
        Observer leitor2 = new Leitor("Ana");
        Observer jornalista1 = new Jornalista("Fernanda");

        // Inscrevendo-os na plataforma
        plataforma.adicionarObservador(leitor1);
        plataforma.adicionarObservador(leitor2);
        plataforma.adicionarObservador(jornalista1);

        // Publicando uma notícia
        plataforma.publicarNoticia("Nova biblioteca é inaugurada no centro da cidade!");

        System.out.println();

        // Removendo um observador e publicando nova notícia
        plataforma.removerObservador(leitor2);
        plataforma.publicarNoticia("Prefeitura anuncia reformas em escolas municipais.");
    }
}
