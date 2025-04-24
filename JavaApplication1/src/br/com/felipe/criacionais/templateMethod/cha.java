package br.com.felipe.criacionais.templateMethod;
/**
 *
 * @author felipe.8129
 */
public class cha extends Bebida {

    @Override
    protected void adicionarIngredientePrincipal() {
        System.out.println("Adicionando chá na agua quente");
    }
    
    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando limaõ");
    }
}
