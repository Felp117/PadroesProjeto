/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.br.com.atividadeprojeto.composite;

/**
 *
 * @author felipe.8129
 */
public class Main {

    public static void main(String[] args) {
        // Criando arquivos
        Arquivo arquivo1 = new Arquivo("arquivo1.txt", true, false, 100);
        Arquivo arquivo2 = new Arquivo("arquivo2.txt", true, true, 200);

        // Criando diretórios
        Diretorio dir1 = new Diretorio("dir1", true, true);
        Diretorio dir2 = new Diretorio("dir2", false, false);

        // Adicionando arquivos aos diretórios
        dir1.adicionarItem(arquivo1);
        dir1.adicionarItem(arquivo2);

        // Criando um diretório dentro de outro
        Diretorio subDir = new Diretorio("subDir", true, false);
        subDir.adicionarItem(new Arquivo("subfile1.txt", true, false, 50));
        dir2.adicionarItem(subDir);

        // Listar conteúdo
        dir1.listarConteudo();
        dir2.listarConteudo();

        // Calcular tamanhos
        System.out.println("Tamanho total do dir1: " + dir1.calcularTamanho() + " KB");
        System.out.println("Tamanho total do dir2: " + dir2.calcularTamanho() + " KB");

        // Exibir permissões
        dir1.exibirPermissoes();
        dir2.exibirPermissoes();
    }
}
