/*
 * class Poligono                      version 1.0
 * Fecha de creación: 29/05/2021       Fecha de Última modificación: 29/05/2021
 *
 * Copyright (c) David Jiménez Riscardo, 2021
 * Módulo: DISEÑO DE INTERFACES        Ejercicio ejemplo para el Examen Final de Junio
 */
package poligono;

/**
 * Clase para calcular el área de un poligono regular conocido su apotema y perimetro
 * @author AntDVD
 */
public class Poligono {
    
    private double apotema;
    private double perimetro;
    
    public Poligono(double a, double p){
        
        this.apotema = a;
        this.perimetro = p;      
    }
    
    public double calculaArea(){
        
        double area;
        
        if( Double.isInfinite(this.apotema) || Double.isInfinite(this.perimetro)){
            throw new IllegalArgumentException("Argumento/s infinito");
        }
        
        area = (this.apotema * this.perimetro) / 2;
        
        return area;
    }
    
}
