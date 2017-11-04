/*
 * Ortogonal.java
 * Clase hija para tanques cilindricos
 * Andrea Arguello 17801 Alejandro Tejada 17584
 * 3/11/2017
 */

import java.lang.Math;

/**
 *
 * @author Usuario
 */
public class Cilindrico extends Tanque{
    //Atributos
    private double radio;
    
    /**
     * Constructor
     * @param forma forma del tanque (cilindrico)
     * @param id numero de identificacion
     * @param alto altura
     * @param radio radio de la base
     */
    public Cilindrico(String forma, String id, double alto, double radio) {
        super(forma, id, alto);
        this.radio=radio;
    }
    
    /**
     * Guarda las dimensiones como String
     */
    @Override
    public void setDimensiones()
    {
        this.dimensiones="radio: "+radio+"\nAlto:"+alto;
    }
    
    /**
     * Calcula el volumen del tanque
     */
    @Override
    public void setCapacidad()
    {
        this.capacidad=(alto*(radio*radio)*Math.PI);
    }
    
    
}
