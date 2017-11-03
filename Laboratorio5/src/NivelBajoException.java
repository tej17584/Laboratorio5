/*
 * NivelBajoException.java
 * Excepcion para los porcentajes.
 * Andrea Arguello 17801 Alejandro Tejada 17584
 * 2/11/2017
 */

/**
 *
 * @author Usuario
 */
public class NivelBajoException extends Exception {
    //Atributos
    private double porcentaje;
    
    /**
     * Constructor
     * @param mensaje Mensaje de la excepcion
     * @param porcentaje Porcentaje de la alerta
     */
    public NivelBajoException(String mensaje, double porcentaje)
    {
        super(mensaje);
        this.porcentaje=porcentaje;
    }
    
    /**
     * 
     * @return porcentaje
     */
    public double getPorcentaje()
    {
        return porcentaje;
    }
    
}
