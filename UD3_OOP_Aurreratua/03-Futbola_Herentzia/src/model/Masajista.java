/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.*;

/**
 *
 * @author arceredillo.adrian
 */
public class Masajista extends IntegranteSeleccion {
    
    private String titulacion;
    private int añosExperiencia;
    
    
    /**
     * Método para crear un nuevo objeto del tipo Masajista, pero 
     * sin recibir ningún parámetro como entrada. 
     * 
     */
    public Masajista() {
        
    }
    
    /**
     * Método que creará un nuevo objeto de tipo Masajista. En este 
     * caso, recibirá como parámetros de entrada los valores de los 
     * atributos correspondientes a la clase IntegranteSeleccion, y 
     * además, los valores de los atributos de esta clase. 
     * 
     * @param id
     * @param nombre
     * @param apellidos
     * @param edad
     * 
     * @param titulacion
     * @param añosExperiencia 
     */
    public Masajista(int id, String nombre, String apellidos, int edad, 
            String titulacion, int añosExperiencia) {
        
        super();
        this.id = id;
        this.nombre = nombre;
        this.setApellidos(apellidos);
        this.setEdad(edad);
        
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }
    
    /**
     * Método para obtener le valor del atributo "titulacion"
     * @return 
     */
    public String getTitulacion() {
        return titulacion;
    }
    
    /**
     * Este método nos permite establecer/cambiar el contenido 
     * del atributo TITULACION
     * 
     * @param titulacion 
     */
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    
    /**
     * Método para obtener le valor del atributo "añosExperiencia"
     * @return 
     */
    public int getAñosExperiencia() {
        return añosExperiencia;
    }
    
    /**
     * Este método nos permite establecer/cambiar el contenido 
     * del atributo AÑOSEXPERIENCIA
     * 
     * @param titulacion 
     */
    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    
    /**
     * Método que devolverá un mensaje. 
     */
    public void darMasaje() {
        System.out.println("Los jugadores necesitan un "
                + "masaje antes y después del partido. ");
    }
    
    
    @Override
    public String toString() {
        return "Id = " + this.getId() + ", " +  
                "Nombre = " + this.getNombre() + ", " +  
                "Apellido = " + this.getApellidos() + ", " +  
                "Edad = " + this.getEdad() + ", " +  
                "Titulacion = " + this.getTitulacion() + ", " +  
                "Años de Experiencia = " + this.getAñosExperiencia() + "\n";
    }
    
    
    
}
