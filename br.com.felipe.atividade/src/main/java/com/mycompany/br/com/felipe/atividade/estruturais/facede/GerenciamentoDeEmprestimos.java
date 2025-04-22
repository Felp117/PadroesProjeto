package com.mycompany.br.com.felipe.atividade.estruturais.facede;

public class GerenciamentoDeEmprestimos {

    public void emprestarLivro(String titulo, String usuario) {
        System.out.println("Livro '" + titulo + "' emprestado para " + usuario);
    }

    public void devolverLivro(String titulo, String usuario) {
        System.out.println(" Livro '" + titulo + "' devolvido por " + usuario);
    }
}
