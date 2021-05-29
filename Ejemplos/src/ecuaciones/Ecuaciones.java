/*
 * class Ecuaciones                    version 1.0
 * Fecha de creación: 29/05/2021       Fecha de Última modificación: 29/05/2021
 *
 * Copyright (c) David Jiménez Riscardo, 2021
 * Módulo: DISEÑO DE INTERFACES        Ejercicio ejemplo para el Examen Final de Junio
 */
package ecuaciones;

/**
 * Clase para la resolución de ecuaciones cuadráticas (segundo grado)
 * @author AntDVD
 */
public class Ecuaciones {
    
    private int a, b, c;
    private double x1, x2;

      
    public Ecuaciones(int a, int b, int c){       
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    
    public double calcularX1(){
                  
        if(this.a == 0){         
            throw new IllegalArgumentException("División por cero.");         
        }else {                 
            this.x1 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
        }      
        return this.x1;
    }
    
    public double calcularX2(){
        
        if(this.a == 0){
            throw new IllegalArgumentException("División por cero");
        }else {
            this.x2 = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
        }
        return this.x2;
    }
    
}
