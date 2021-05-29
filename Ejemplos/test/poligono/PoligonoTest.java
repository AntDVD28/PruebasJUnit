/*
 * class PoligonoTest                  version 1.0
 * Fecha de creación: 29/05/2021       Fecha de Última modificación: 29/05/2021
 *
 * Copyright (c) David Jiménez Riscardo, 2021
 * Módulo: DISEÑO DE INTERFACES        Ejercicio ejemplo para el Examen Final de Junio
 */
package poligono;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * Clase para lanzar pruebas unitarios sobre los métodos de la clase Poligono
 * @author AntDVD
 */
public class PoligonoTest {
    
    Poligono poligono;
    
    public PoligonoTest() {
    }
    
    @Before
    public void before(){
        
        System.out.println("*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("       Before        ");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*");
        poligono = null;
    }
    
    @Test
    public void calculaAreaTest(){        
        double perimetro = 8.0;
        double apotema = 2.0;
        double esperado = 8.0;
        poligono = new Poligono(apotema, perimetro);
        double actual = poligono.calculaArea();
        Assert.assertEquals(esperado, actual, 0.01);
        System.out.println("-------------------------------------------------");
        System.out.println("  Área: poligono.calculaArea(2.0, 8.0) >>> 8.0   ");
        System.out.println("-------------------------------------------------");
        System.out.println("El área del poligono es " + actual);        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void calculaAreaTest2() throws IllegalArgumentException{
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("  Área (Infinito) : poligono.calculaArea(2.0, infinito) >>> infinito ");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("          Ha ocurrido una excepción de argumento ilegal: Argumento infinito           ");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        double perimetro = Double.POSITIVE_INFINITY;
        double apotema = 2.0;
        poligono = new Poligono(apotema, perimetro);
        poligono.calculaArea();       
    }
    
}
