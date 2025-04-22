package com.mycompany.br.com.felipe.atividade.comportamentais.observer;

public interface Subject {

    void adicionarObservador(Observer o);

    void removerObservador(Observer o);

    void notificarObservadores(String noticia);
}
