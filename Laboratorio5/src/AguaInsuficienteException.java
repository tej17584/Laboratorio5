/*
 * AguaInsuficienteException.java
 * Excepcion que no deja sacar mas agua de la que se tiene disponible
 * Andrea Arguello 17801 Alejandro Tejada 17584
 * 4/11/2017
 */

/**
 *
 * @author Usuario
 */
public class AguaInsuficienteException extends Exception{
    //Atributos
    private double resta;
    
    /**
     * Constructor
     * @param mensaje alerta
     * @param valor agua restante despues de la resta
     */
    public AguaInsuficienteException(String mensaje, double valor)
    {
        super(mensaje);
        this.resta=valor;
    }
    
    /**
     * 
     * @return resta
     */
    public double getResta()
    {
        return resta;
    }
    
}
