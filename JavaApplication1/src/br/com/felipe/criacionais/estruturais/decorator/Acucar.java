package br.com.felipe.criacionais.estruturais.decorator;

/**
 *
 * @author felipe.8129
 */
public class Acucar extends CafeDecorator{
    
    public Acucar(Cafe cafe) {
        super(cafe);
    }
    
    public double getPreco() {
        return super.getPreco() + 1.00;
    }
    
    public String getDescricao() {
        return super.getDescricao() + "café com açucar";
    }
}
