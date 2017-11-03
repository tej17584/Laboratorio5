/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrea
 */
public class NivelBajoException extends Exception {
    
    private double porcentaje;
    
    public NivelBajoException(String mensaje, double porcentaje)
    {
        super(mensaje);
        this.porcentaje=porcentaje;
    }
    
    public double getPorcentaje()
    {
        return porcentaje;
    }
    
}
