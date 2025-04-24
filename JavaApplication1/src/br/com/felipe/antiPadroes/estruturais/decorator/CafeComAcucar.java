package br.com.felipe.antiPadroes.estruturais.decorator;
/**
 *
 * @author felipe.8129
 */
public class CafeComAcucar extends Cafe{
 
    @Override
    public double getPreco() {
        return super.getPreco() + 1.00;
    }
    @Override
    public String getDescricao() {
        return super.getDescricao() + " com açucar";
    }
}
