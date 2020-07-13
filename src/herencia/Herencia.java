/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import Modulo5.*;

/**
 *
 * @author 
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        // TODO code application logic here
        
     /*
     Instancia de la clase circulo   
     */   
     Circulo circulo= new Circulo();
             
     /*
     El 12 es el valor de la circunferencia necesario en la formula, puede ser cualquier valor
     */
     double radioCirculo = circulo.calcularRadio(12);
     System.out.println("Radio del circulo: " + radioCirculo);
     
     /*
     Para imprimir el nombre del circulo usamos el método creado en la clase Formas
     Note que dicho método no está creado en la clase circulo, pero al hereder de la clase formas
     automáticamente tenemos acceso a usar ese método en esta clase circulo y en las demas en las que 
     hagamos herencia de el.
     */
     circulo.Dibujar("Circulo");
      
 
   
    }


    
}
