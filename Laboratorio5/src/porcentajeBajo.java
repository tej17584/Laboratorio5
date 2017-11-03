/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrea
 */
public class porcentajeBajo {
    public static final double noAbrir=25, cerrarTodo=10;
    
    
    public static void porcentajeBajo(double valor) throws NivelBajoException
    {
        NivelBajoException excepcion;
        String alerta;
        double porcentaje;
        
        alerta ="\nPorcentaje:" + valor +"%";
        if(valor<=noAbrir)
        {
            alerta+="\nNecesita rellenar el tanque. No podra abrir mas valvulas.";
            porcentaje=25;
            excepcion = new NivelBajoException(alerta,porcentaje);
            throw excepcion;
        }
        if(valor<=cerrarTodo)
        {
            alerta+="\nNecesita rellenar el tanque. Cerrando todas las valvulas";
            porcentaje=10;
            excepcion = new NivelBajoException(alerta,porcentaje);
            throw excepcion;
        }
    }
    
}
