/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.Math;

/**
 *
 * @author Usuario
 */
public class Cilindrico extends Tanque{
    private double radio;
    
    public Cilindrico(String forma, long id, double alto, double radio) {
        super(forma, id, alto);
        this.radio=radio;
    }
    
    public void setDimensiones()
    {
        this.dimensiones="radio: "+radio+"\nAlto:"+alto;
    }
    
    public void setCapacidad()
    {
        this.capacidad=(alto*(radio*radio)*Math.PI);
    }
    
    
}
