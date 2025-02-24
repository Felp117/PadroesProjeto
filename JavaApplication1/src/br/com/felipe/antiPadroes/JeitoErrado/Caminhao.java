package br.com.felipe.antiPadroes.JeitoErrado;
/**
 *
 * @author felipe.8129
 */
public class Caminhao extends Transporte{
    
   @Override
   public void entregar() {
       System.out.println("Entregando via caminhão!");
   }
    
}
