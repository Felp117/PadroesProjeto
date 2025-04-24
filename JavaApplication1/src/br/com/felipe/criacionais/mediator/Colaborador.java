package br.com.felipe.criacionais.mediator;
/**
 *
 * @author felipe.8129
 */
public abstract class Colaborador {
    protected Mediador mediador;
    protected String nome;

    public Colaborador(Mediador mediador, String nome) {
        this.mediador = mediador;
        this.nome = nome;
        mediador.adicionarColaborador(this);
    }
    
    public abstract void enviarMensagem(String msg);
    public abstract void receberMensagem(String msg);
    
    
}


