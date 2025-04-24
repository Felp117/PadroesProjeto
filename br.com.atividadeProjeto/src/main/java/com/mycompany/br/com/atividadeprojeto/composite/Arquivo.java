/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.br.com.atividadeprojeto.composite;

/**
 *
 * @author felipe.8129
 */
public class Arquivo extends FileSystemItem {

    private int tamanho;  // tamanho do arquivo em KB

    public Arquivo(String nome, boolean podeLer, boolean podeEscrever, int tamanho) {
        super(nome, podeLer, podeEscrever);
        this.tamanho = tamanho;
    }

    @Override
    public void listarConteudo() {
        System.out.println("Arquivo: " + nome);
    }

    @Override
    public int calcularTamanho() {
        return tamanho;
    }

    @Override
    public void exibirPermissoes() {
        System.out.println("Permissões do arquivo " + nome + ":");
        System.out.println("Pode ler: " + podeLer);
        System.out.println("Pode escrever: " + podeEscrever);
    }
}
