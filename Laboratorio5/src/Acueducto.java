/*
 * Acueducto.java
 * Realiza las acciones.
 * Andrea Arguello 17801 Alejandro Tejada 17584
 * 3/11/2017
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Acueducto {
    //Atributos
    public ArrayList<Tanque> tanques;
    public int valvCilindros;
    public  double cantAgua;
    
    /**
     *Constructor
     */
    public Acueducto()
    {
        tanques=new ArrayList<>();
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
    public void agregarCubico(String forma, String id, double alto, ArrayList<String> municipios, ArrayList<Integer> habitantes)
    {
        Tanque temporal=null;
        temporal= new Cubico(forma,id,alto);
        for(int i=0; i<municipios.size(); i++)
        {
            temporal.ingresarValvula(i+1, municipios.get(i), habitantes.get(i));
        }
        temporal.setDimensiones();
        temporal.setCapacidad();
        temporal.llenarTanque();
        
        tanques.add(temporal);
       
    }
    
    /**
     * Calcula el agua disponible para la region completa
     * @return cantidad de agua en m^3
     */
    public double getAguaRegion()
    {   cantAgua=0;
        for(Tanque tanque:tanques)
        {
            cantAgua+=tanque.getCantAgua();
        }
        return cantAgua;
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
    public void agregarOrtogonal(String forma, String id, double alto, double ancho, double largo, ArrayList<String> municipios, ArrayList<Integer> habitantes)
    {
        Tanque temporal=null;
        temporal = new Ortogonal(forma,id,alto,ancho,largo);
        for(int i=0; i<municipios.size(); i++)
        {
            temporal.ingresarValvula(i+1, municipios.get(i), habitantes.get(i));
        }
        temporal.setDimensiones();
        temporal.setCapacidad();
        temporal.llenarTanque();
        //Busca un espacio vacio en el Array de Tanques
        tanques.add(temporal);
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
    public void agregarCilindrico(String forma, String id, double alto, double radio, ArrayList<String> municipios, ArrayList<Integer> habitantes)
    {
        Tanque temporal=null;
         temporal = new Cilindrico(forma,id,alto,radio);
        for(int i=0; i<municipios.size(); i++)
        {
            temporal.ingresarValvula(i+1, municipios.get(i), habitantes.get(i));
        }
        temporal.setDimensiones();
        temporal.setCapacidad();
        temporal.llenarTanque();
        
        tanques.add(temporal);
        
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
            if (tanque!=null) {
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
        }
        return valvCilindros;
    }
    
    /**
     * Indica la cantidad de agua dentro del tanque
     * @param id numero del tanque
     * @return cantidad de agua
     */
    public double aguaDisponible(String id)
    {   double agua=0;
        for(Tanque tanque:tanques)
        {
            if (tanque!=null) {
                if(tanque.getID()==(id))
            {
                agua=tanque.getCantAgua();
                return agua;
            }
            }
        }
        return agua;
    }
    
    /**
     * Indica la capacidad del tanque
     * @param id numero de identificacion
     * @return capacidad
     */
    public double capacidadTanque(String id)
    {
        double cap=0;
        for(Tanque tanque:tanques)
        {
            if (tanque!=null) {
                 if(tanque.getID()==(id))
            {
                cap=tanque.getCapacidad();
                return cap;
            }
            }
        }
        return cap;
    }
    
    /**
     * Llena el tanque a su capacidad maxima
     * @param id numero de identificacion del tanque
     */
    public void llenarTanque(String id)
    {
       for(Tanque tanque:tanques)
        {
            if (tanque!=null) {
                if(tanque.getID()==(id))
            {
                tanque.llenarTanque();
            }
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
            if (tanque!=null) {
                
            t+=tanque.toString();
            t+="\n";
            }
        }
        return t;
    }
  
    
    /**
     * Indica el porcentaje de agua dentro del tanque
     * @param id numero del tanque
     * @return porcentaje
     */
    public double getPorcentaje(String id)
    {
        double p=0;
        for(Tanque tanque:tanques)
        {
            if (tanque!=null) {
                if(tanque.getID()==(id))
            {
                tanque.setPorcentaje();
                p=tanque.getPorcentajeRestante();
                return p;
            }
            }
        }
        return p;
    }
    
    /**
    public void Excepcion(long id)
    {
        try{
            porcentajeBajo.porcentajeBajo(getPorcentaje(id));
        }
        catch(NivelBajoException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }
    * /
    
    /**
     * Abre la valvula
     * @param id numero de tanque
     * @param numero numero de valvula
     * @param fecha fecha de apertura
     */
    public void abrirValvula(String id, int numero, String fecha)
    {
        for(Tanque tanque:tanques)
        {
            if (tanque!=null) {
                if(tanque.getID()==(id))
            {
                tanque.abrirValvula(numero,fecha);
            }
            }
        }
    }
    
    /**
     * Cierra la valvula
     * @param id numero de tanque
     * @param numero numero de valvula
     * @param fecha fecha de cierre
     */
    public void abrirCerrar(String id, int numero, String fecha)
    {
        for(Tanque tanque:tanques)
        {
            if (tanque!=null) {
                if(tanque.getID()==(id))
            {
                tanque.cerrarValvula(numero,fecha);
            }
            }
        }
    }
    
    /**
     * Regresa las valvuals de un tanque
     * @param id numero de tanque
     * @return lista de las valvulas
     */
    public Valvula[] getValvulas(String id)
    {
        Valvula[] thisvalvulas = new Valvula[10];
        for(Tanque tanque:tanques)
        {
            if (tanque!=null) {
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
        }
        return thisvalvulas;
    }
    
    
    public boolean verificarIDTanque(String idTanque){
       boolean verificacion=false;
        for (Tanque tanque : tanques) {
            if (tanque.getID().equals(idTanque)) {
                verificacion=true;
            }
            else{
                verificacion=false;
            }
        }
        return verificacion;
    }
    
    
}
