package br.com.felipe.criacionais.estruturais.decorator;

/**
 *
 * @author felipe.8129
 */
public class CafeSimples implements Cafe{

  
    @Override
    public double getPreco() {
        return 5.00;
    }
    @Override
    public String getDescricao() {
        return "café simples";
    }
}
