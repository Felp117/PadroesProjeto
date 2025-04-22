/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.br.com.felipe.atividade.estruturais.facede;

/**
 *
 * @author felipe.8129
 */
public class BibliotecaFacade {

    private CatalogoDeLivros catalogo = new CatalogoDeLivros();
    private RegistroDeUsuarios registro = new RegistroDeUsuarios();
    private GerenciamentoDeEmprestimos emprestimos = new GerenciamentoDeEmprestimos();
    private Notificacoes notificacoes = new Notificacoes();

    public void registrarNovoUsuario(String nomeUsuario) {
        registro.registrarUsuario(nomeUsuario);
    }

    public void buscarELocarLivro(String tituloLivro, String nomeUsuario) {
        catalogo.buscarLivro(tituloLivro);
        emprestimos.emprestarLivro(tituloLivro, nomeUsuario);
        notificacoes.enviarNotificacao(nomeUsuario, "Você retirou o livro: " + tituloLivro);
    }

    public void devolverLivro(String tituloLivro, String nomeUsuario) {
        emprestimos.devolverLivro(tituloLivro, nomeUsuario);
        notificacoes.enviarNotificacao(nomeUsuario, "Obrigado por devolver o livro: " + tituloLivro);
    }
}
