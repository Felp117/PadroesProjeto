package br.com.felipe.criacionais.interpreter;
/**
 *
 * @author felipe.8129
 */
public class Subtracao implements Expressao {

    public Expressao esquerda, direita;

    public Subtracao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int interpretar() {
        return esquerda.interpretar() - direita.interpretar();
    }
}
