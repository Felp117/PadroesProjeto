package br.com.felipe.antiPadroes.JeitoErrado;
/**
 *
 * @author felipe.8129
 */
public class Trem extends Transporte{
    
    @Override
    public void entregar() {
        System.out.println("Entregando via trem!");
    }
}
