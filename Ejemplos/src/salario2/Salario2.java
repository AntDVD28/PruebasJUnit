/*
 * class Salario2                      version 1.0
 * Fecha de creación: 29/05/2021       Fecha de Última modificación: 29/05/2021
 *
 * Copyright (c) David Jiménez Riscardo, 2021
 * Módulo: DISEÑO DE INTERFACES        Ejercicio ejemplo para el Examen Final de Junio
 */
package salario2;

/**
 * Clase para el cálculo del salario de un trabajador. 
 * En este ejemplo veremos además como gestionar nuestras propias excepciones
 * @author AntDVD
 */
public class Salario2 {
    
    private double salario;
    public enum TipoEmpleado {
        VENDEDOR, 
        ENCARGADO
    };
    
    public void Salario2(){
        this.salario = 0.0;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double calculaSalarioBruto(TipoEmpleado tipo, double ventaMes, double horasExtra) throws MiException{
        
        if(tipo.equals(TipoEmpleado.VENDEDOR)){
            this.salario = 1000;
        }
        if(tipo.equals(TipoEmpleado.ENCARGADO)){
            this.salario = 1500;
        }
        
        if(ventaMes >= 1500){
            this.salario += 200;
        }else if(ventaMes >= 1000){
            this.salario += 100;
        }else if(ventaMes < 0){
            //Lanzamos una excepción propia
            throw new MiException(1);
        }
        
        this.salario += (horasExtra * 20);
        
        return this.salario;      
    }
    
    public double calculaSalarioNeto(double salarioBruto) throws MiException{
        
        double retencion = 0.0;
        
        if(salarioBruto > 1000 & salarioBruto < 1500){
            //Aplicamos retencion del 16%
            retencion = salarioBruto * 0.16;
        }else if(salarioBruto >= 1500){
            //Retencion del 18%
            retencion = salarioBruto * 0.18;
        }else if(salarioBruto < 0){
            //Lanzamos una excepción propia
            throw new MiException(2);
        }
        return salarioBruto * (1 - retencion);
    }

    
}
