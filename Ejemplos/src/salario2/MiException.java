/*
 * class MiExcepcion                   version 1.0
 * Fecha de creación: 29/05/2021       Fecha de Última modificación: 29/05/2021
 *
 * Copyright (c) David Jiménez Riscardo, 2021
 * Módulo: DISEÑO DE INTERFACES        Ejercicio ejemplo para el Examen Final de Junio
 */
package salario2;

/**
 * Clase para gestionar nuestras propias excepciones
 * @author AntDVD
 */
public class MiException extends Exception {
    
    private int codigoError;

    public MiException(int codigoError) {
        
        super();
        this.codigoError=codigoError;
    }
    
    @Override
    public String getMessage(){
         
        String mensaje="";
         
        switch(codigoError){
            case 1:
                mensaje="Las ventas no pueden ser negativas";
                break;   
            case 2:
                mensaje="El salario bruto no puede ser negativo";
                break;
        }
         
        return mensaje;
         
    }
    
}
