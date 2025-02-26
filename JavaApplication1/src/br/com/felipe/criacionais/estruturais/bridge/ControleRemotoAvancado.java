package br.com.felipe.criacionais.estruturais.bridge;
/**
 *
 * @author felipe.8129
 */
public class ControleRemotoAvancado extends ControleRemoto{
    
    public ControleRemotoAvancado(Dispositivo dispositivo) {
        super(dispositivo);
    }
    
    public void silenciar() {
        System.out.println("Dispositivo silenciado");
    }
}
