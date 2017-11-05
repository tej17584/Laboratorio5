/*
 * Valvula.java
 * Clase de las valvulas
 * Andrea Arguello 17801 Alejandro Tejada 17584
 * 2/11/2017
 */

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Valvula {
    //Atributos
    String municipio;
    int habitantes,numero;
    boolean abierto;
    ArrayList<String> fechasAbrir, fechasCerrar;
    
    /**
     * Constructor
     * @param municipio nombre del municipio
     * @param habitantes numero de habitantes
     * @param numero numero de valvula
     */
    public Valvula(String municipio, int habitantes, int numero)
    {
        this.municipio=municipio;
        this.habitantes=habitantes;
        this.numero=numero;
        abierto=false;
        fechasAbrir= new ArrayList<String>();
        fechasCerrar=new ArrayList<String>();
    }
    
    /**
     * Abre la valvula
     * @param fecha fecha en la que se abrio
     */
    public void abrir(String fecha)
    {
        abierto=true;
        fechasAbrir.add(fecha);
    }
    
     /**
      * Cierra la valvula
      * @param fecha fecha en la que se cerro
      */
    public void cerrar(String fecha)
    {
        abierto=false;
        fechasCerrar.add(fecha);
    }
    
    /**
     * 
     * @return nombre del municipio
     */
    public String getMunicipio()
    {
        return municipio;
    }
    
    /**
     * 
     * @return numero de habitantes
     */
    public int getHabitantes()
    {
        return habitantes;
    }
    
    /**
     * 
     * @return numero de valvula
     */
    public int getNumero()
    {
        return numero;
    }
    
    /**
     * 
     * @return estado de abierto
     */
    public boolean getAbierto()
    {
        return abierto;
    }
    
}
