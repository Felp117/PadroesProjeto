package br.com.felipe.criacionais.observer;
/**
 *
 * @author felipe.8129
 */
public interface Sujeito {
    
    void adicionarObservador(Observer observador);
    void removerObservador(Observer observador);
    void notificarObservadores();
}
