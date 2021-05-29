/*
 * class SalarioTest                  version 1.0
 * Fecha de creación: 29/05/2021       Fecha de Última modificación: 29/05/2021
 *
 * Copyright (c) David Jiménez Riscardo, 2021
 * Módulo: DISEÑO DE INTERFACES        Ejercicio ejemplo para el Examen Final de Junio
 */
package salario;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * Clase para lanzar pruebas unitarios sobre los métodos de la clase Salario
 * @author AntDVD
 */
public class SalarioTest {
    
    Salario salario;
    
    public SalarioTest() {
    }
    
    @Before
    public void before(){
        salario = new Salario();
    }
    
    @Test
    public void testCalcularSalarioBruto1() {
        
        double actual, esperado;
        
        actual = salario.calculaSalarioBruto(Salario.TipoEmpleado.VENDEDOR, 100, 10);
        
        esperado = 1200;
        
        Assert.assertEquals(esperado, actual, 0.01);
        
        System.out.println("Test del salario bruto CORRECTO. El salario bruto es el esperado: " + esperado);
    }
    
    //Forma de gestionar la excepción con JUnit4. Ejemplo utilizando una excepción existente en Java
    @Test(expected=IllegalArgumentException.class) 
    public void testCalcularSalarioBruto2() throws IllegalArgumentException{
        
        System.out.println("Test del salario bruto INCORRECTO(forma JUnit4). IllegalArgumentException: Las ventas no pueden ser negativas");   
        
        double actual = salario.calculaSalarioBruto(Salario.TipoEmpleado.VENDEDOR, -1, 10);       
        
    }
    
    //Forma de gestionar la excepcion con JUnit3. Ejemplo utilizando una excepción existente en Java
    @Test
    public void testCalculaSalarioBruto3() throws IllegalArgumentException{
        
        double actual, esperado;
        
        try {
            
            actual = salario.calculaSalarioBruto(Salario.TipoEmpleado.VENDEDOR, -1, 10);
            fail("Se ha producido una excepción");
            
        }catch(IllegalArgumentException iae){
            
            System.out.println("Test del salario bruto INCORRECTO(forma JUnit3). " + iae);
        }
    }
    
    
}
