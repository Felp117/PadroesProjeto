/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.br.com.atividadeprojeto.composite;

/**
 *
 * @author felipe.8129
 */
public abstract class FileSystemItem {

    protected String nome;
    protected boolean podeLer;
    protected boolean podeEscrever;

    public FileSystemItem(String nome, boolean podeLer, boolean podeEscrever) {
        this.nome = nome;
        this.podeLer = podeLer;
        this.podeEscrever = podeEscrever;
    }

    public abstract void listarConteudo();

    public abstract int calcularTamanho();

    public abstract void exibirPermissoes();

    public boolean podeLer() {
        return podeLer;
    }

    public boolean podeEscrever() {
        return podeEscrever;
    }
}
