package br.com.felipe.criacionais.mediator;
/**
 *
 * @author felipe.8129
 */
public interface Mediador {
    
    void enviarMensagem(String mensagem, Colaborador colaborador);
    
    void adicionarColaborador(Colaborador colaborador);
    
}
