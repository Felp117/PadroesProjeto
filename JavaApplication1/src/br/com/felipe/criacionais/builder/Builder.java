package br.com.felipe.criacionais.builder;
/**
 *
 * @author felipe.8129
 */
public class Builder {
    
    String parede;
    String telhado;
    int porta;
    int janela;
    Integer piscina;
    
    public Builder comParedes(String parede) {
        this.parede = parede;
        return this;
    }
    public Builder ComTelhado(String telhado) {
        this.telhado = telhado;
        return this;
    }
    public Builder ComPorta(Integer porta) {
        this.porta = porta;
        return this;
    }
    public Builder Comjanela(Integer janela) {
        this.janela = janela;
        return this;
    }
    public Builder ComPiscina(Integer piscina) {
        this.piscina = piscina;
        return this;
    }
    
    public Casa build(){
        return new Casa(this);
    }
}
