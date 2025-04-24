package br.com.felipe.criacionais.estruturais.decorator;

/**
 *
 * @author felipe.8129
 */
public class Capuccino extends CafeDecorator{
    
    public Capuccino(Cafe cafe) {
        super(cafe);
    }
    
    public double getPreco() {
        return super.getPreco() + 6.00;
    }
    
    public String getDescricao() {
        return super.getDescricao() + "Capuccino";
    }
    
}
