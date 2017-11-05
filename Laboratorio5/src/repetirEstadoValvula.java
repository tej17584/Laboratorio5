/*
 * repetirEstadoValvula.java
 * Implementa la excepcion de valvulas
 * Andrea Arguello 17801 Alejandro Tejada 17584
 * 4/11/2017
 */

/**
 *
 * @author Andrea
 */
public class repetirEstadoValvula {
    //Atributos
    public static final boolean abierto=true, cerrado=false;
    
    /**
     * 
     * @param estado estado actual de la valvula
     * @param quieroAbrir estado al que se quiere cambiar
     * @throws ValvulaAbiertaException indica que a lo que se quiere cambiar es al estado actual
     */
    public static void repetirEstadoValvula(boolean estado, boolean quieroAbrir) throws ValvulaAbiertaException
    {
        ValvulaAbiertaException excepcion;
        String alerta;
        boolean estaAbierto;
        
        
        alerta="Esta valvula ya esta ";
        if(estado==abierto && quieroAbrir==abierto)
        {
            alerta+="abierta";
            estaAbierto=true;
            excepcion= new ValvulaAbiertaException(alerta,estaAbierto);
            throw excepcion;
        }
        
        if(estado==cerrado && quieroAbrir==cerrado)
            {
            alerta+="cerrada";
            estaAbierto=false;
            excepcion= new ValvulaAbiertaException(alerta,estaAbierto);
            throw excepcion;
        }
        
    }
            
    
}
