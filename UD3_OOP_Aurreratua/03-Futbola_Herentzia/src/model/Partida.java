/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.*;
import java.util.*;
import java.time.*;


/**
 *
 * @author arceredillo.adrian
 */
public class Partida extends Futbolista {
    
    private LocalDate data;
    private String aurkaria;    //esto haría referencia al nombre del contrario
    private ArrayList<Futbolista> txartelak = new ArrayList<Futbolista>();
    private int id = 0;
    
    
    /**
     * Método que creará un nuevo objeto de tipo Partida
     */
    public Partida() {
        
    }
    
    /**
     * Método que creará una nueva partida. En este caso, este método 
     * recibe como parámetros de entrada, la fecha en la que se jugará, 
     * y el nombre del contrario. 
     * 
     * @param data
     * @param aurkaria 
     */
    public Partida(LocalDate data, String aurkaria) {
        this.data = data;
        this.aurkaria = aurkaria;
    }
    
    
    /**
     * Método que creará una nueva partida. En este caso, este método 
     * recibe como parámetros de entrada, la fecha en la que se jugará, 
     * el nombre del contrario, y un array que recoge los jugadores que 
     * han recibido una tarjeta.
     * 
     * @param data
     * @param aurkaria 
     */
    public Partida(LocalDate data, String aurkaria, ArrayList<Futbolista> jugadoresAmonestados) {
        this.id = ++id;
        this.data = data;
        this.aurkaria = aurkaria;
        this.txartelak = jugadoresAmonestados;
    }
    
    
    
    /**
     * Método que devuelve el valor del atributo "data". Este hace 
     * referencia a CÚANDO se realizará la partida correspondiente.
     * 
     * @return 
     */
    public LocalDate getData() {
        return data;
    }
    
    
    /**
     * Método para establecer/cambiar la fecha de una determinada partida. Para
     * ello, será necesario recibir un parámetro de entrada de tipo LocalDate.
     * 
     * @param data 
     */
    public void setData(LocalDate data) {
        this.data = data;
    }
    
    /**
     * Método que devolverá el valor correspondiente al atributo "aurkaria". Este 
     * valor de vuelta, será del mismo tipo que el atributos (String)
     * 
     * @return 
     */
    public String getAurkaria() {
        return aurkaria;
    }
    
    /**
     * Método para establecer/cambiar un nuevo valor al atributo AURKARIA
     * @param aurkaria 
     */
    public void setAurkaria(String aurkaria) {
        this.aurkaria = aurkaria;
    }
    
    /**
     * Método para obtener el arrayList que contiene las tarjetas que se han 
     * asignado/puesto a los jugadores. 
     * 
     * @return 
     */
    public ArrayList<Futbolista> getTxartelak() {
        return txartelak;
    }
    
    
    /**
     * ¡GALDETU KLASEAN!
     * 
     * Método que permite añadir un nuevo registro al arrayList. Cada registro 
     * nuevo, se entenderá como que ese determinado jugador, ha recibido una 
     * amonestación. Para ello, será necesario que dicho arrayList recoja los 
     * datos del jugador (valores de sus atributos).
     * 
     * @param txartelak 
     */
    public void setTxartelak(ArrayList<Futbolista> txartelak) {
        this.txartelak = txartelak;
    }
    
    @Override
    public String toString() {
        return "\tData: " + this.getData() + ", \n" + 
                "\tAurkaria: " + this.getAurkaria() + ", \n\n" + 
                "\tTxartelak: \n" + this.getTxartelak();
                
    }
    
    /**
     * Método que permite asignarle una tarjeta a un jugador que se 
     * le pase como parámetro de entrada. 
     * @param jokalaria 
     */
    public void txartelaJarri(Futbolista jokalaria) {
        this.txartelak.add(jokalaria);
    }
    
}

/*
Antes de especificar qué jugadores (tipo Futbolista) recibirán una tarjeta, es necesario  filtrar, por tipo (clases), cada elemento 
        del arrayList general ("selekzioa"). En este caso, tendremos que hacer una selección de todos los elementos que sean "Futbolista".
        
        Todos los elementos Futbolista de cada partida, se guardarán en un nuevo arrayList correspondiente a cada partida. Por último, se 
        realizará una selección aleatoria de 2 jugadores de cada partida. Estos jugadores serán los amonestados. 



 //arrayList de elementos de tipo Futbolista de cada partida
        ArrayList<Futbolista> jugadoresP1 = new ArrayList<Futbolista>();    //partida 1
        ArrayList<Futbolista> jugadoresP2 = new ArrayList<Futbolista>();    //partida 2
        ArrayList<Futbolista> jugadoresP3 = new ArrayList<Futbolista>();    //partida 3
        ArrayList<Futbolista> jugadoresP4 = new ArrayList<Futbolista>();    //partida 4
        ArrayList<Futbolista> jugadoresP5 = new ArrayList<Futbolista>();    //partida 5
*/