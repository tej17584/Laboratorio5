/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class repetirEstadoValvula {
    public static final boolean abierto=true, cerrado=false;
    
    public static void repetirEstadoValvula(boolean estado, boolean quieroAbrir) throws ValvulaAbiertaException
    {
        ValvulaAbiertaException excepcion;
        String alerta;
        boolean estaAbierto;
        
        
        alerta="Esta valvula ya esta ";
        if(estado=abierto && quieroAbrir==true)
        {
            alerta+="abierta";
            estaAbierto=true;
            excepcion= new ValvulaAbiertaException(alerta,estaAbierto);
            throw excepcion;
        }
        
        if(estado=cerrado && quieroAbrir==false)
            {
            alerta+="cerrada";
            estaAbierto=false;
            excepcion= new ValvulaAbiertaException(alerta,estaAbierto);
            throw excepcion;
        }
        
    }
            
    
}
