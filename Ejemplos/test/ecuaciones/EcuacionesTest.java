/*
 * class EcuacionesTest                  version 1.0
 * Fecha de creación: 29/05/2021       Fecha de Última modificación: 29/05/2021
 *
 * Copyright (c) David Jiménez Riscardo, 2021
 * Módulo: DISEÑO DE INTERFACES        Ejercicio ejemplo para el Examen Final de Junio
 */
package ecuaciones;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Clase para lanzar pruebas unitarios sobre los métodos de la clase Ecuaciones
 * @author AntDVD
 */
public class EcuacionesTest {
    
    
    
    public EcuacionesTest() {
    }
    
    
    @Test
    public void testCalcularX1(){
        
        double actual, esperado;       
        Ecuaciones ecuacion = new Ecuaciones(1, -2, -24);       
        actual = ecuacion.calcularX1();     
        esperado = 6;     
        Assert.assertEquals(esperado, actual, 0.01);        
        System.out.println("Test cálculo x1 CORRECTO. El resultado es el esperado: " + esperado);
               
    }
    
    @Test
    public void testCalcularX2(){
        
        double actual, esperado;
        Ecuaciones ecuacion = new Ecuaciones(1, -2, -24);
        actual = ecuacion.calcularX2();
        esperado = -4;
        Assert.assertEquals(esperado, actual, 0.01);
        System.out.println("Test cálculo x2 CORRECTO. El resultado es el esperado: " + esperado);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testCalcularX1Indefinido() throws IllegalArgumentException{
        
        System.out.println("Test cálculo x1 INCORRECTO. Error división por cero.");
        double actual, esperado;
        Ecuaciones ecuacion = new Ecuaciones(0, -2, -24);
        actual = ecuacion.calcularX1();
        
    }
    
}
