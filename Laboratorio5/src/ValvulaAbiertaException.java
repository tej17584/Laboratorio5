/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class ValvulaAbiertaException extends Exception{
    private boolean abierto;
    
    /**
     * Constructor
     * @param mensaje Mensaje de la excepcion
     * @param estado si esta abierto o no
     */
    public ValvulaAbiertaException(String mensaje, boolean estado)
    {
        super(mensaje);
        this.abierto=estado;
    }
    
    /**
     * 
     * @return estado
     */
    public boolean getEstado()
    {
        return abierto;
    }
    
}
