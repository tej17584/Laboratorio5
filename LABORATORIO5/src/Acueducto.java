/*
 * Acueducto.java
 * Realiza las acciones.
 * Andrea Arguello 17801 Alejandro Tejada 17184
 * 3/11/2017
 */

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Acueducto {
    //Atributos
    private Tanque[] tanques;
    private int valvCilindros;
    private Tanque temporal;
    
    /**
     *Constructor
     */
    public Acueducto()
    {
        tanques=new Tanque[10];
        valvCilindros=0;
    }
    
    /**
     * Agrega un tanque cubico
     * @param forma forma del tanque
     * @param id numero de identificacion
     * @param alto altura
     * @param municipios municipios de las valvulas
     * @param habitantes cantidad de habitantes de los municipios
     */
    public void agregarCubico(String forma, long id, double alto, ArrayList<String> municipios, ArrayList<Integer> habitantes)
    {
        Cubico nuevoCubico= new Cubico(forma,id,alto);
        for(int i=0; i<10; i++)
        {
            nuevoCubico.ingresarValvula(i+1, municipios.get(i), habitantes.get(i));
        }
        
        //Busca un espacio vacio en el Array de Tanques
        for(int j=0; j<10; j++)
        {
            if(tanques[j]==null)
            {
                tanques[j]=nuevoCubico;
            }
            break;
        }
    }
    
    /**
     * Agrega un tanque ortogonal
     * @param forma forma del tanque
     * @param id numero de identificacion
     * @param alto altura
     * @param ancho ancho de la base
     * @param largo largo de la base
     * @param municipios municipios de las valvulas
     * @param habitantes cantidad de habitantes de los municipios
     */
    public void agregarOrtogonal(String forma, long id, double alto, double ancho, double largo, ArrayList<String> municipios, ArrayList<Integer> habitantes)
    {
        Ortogonal nuevoOrtogonal= new Ortogonal(forma,id,alto,ancho,largo);
        for(int i=0; i<10; i++)
        {
            nuevoOrtogonal.ingresarValvula(i+1, municipios.get(i), habitantes.get(i));
        }
        
        //Busca un espacio vacio en el Array de Tanques
        for(int j=0; j<10; j++)
        {
            if(tanques[j]==null)
            {
                tanques[j]=nuevoOrtogonal;
            }
            break;
        }
    }
    
    /**
     * Agrega un tanque cilindrico
     * @param forma forma del tanque
     * @param id numero de identificacion
     * @param alto altura
     * @param radio radio de la base
     * @param municipios municipios de las valvulas
     * @param habitantes cantidad de habitantes de los municipios
     */
    public void agregarCilindrico(String forma, long id, double alto, double radio, ArrayList<String> municipios, ArrayList<Integer> habitantes)
    {
        Cilindrico nuevoCilindro= new Cilindrico(forma,id,alto,radio);
        for(int i=0; i<10; i++)
        {
            nuevoCilindro.ingresarValvula(i+1, municipios.get(i), habitantes.get(i));
        }
        
        //Busca un espacio vacio en el Array de Tanques
        for(int j=0; j<10; j++)
        {
            if(tanques[j]==null)
            {
                tanques[j]=nuevoCilindro;
            }
            break;
        }
    }
    
    /**
     * Calcula la cantidad de valvulas abiertas de los tanques cilindricos
     * @return valvCilindros (cantidad de valvulas abiertas)
     */
    public int valvulasAbiertasCilindro()
    {
        valvCilindros=0;
        for(Tanque tanque:tanques)
        {
            if(tanque.getForma().equals("CILINDRO"))
            {
                for(Valvula valve: tanque.valvulas)
                {
                    if(valve.getAbierto()==true)
                    {
                        valvCilindros++;
                    }
                }
            }
        }
        return valvCilindros;
    }
    
    /**
     * Indica la cantidad de agua dentro del tanque
     * @param id numero del tanque
     * @return cantidad de agua
     */
    public double aguaDisponible(long id)
    {   double agua=0;
        for(Tanque tanque:tanques)
        {
            if(tanque.getID()==(id))
            {
                agua=tanque.getCantAgua();
                return agua;
            }
        }
        return agua;
    }
    
    /**
     * Indica la capacidad del tanque
     * @param id numero de identificacion
     * @return capacidad
     */
    public double capacidadTanque(long id)
    {
        double cap=0;
        for(Tanque tanque:tanques)
        {
            if(tanque.getID()==(id))
            {
                cap=tanque.getCapacidad();
                return cap;
            }
        }
        return cap;
    }
    
    /**
     * Llena el tanque a su capacidad maxima
     * @param id numero de identificacion del tanque
     */
    public void llenarTanque(long id)
    {
       for(Tanque tanque:tanques)
        {
            if(tanque.getID()==(id))
            {
                tanque.llenarTanque();
            }
        } 
    }
    
    /**
     * Devuelve los tanques de la region con su informacion
     * @return informacion de los tanques de la lista
     */
    public String getTanquesAcueducto()
    {
        String t="";
        for(Tanque tanque:tanques)
        {
            t+=tanque.toString();
            t+="\n";
        }
        return t;
    }
    
    /**
     * Indica el porcentaje de agua dentro del tanque
     * @param id numero del tanque
     * @return porcentaje
     */
    public double getPorcentaje(long id)
    {
        double p=0;
        for(Tanque tanque:tanques)
        {
            if(tanque.getID()==(id))
            {
                tanque.setPorcentaje();
                p=tanque.getPorcentajeRestante();
                return p;
            }
        }
        return p;
    }
    
    /**
     * Abre la valvula
     * @param id numero de tanque
     * @param numero numero de valvula
     * @param fecha fecha de apertura
     */
    public void abrirValvula(long id, int numero, String fecha)
    {
        for(Tanque tanque:tanques)
        {
            if(tanque.getID()==(id))
            {
                tanque.abrirValvula(numero,fecha);
            }
        }
    }
    
    /**
     * Cierra la valvula
     * @param id numero de tanque
     * @param numero numero de valvula
     * @param fecha fecha de cierre
     */
    public void abrirCerrar(long id, int numero, String fecha)
    {
        for(Tanque tanque:tanques)
        {
            if(tanque.getID()==(id))
            {
                tanque.cerrarValvula(numero,fecha);
            }
        }
    }
    
    /**
     * Regresa las valvuals de un tanque
     * @param id numero de tanque
     * @return lista de las valvulas
     */
    public Valvula[] getValvulas(long id)
    {
        Valvula[] thisvalvulas = new Valvula[10];
        for(Tanque tanque:tanques)
        {
            if(tanque.getID()==(id))
            {
                for(Valvula valve:tanque.valvulas)
                {
                    for(int i=0; i<10; i++)
                    {
                        if(valve.getNumero()==i+1)
                        {
                            thisvalvulas[i]=valve;
                        }
                    }
                }
            }
        }
        return thisvalvulas;
    }
    
    
}
