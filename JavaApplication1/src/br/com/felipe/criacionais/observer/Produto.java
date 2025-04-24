package br.com.felipe.criacionais.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felipe.8129
 */
public class Produto implements Sujeito{
    
    private String nome;
    private int quantidade;
    private List<Observer> observadores;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.observadores = observadores;
        this.observadores = new ArrayList<>();
    }
    
    public String getNome(){
        return nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public void adicionarObservador(Observer observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for(Observer observador : observadores) {
            observador.atualizar(nome, quantidade);
        }
    }
    
    
    
}
