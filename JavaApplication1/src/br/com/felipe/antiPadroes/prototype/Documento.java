package br.com.felipe.antiPadroes.prototype;

/**
 *
 * @author felipe.8129
 */
public class Documento {

    public String titulo;
    public String conteudo;

    public Documento(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }
    
    public void exibir() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Conteudo: " + conteudo);
    }
    
    //clonar objeto
    public Documento clonar() {
        return this;
    }
    
    
}
