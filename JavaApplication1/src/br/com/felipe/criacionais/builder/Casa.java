package br.com.felipe.criacionais.builder;
/**
 *
 * @author felipe.8129
 */
public class Casa {
     
    private String parede;
    private String telhado;
    private Integer porta;
    private Integer janela;
    private Integer piscina;
    
    private Casa() {
        
    }

    public String getParede() {
        return parede;
    }

    public void setParede(String parede) {
        this.parede = parede;
    }

    public String getTelhado() {
        return telhado;
    }

    public void setTelhado(String telhado) {
        this.telhado = telhado;
    }

    public Integer getPorta() {
        return porta;
    }

    public void setPorta(Integer porta) {
        this.porta = porta;
    }

    public Integer getJanela() {
        return janela;
    }

    public void setJanela(Integer janela) {
        this.janela = janela;
    }

    public Integer getPiscina() {
        return piscina;
    }

    public void setPiscina(Integer piscina) {
        this.piscina = piscina;
    }
    
    public Casa(Builder builder) {
        this.parede = builder.parede;
        this.telhado = builder.telhado;
        this.janela = builder.janela;
        this.porta = builder.porta;
        this.piscina = builder.piscina;
    }

    @Override
    public String toString() {
        return "Casa com parede:" + parede + 
                ", telhado: " + telhado + 
                ", porta: " + porta + 
                ", janela:" + janela + 
                ", piscina: " + piscina;
    }
    
    
    
}
