/*
 * class Calculator                    version 1.0
 * Fecha de creación: 29/05/2021       Fecha de Última modificación: 29/05/2021
 *
 * Copyright (c) David Jiménez Riscardo, 2021
 * Módulo: DISEÑO DE INTERFACES        Ejercicio ejemplo para el Examen Final de Junio
 */
package calculator;

/**
 * Clase para efectuar operaciones básicas de la suma, resta, multiplicación y división
 * @author AntDVD
 */
public class Calculator {
    
    public Calculator(){
        
    }
    
    public double sumar(double n1, double n2){
        return n1 + n2;
    }
    
    public double restar(double n1, double n2){
        return n1 - n2;
    }
    
    public double multiplicar(double n1, double n2){
        //Generamos una excepción si n1 o n2 es infinito
        if(Double.isInfinite(n1) || Double.isInfinite(n2)){
            throw new IllegalArgumentException("Argumento infinito");
        }
        
        return n1 * n2;
    }
    
    public double dividir(double n1, double n2){
        //Generamos una excepción por número Indeterminado
        if(n1==0 && n2==0){
            throw new ArithmeticException("Indeterminado");
        }
        return n1 / n2;
    }
    
}
