/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author arceredillo.adrian
 */
public class Futbolista extends IntegranteSeleccion {
    
    private int dorsal;
    private Demarkazioa demarcacion;
    
    /**
     * Método que creará un objeto de tipo "IntegranteSeleccion"
     */
    public Futbolista() {
        
    }
    
    
    /**
     * Método que creará un objeto de tipo "IntegranteSeleccion", recibiendo 
     * como parámetros de entrada los atributos de la clase 
     * "IntegranteSeleccion". Estos atributos son los siguientes:
     * 
     * @param id
     * @param nombre
     * @param apellidos
     * @param edad
     */
    public Futbolista(int id, String nombre, String apellidos, int edad,
            int dorsal, Demarkazioa demarcacion) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.setApellidos(apellidos);
        this.setEdad(edad);
        
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
        
    }
    
    
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Demarkazioa getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(Demarkazioa demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    /**
     * Método que te devuelve un mensaje
     */
    public void entrenar() {
        System.out.println("Estoy en el entrenamiento. ");
    }
    
    /**
     * Método que te devuelve un mensaje
     */
    public void jugarPartido() {
        System.out.println("Estoy jugando un partido. ");
    }

    @Override
    public String toString() {
        return "\tId = " + this.getId() + ", " + 
                "Nombre = " + this.getNombre() + ", " +  
                "Apellido = " + this.getApellidos() + ", " +  
                "Edad = " + this.getEdad() + ", " +  
                "Dorsal = " + this.dorsal + ", " +  
                "Demarcacion = " + this.getDemarcacion() + "\n";
    }
    
    
    
    
    
}
