package br.com.felipe.antiPadroes.estruturais.composit;
/**
 *
 * @author felipe.8129
 */
public class Main {
    public static void main(String[] args) {
        Produto cerveja = new Produto("Cerveja 100ML", 3.99);
        Caixa caixa = new Caixa("Caixa de cerveja", cerveja, 12);
        Fardo fardo = new Fardo("Fardo de cerveja", caixa, 24);
        
        double total = fardo.getPreco();
        System.out.println("Total da Compra: R$" + total);
    }
}
