/*
 * class SuiteTest                     version 1.0
 * Fecha de creación: 29/05/2021       Fecha de Última modificación: 29/05/2021
 *
 * Copyright (c) David Jiménez Riscardo, 2021
 * Módulo: DISEÑO DE INTERFACES        Ejercicio ejemplo para el Examen Final de Junio
 */
package calculator;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(value = Suite.class)
@Suite.SuiteClasses({
    
    //Incluimos todos los nombres de las clases que componen la Suite de pruebas
    
    CalculatorTest.class
        
})



/**
 *
 * @author AntDVD
 */
public class SuiteTest {
    
}
