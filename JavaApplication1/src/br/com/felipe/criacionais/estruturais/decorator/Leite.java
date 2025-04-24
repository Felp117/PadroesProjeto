package br.com.felipe.criacionais.estruturais.decorator;

/**
 *
 * @author felipe.8129
 */
public class Leite extends CafeDecorator {

    public Leite(Cafe cafe) {
        super(cafe);
    }

    public double getPreco() {
        return super.getPreco() + 2.50;
    }
    
    public String getDescricao() {
        return super.getDescricao() + "café com Leite";
    }
   
    
}
