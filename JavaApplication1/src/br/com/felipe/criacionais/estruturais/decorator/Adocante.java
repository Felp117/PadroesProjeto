package br.com.felipe.criacionais.estruturais.decorator;

/**
 *
 * @author felipe.8129
 */
public class Adocante extends CafeDecorator{
 
    public Adocante(Cafe cafe) {
        super(cafe);
    }
 
    public double getPreco() {
        return super.getPreco() + 2.00;
    }
    
    public String getDescricao() {
        return super.getDescricao() + "café com adoçante";
    }
    
}
