package br.com.felipe.criacionais.estruturais.decorator;

/**
 *
 * @author felipe.8129
 */
public class Canela extends CafeDecorator{
    
    public Canela(Cafe cafe) {
        super(cafe);
    }
    
    public double getPreco() {
        return super.getPreco() + 4.00;
    }
    
    public String getDescricao() {
        return super.getDescricao() + "café com canela";
    }
}
