/*
 * class Salario2Test                  version 1.0
 * Fecha de creación: 29/05/2021       Fecha de Última modificación: 29/05/2021
 *
 * Copyright (c) David Jiménez Riscardo, 2021
 * Módulo: DISEÑO DE INTERFACES        Ejercicio ejemplo para el Examen Final de Junio
 */
package salario2;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * Clase para lanzar pruebas unitarios sobre los métodos de la clase Salario2
 * @author AntDVD
 */
public class Salario2Test {
    
    Salario2 salario;
    
    public Salario2Test() {
    }
    
    @Before
    public void before(){
        salario = new Salario2();
    }
    
    @Test
    public void testCalcularSalarioBruto1() throws MiException{
        
        double actual, esperado;
        
        actual = salario.calculaSalarioBruto(Salario2.TipoEmpleado.VENDEDOR, 100, 10);
        
        esperado = 1200;
        
        Assert.assertEquals(esperado, actual, 0.01);
        
        System.out.println("Test del salario bruto CORRECTO. El salario bruto es el esperado: " + esperado);
    }
    
    //Forma de gestionar la excepción con JUnit4. Ejemplo utilizando mi propia excepción
    @Test(expected=MiException.class)
    public void testCalcularSalarioBruto2() throws MiException{
        
        System.out.println("Test del salario bruto INCORRECTO(forma JUnit4). MiException: Las ventas no pueden ser negativas");   
        
        double actual = salario.calculaSalarioBruto(Salario2.TipoEmpleado.VENDEDOR, -1, 10);       
        
    }
    
    //Forma de gestionar la excepcion con JUnit3. Ejemplo utilizando mi propia excepción
    @Test
    public void testCalculaSalarioBruto3() throws MiException{
        
        double actual, esperado;
        
        try {
            
            actual = salario.calculaSalarioBruto(Salario2.TipoEmpleado.VENDEDOR, -1, 10);
            fail("Se ha producido una excepción");
            
        }catch(MiException me){
            
            System.out.println("Test del salario bruto INCORRECTO(forma JUnit3). " + me);
        }
    }
    
    
    
}
