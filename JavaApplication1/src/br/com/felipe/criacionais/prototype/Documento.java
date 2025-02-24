package br.com.felipe.criacionais.prototype;
/**
 *
 * @author felipe.8129
 */
public class Documento implements Cloneable{
    
    private String titulo;
    private String conteudo;

    public Documento(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }
    
    @Override
    public Documento clone() {
        return new Documento(this.titulo, this.conteudo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "titulo: " + titulo + ", conteudo: " + conteudo;
    }
}