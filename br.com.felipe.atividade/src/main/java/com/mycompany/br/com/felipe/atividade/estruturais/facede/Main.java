package com.mycompany.br.com.felipe.atividade.estruturais.facede;

public class Main {
    public static void main(String[] args) {
        BibliotecaFacade biblioteca = new BibliotecaFacade();

        // 1. Registrar novo usuário
        biblioteca.registrarNovoUsuario("Ana Paula");

        System.out.println();

        // 2. Buscar e locar livro
        biblioteca.buscarELocarLivro("A Revolução dos Bichos", "Ana Paula");

        System.out.println();

        // 3. Devolver livro
        biblioteca.devolverLivro("A Revolução dos Bichos", "Ana Paula");
    }
}
