package com.mycompany.br.com.felipe.atividade.comportamentais.observer;

import java.util.ArrayList;
import java.util.List;

public class Noticia implements Subject {

    private List<Observer> observadores = new ArrayList<>();

    @Override
    public void adicionarObservador(Observer o) {
        observadores.add(o);
    }

    @Override
    public void removerObservador(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores(String noticia) {
        for (Observer o : observadores) {
            o.atualizar(noticia);
        }
    }

    public void publicarNoticia(String conteudo) {
        System.out.println("📰 Nova notícia publicada: " + conteudo);
        notificarObservadores(conteudo);
    }
}
