/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.br.com.atividadeprojeto.composite;

/**
 *
 * @author felipe.8129
 */
import java.util.ArrayList;
import java.util.List;

public class Diretorio extends FileSystemItem {

    private List<FileSystemItem> itens;

    public Diretorio(String nome, boolean podeLer, boolean podeEscrever) {
        super(nome, podeLer, podeEscrever);
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(FileSystemItem item) {
        itens.add(item);
    }

    public void removerItem(FileSystemItem item) {
        itens.remove(item);
    }

    @Override
    public void listarConteudo() {
        System.out.println("Diretório: " + nome);
        for (FileSystemItem item : itens) {
            item.listarConteudo();
        }
    }

    @Override
    public int calcularTamanho() {
        int tamanhoTotal = 0;
        for (FileSystemItem item : itens) {
            tamanhoTotal += item.calcularTamanho();
        }
        return tamanhoTotal;
    }

    @Override
    public void exibirPermissoes() {
        System.out.println("Permissões do diretório " + nome + ":");
        System.out.println("Pode ler: " + podeLer);
        System.out.println("Pode escrever: " + podeEscrever);
        for (FileSystemItem item : itens) {
            item.exibirPermissoes();
        }
    }
}
