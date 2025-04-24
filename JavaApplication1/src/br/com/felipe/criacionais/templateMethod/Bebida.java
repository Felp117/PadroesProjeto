package br.com.felipe.criacionais.templateMethod;
/**
 *
 * @author felipe.8129
 */
public abstract class Bebida {
    public final void preparar() {
        ferverAgua();
        adicionarIngredientePrincipal();
        adicionarCondimentos();
        servir();
    }
    
    private void ferverAgua() {
        System.out.println("Fervendo agua");
    }
    
    protected abstract void adicionarIngredientePrincipal();
    
    protected void adicionarCondimentos() {
        //nada implementado
        //pode ser redefinido na subclasse ou deixado vazio
    }
    
    private void servir() {
        System.out.println("Servindo a bebida");
    }
}
