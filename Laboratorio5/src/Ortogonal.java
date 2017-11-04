/*
 * Ortogonal.java
 * Clase hija para tanques ortogonales
 * Andrea Arguello 17801 Alejandro Tejada 17584
 * 3/11/2017
 */

/**
 *
 * @author Usuario
 */
public class Ortogonal extends Tanque{
    //Atributos
    private double ancho, largo;
    
    /**
     * Constructor
     * @param forma forma del tanque (ortogonal)
     * @param id numero de identificacion
     * @param alto altura
     * @param ancho ancho de la base
     * @param largo largo de la base
     */
    public Ortogonal(String forma, String id, double alto, double ancho, double largo) {
        super(forma, id, alto);
        this.ancho=ancho;
        this.largo=largo;
    }
    
    /**
     * Guarda las dimensiones como String
     */
    @Override
    public void setDimensiones()
    {
        this.dimensiones=alto+"x"+ancho+"x"+largo+"m^3";
    }
    
    /**
     * Calcula el volumen del tanque
     */
    @Override
    public void setCapacidad()
    {
        this.capacidad=alto*ancho*largo;
    }
    
    
}
