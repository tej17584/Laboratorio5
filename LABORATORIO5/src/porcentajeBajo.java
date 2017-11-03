/*
 * porcentajeBajo.java
 * Implementa la excepcion
 * Andrea Arguello 17801 Alejandro Tejada 17584
 * 2/11/2017
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */

public class porcentajeBajo {
    //Atributos
    public static final double noAbrir=25, cerrarTodo=10;
    
    /**
     * 
     * @param valor valor de la excepcion
     * @throws NivelBajoException anuncia que el nivel de agua es bajo
     */
    public static void porcentajeBajo(double valor) throws NivelBajoException
    {
        //Atributos
        NivelBajoException excepcion;
        String alerta;
        double porcentaje;
        
        alerta ="\nPorcentaje:" + valor +"%";
        //Si es menor o igual a 25%
        if(valor<=noAbrir)
        {
            alerta+="\nNecesita rellenar el tanque. No podra abrir mas valvulas.";
            porcentaje=25;
            excepcion = new NivelBajoException(alerta,porcentaje);
            throw excepcion;
        }
        //Si es menor o igual a 10%
        if(valor<=cerrarTodo)
        {
            alerta+="\nNecesita rellenar el tanque. Cerrando todas las valvulas";
            porcentaje=10;
            excepcion = new NivelBajoException(alerta,porcentaje);
            throw excepcion;
        }
        
        
        
    }
    
}
