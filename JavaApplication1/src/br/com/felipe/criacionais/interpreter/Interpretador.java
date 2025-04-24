package br.com.felipe.criacionais.interpreter;
/**
 *
 * @author felipe.8129
 */
public class Interpretador {
    
    public static Expressao construirExpressao(String expressao) {
        String[] partes = expressao.split(" ");
        Expressao esquerda = new Numero(Integer.parseInt(partes[0]));
        String operador = partes[1];
        Expressao direita = new Numero(Integer.parseInt(partes[0]));
        
        if(operador.equals("+")){
            return new Soma(esquerda, direita);
        } else if(operador.equals("-")) {
            return new Subtracao(esquerda, direita);
        } else {
            throw new IllegalArgumentException("Operador desconhecido: " + operador);
        }
    } 
}
