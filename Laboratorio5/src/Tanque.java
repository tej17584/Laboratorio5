/*
 * Tanque.java
 * Clase madre de los tanques. Por default implementa la cubica.
 * Andrea Arguello 17801 Alejandro Tejada 17584
 * 2/11/2017
 */

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Tanque {
    //Atributos
    protected String forma, dimensiones;
    protected long id;
    protected double alto, capacidad, cantAgua, porcentajeRestante;
    protected Valvula[] valvulas;
    
    /**
     * 
     * @param forma forma del tanque
     * @param id long de identificacion
     * @param alto alto
     */
    public Tanque(String forma, long id, double alto)
    {
        this.forma=forma;
        this.id=id;
        this.alto=alto;
        valvulas = new Valvula[10];
        cantAgua=0; //inicia el tanque vacio
    }
    
    /**
     * Coloca las dimensiones
     */
    public void setDimensiones()
    {
        this.dimensiones=alto+"x"+alto+"x"+alto+"m^3";
    }
    
    /**
     * 
     * @return dimensiones
     */
    public String getDimensiones()
    {
        return dimensiones;
    }
    
    /**
     * Coloca la capacidad (volumen)
     */
    public void setCapacidad()
    {
        this.capacidad=alto*alto*alto;
    }
    
    /**
     * 
     * @return capacidad (volumen) del tanque
     */
    public double getCapacidad()
    {
        return capacidad;
    }
    
    /**
     * 
     * @return cantidad actual de agua
     */
    public double getCantAgua()
    {
        return cantAgua;
    }
    
    /**
     * Calcula el porcentaje de agua restante con respecto a la capacidad
     */
    public void setPorcentaje()
    {
        this.porcentajeRestante=(cantAgua*100)/capacidad;
    }
    
    /**
     * 
     * @return porcentaje 
     */
    public double getPorcentajeRestante()
    {
        return porcentajeRestante;
    }
    
    /**
     * 
     * @return forma del tanque
     */
    public String getForma()
    {
        return forma;
    }
    
    /**
     * 
     * @return numero de identificacion del tanque
     */
    public long getID()
    {
        return id;
    }
    
    /**
     * 
     * @param numero numero de valvula (del uno al 10)
     * @param municipio nombre del municipio
     * @param habitantes numero de habitantes
     */
    public void ingresarValvula(int numero, String municipio, int habitantes)
    {
        Valvula nuevaValvula=new Valvula(municipio, habitantes, numero);
        valvulas[numero-1]= nuevaValvula;
    }
    
    /**
     * Abre una valvula del tanque
     * @param numero numero de valvula
     * @param fecha fecha de apertura
     */
    public void abrirValvula(int numero, String fecha)
    {
        for(Valvula valve: valvulas)
        {
            if (valve.getNumero()==numero)
            {
                valve.abrir(fecha);
                cantAgua-=Double.valueOf(valve.getHabitantes());
            }
        }
    }
    
    /**
     * Cierra una valvula del tanque
     * @param numero numero de valvula
     * @param fecha fecha de cierre
     */
    public void cerrarValvula(int numero, String fecha)
    {
        for(Valvula valve: valvulas)
        {
            if (valve.getNumero()==numero)
            {
                valve.cerrar(fecha);
            }
        }
    }
    
    /**
     * Llena el tanque a su capacidad maxima
     */
    public void llenarTanque()
    {
        cantAgua=capacidad;
    }
    
    /**
     * 
     * @return String de informacion relevante del tanque
     */
    @Override
    public String toString()
    {
        return "\nID:"+ id+ "\nForma:" + forma + "\nDimensiones:" + dimensiones + "\nCapacidad:" + capacidad + "\nAgua Restante:" + cantAgua;
    }
    
}
