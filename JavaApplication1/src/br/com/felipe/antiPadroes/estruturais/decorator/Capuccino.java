package br.com.felipe.antiPadroes.estruturais.decorator;

/**
 *
 * @author felipe.8129
 */
public class Capuccino extends Cafe{
    
    @Override
    public double getPreco() {
        return super.getPreco() + 3.00;
    }
    @Override
    public String getDescricao() {
        return "Capuccino";
    }
}
