package br.com.felipe.antiPadroes.estruturais.decorator;

/**
 *
 * @author felipe.8129
 */
public class CafeComleite extends Cafe{
    
    @Override
    public double getPreco() {
        return super.getPreco() + 2.00;
    }
    @Override
    public String getDescricao() {
        return super.getDescricao() + " com leite";
    }
}
