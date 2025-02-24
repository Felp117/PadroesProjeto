package br.com.felipe.criacionais.singleton;
/**
 *
 * @author felipe.8129
 */
public class Main {
    public static void main(String[] args) {
        
        Singleton single = Singleton.getInstancia();
        Singleton single2 = Singleton.getInstancia();
        
        single.mostrarMensagem();
        
        //verificar se as instancias são iguais
        
        if(single == single2) {
            System.out.println("As instancias sao iguais");
        } else {
            System.out.println("As instancias sao diferentes");
        }
    }
}
