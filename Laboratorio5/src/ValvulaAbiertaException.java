/*
 * ValvulaAbiertaException.java
 * Excepcion si se trata de abrir/cerrar una valvula que ya está abierta/cerrada respectivamente
 * Andrea Arguello 17801 Alejandro Tejada 17584
 * 4/11/2017
 */

/**
 *
 * @author Andrea
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
