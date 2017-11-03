/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    
    public void setCapacidad()
    {
        this.capacidad=alto*alto*alto;
    }
    
    public double getCapacidad()
    {
        return capacidad;
    }
    
    public void setCantAgua()
    {
        this.cantAgua=capacidad;
    }
    
    public double getCantAgua()
    {
        return cantAgua;
    }
    
    public void setPorcentaje()
    {
        this.porcentajeRestante=(cantAgua*100)/capacidad;
    }
    
    public double getPorcentajeRestante()
    {
        return porcentajeRestante;
    }
    
    public String getForma()
    {
        return forma;
    }
    
    public long getID()
    {
        return id;
    }
    
    public void ingresarValvula(int numero, String municipio, int habitantes)
    {
        Valvula nuevaValvula=new Valvula(municipio, habitantes, numero);
        valvulas[numero-1]= nuevaValvula;
    }
    
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
    
    public void llenarTanque()
    {
        cantAgua=capacidad;
    }
    
    
}
