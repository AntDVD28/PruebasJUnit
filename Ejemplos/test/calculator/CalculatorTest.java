/*
 * class CalculatorTest                  version 1.0
 * Fecha de creación: 29/05/2021       Fecha de Última modificación: 29/05/2021
 *
 * Copyright (c) David Jiménez Riscardo, 2021
 * Módulo: DISEÑO DE INTERFACES        Ejercicio ejemplo para el Examen Final de Junio
 */
package calculator;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * Clase para lanzar pruebas unitarios sobre los métodos de la clase Calculator
 * @author AntDVD
 */
public class CalculatorTest {
    
    Calculator calculadora;
    
    public CalculatorTest() {
    }
    
    @Before
    public void before(){
        System.out.println("Before");
        calculadora = new Calculator();
    }
    
    @Test
    public void testSumar(){
        System.out.println("Test Sumar dos números. CORRECTO");
        double n1 = 1.0;
        double n2 = 2.0;
        double esperado = 3.0;
        double actual;
        
        actual = calculadora.sumar(n1, n2);
        Assert.assertEquals(esperado, actual, 0.0);        
    }
    
    @Test
    public void testRestar(){
        System.out.println("Test Restar dos números. CORRECTO");
        double n1 = 5.0;
        double n2 = 2.0;
        double esperado = 3.0;
        double actual;
        
        actual = calculadora.restar(n1, n2);
        Assert.assertEquals(esperado, actual, 0.0);
    }
    
    @Test
    public void testMultiplicar(){
        System.out.println("Test Multiplicar dos números. CORRECTO");
        double n1 = 8.0;
        double n2 = 1.0;
        double esperado = 8.0;
        double actual;
        
        actual = calculadora.multiplicar(n1, n2);
        Assert.assertEquals(esperado, actual, 0.0);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testInfinito(){
        System.out.println("Test Multiplicar (Infinito). INCORRECTO");
        double n1 = 2.0;
        calculadora.multiplicar(n1, Double.POSITIVE_INFINITY);
    }
    
    @Test
    public void testDividir(){
        System.out.println("Test Dividir dos números. CORRECTO");
        double n1 = 15.0;
        double n2 = 3.0;
        double esperado = 5.0;
        double actual;
        actual = calculadora.dividir(n1, n2);
        Assert.assertEquals(esperado, actual, 0.0);
    }
    
    @Test(expected=ArithmeticException.class)
    public void testIndeterminado(){
        System.out.println("Test Dividir (Indeterminado). INCORRECTO");
        double n1 = 0.0;
        double n2 = 0.0;
        calculadora.dividir(n1, n2);
    }
    
}
