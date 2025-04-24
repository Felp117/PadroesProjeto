package br.com.felipe.criacionais.templateMethod;

/**
 *
 * @author felipe.8129
 */
public class main {
    public static void main(String[] args) {
        
        Bebida cha = new cha();
        System.out.println("Preparando chá");
        cha.preparar();
        
        Bebida cafe = new Cafe();
        System.out.println("Preparando café");
        cafe.preparar();
    }
    
}
