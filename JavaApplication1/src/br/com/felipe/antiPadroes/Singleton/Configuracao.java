package br.com.felipe.antiPadroes.Singleton;
/**
 *
 * @author felipe.8129
 */
public class Configuracao {
    
    public static Configuracao instanciaGlobal = new Configuracao();
    
    public String configuracaoSistema;
    
    public Configuracao() {
        configuracaoSistema = "Modo Escuro";
    }
}
