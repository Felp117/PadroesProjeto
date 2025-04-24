package br.com.felipe.criacionais.estruturais.decorator;

/**
 *
 * @author felipe.8129
 */
public class Main {

    public static void main(String[] args) {
        
        Cafe cafeSimples = new CafeSimples();
        System.out.println(cafeSimples.getDescricao() + " = R$" + cafeSimples.getPreco());
        
        Cafe cafeComLeiteAcucar = new Acucar(new Leite(new CafeSimples()));
        System.out.println(cafeComLeiteAcucar.getDescricao() + " = R$" + cafeComLeiteAcucar.getPreco());
        
        Cafe capuccino = new Canela(new Capuccino(new CafeSimples()));
        System.out.println(capuccino.getDescricao() + " = R$" + capuccino.getPreco());
        
        Cafe cafeAdocante = new Adocante(new CafeSimples());
        System.out.println(cafeAdocante.getDescricao() + " = R$" + cafeAdocante.getPreco());
    }
}
