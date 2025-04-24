package br.com.felipe.criacionais.templateMethod;
/**
 *
 * @author felipe.8129
 */
public class Cafe extends Bebida{

    @Override
    protected void adicionarIngredientePrincipal() {
        System.out.println("Adicionando pó de café na agua quente");
    }
    
    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando açucar e leite");
    }
    
    
}
