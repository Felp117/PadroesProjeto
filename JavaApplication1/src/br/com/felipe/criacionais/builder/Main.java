package br.com.felipe.criacionais.builder;
/**
 *
 * @author felipe.8129
 */
public class Main {
    
    public static void main(String[] args) {
         Casa casaSimples = new Builder()
                 .comParedes("Parede de tijolo")
                 .Comjanela(5)
                 .ComTelhado("Telhado de barro")
                 .ComPorta(3).build();
         
        Casa casaCompleta = new Builder()
            .comParedes("Parede de tijolo reforcado")
                 .Comjanela(8)
                 .ComTelhado("Telhado de concreto")
                 .ComPorta(9)
                .ComPiscina(1).build();
        
        System.out.println(casaSimples.toString());
        System.out.println(casaCompleta.toString());
    }
}
