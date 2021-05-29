/*
 * class PruebaSalario                 version 1.0
 * Fecha de creación: 29/05/2021       Fecha de Última modificación: 29/05/2021
 *
 * Copyright (c) David Jiménez Riscardo, 2021
 * Módulo: DISEÑO DE INTERFACES        Ejercicio ejemplo para el Examen Final de Junio
 */
package salario;


/**
 * Clase desde la que podemos hacer tests a los métodos de la clase Salario SIN UTILIZAR LA LIBRERIA JUNIT
 * @author AntDVD
 */
public class PruebasSalario {
    
    
    public static void main(String[] args){
        
        //**************************************************//
        //           Prueba de salario correcto             //
        //**************************************************//
        
        double actual, esperado;
        
        Salario salario = new Salario();
        
        try{
            
            actual = salario.calculaSalarioBruto(Salario.TipoEmpleado.VENDEDOR, 100, 10);
            
            esperado = 1200;
            
            if( Double.compare(actual, esperado) == 0 ){
                
                System.out.println("Test del salario bruto. El salario bruto es el esperado: " + esperado);
            }          
            
        }catch(IllegalArgumentException iae){
            
            System.out.println("Error, se ha producido una excepción:" + iae);
            
        }
        
        //**************************************************//
        //           Capturamos una excepción               //
        //**************************************************//
        
        try {
            
            actual = salario.calculaSalarioBruto(Salario.TipoEmpleado.VENDEDOR, -1, 10);
            
            
        }catch(IllegalArgumentException iae){
            
            System.out.println("Error, se ha producido una excepción:" + iae);
        }
        
        
        
    }//Fin del main
    
}
