package br.com.felipe.antiPadroes.interpreter;
/**
 *
 * @author felipe.8129
 */
public class Main {
    
    public static void main(String[] args) {
        
       Interpretador interpretador = new Interpretador();
    
        System.out.println(interpretador.interpretar("20 + 8"));
        System.out.println(interpretador.interpretar("20 - 8"));
    }
}
