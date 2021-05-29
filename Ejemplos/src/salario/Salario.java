/*
 * class Salario                       version 1.0
 * Fecha de creación: 29/05/2021       Fecha de Última modificación: 29/05/2021
 *
 * Copyright (c) David Jiménez Riscardo, 2021
 * Módulo: DISEÑO DE INTERFACES        Ejercicio ejemplo para el Examen Final de Junio
 */
package salario;


/**
 * Clase para el cálculo del salario de un trabajador.
 * @author AntDVD
 */
public class Salario {

    private double salario;
    public enum TipoEmpleado {
        VENDEDOR, 
        ENCARGADO
    };
    
    public void Salario(){
        this.salario = 0.0;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double calculaSalarioBruto(TipoEmpleado tipo, double ventaMes, double horasExtra){
        
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
            throw new IllegalArgumentException("Las ventas no pueden ser negativas");
        }
        
        this.salario += (horasExtra * 20);
        
        return this.salario;      
    }
    
    public double calculaSalarioNeto(double salarioBruto){
        
        double retencion = 0.0;
        
        if(salarioBruto > 1000 & salarioBruto < 1500){
            //Aplicamos retencion del 16%
            retencion = salarioBruto * 0.16;
        }else if(salarioBruto >= 1500){
            //Retencion del 18%
            retencion = salarioBruto * 0.18;
        }else if(salarioBruto < 0){
            throw new IllegalArgumentException("El salario bruto no puede ser negativo");
        }
        return salarioBruto * (1 - retencion);
    }

       
}//Fin de la clase
