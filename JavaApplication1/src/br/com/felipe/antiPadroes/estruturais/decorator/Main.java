package br.com.felipe.antiPadroes.estruturais.decorator;

/**
 *
 * @author felipe.8129
 */
public class Main {
    public static void main(String[] args) {
        Cafe cafeSimples = new Cafe();
        System.out.println(cafeSimples.getDescricao() + " = R$" + cafeSimples.getPreco());
        
        Cafe cafeComAcucar = new CafeComAcucar();
        System.out.println(cafeComAcucar.getDescricao() + " = R$" + cafeComAcucar.getPreco());
        
        Cafe cafeComLeite = new CafeComleite();
        System.out.println(cafeComLeite.getDescricao() + " = R$" + cafeComLeite.getPreco());
        
        Capuccino capuccino = new Capuccino();
        System.out.println(capuccino.getDescricao() + " = R$" + capuccino.getPreco());
    }
}
