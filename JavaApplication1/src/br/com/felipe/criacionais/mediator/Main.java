package br.com.felipe.criacionais.mediator;
/**
 *
 * @author felipe.8129
 */
public class Main {
    public static void main(String[] args) {
        Mediador mediador = new MediadorConcreto();
            
        Colaborador colaborador = new ColaboradorConcreto(mediador, "felipe");
        Colaborador colaborador2 = new ColaboradorConcreto(mediador, "Jonas");
        Colaborador colaborador3 = new ColaboradorConcreto(mediador, "Giovanni");
        
        colaborador.enviarMensagem("Ola a todos");
        colaborador2.enviarMensagem("Opa");
        colaborador3.enviarMensagem("AOOOOBA");
        
        
        
    }
    
}
