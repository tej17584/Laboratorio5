/*
 * hayAguaInsuficiente.java
 * Usa la excepcion
 * Andrea Arguello 17801 Alejandro Tejada 17584
 * 4/11/2017
 */

/**
 *
 * @author Usuario
 */
public class hayAguaInsuficiente {
    //Atributos
    public static final double maximo=0;
    
    /**
     * constructor
     * @param cantARestar cantidad de agua a restar
     * @param cantAgua cantidad de agua en el tanque
     * @throws AguaInsuficienteException Lanza la excepcion
     */
    public static void hayAguaInsuficiente(double cantARestar, double cantAgua) throws AguaInsuficienteException
    {
        AguaInsuficienteException excepcion;
        String alerta;
        double resta;
        
        resta=cantAgua-cantARestar;
        
        if(resta<maximo)
        {
            alerta="Esta cantidad es mayor al agua disponible";
            excepcion=new AguaInsuficienteException(alerta,resta);
            throw excepcion;
        }
    }
    
}
