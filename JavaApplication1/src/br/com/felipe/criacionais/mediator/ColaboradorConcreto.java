package br.com.felipe.criacionais.mediator;
/**
 *
 * @author felipe.8129
 */
public class ColaboradorConcreto extends Colaborador {
    
    public ColaboradorConcreto(Mediador mediador, String nome) {
        super(mediador, nome);
    }

    @Override
    public void enviarMensagem(String msg) {
        System.out.println(this.nome + " enviou: " + msg);
        mediador.enviarMensagem(msg, this);
    }

    @Override
    public void receberMensagem(String msg) {
        System.out.println(this.nome + " recebeu: " + msg);
    }
    
}
