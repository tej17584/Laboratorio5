/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Ortogonal extends Tanque{
    private double ancho, largo;
    
    public Ortogonal(String forma, long id, double alto, double ancho, double largo) {
        super(forma, id, alto);
        this.ancho=ancho;
        this.largo=largo;
    }
    
    public void setDimensiones()
    {
        this.dimensiones=alto+"x"+ancho+"x"+largo+"m^3";
    }
    
    public void setCapacidad()
    {
        this.capacidad=alto*ancho*largo;
    }
    
    
}
