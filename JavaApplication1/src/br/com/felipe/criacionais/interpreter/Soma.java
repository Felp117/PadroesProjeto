package br.com.felipe.criacionais.interpreter;

import br.com.felipe.criacionais.interpreter.Expressao;

/**
 *
 * @author felipe.8129
 */
public class Soma implements Expressao {

    private Expressao esquerda, direita;

    public Soma(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int interpretar() {
        return esquerda.interpretar() + direita.interpretar();
    }
    
}
