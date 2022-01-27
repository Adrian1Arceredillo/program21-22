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
public class Entrenador extends IntegranteSeleccion {
    
    private String idFederacion;
    
    
    /**
     * Método para crear un objeto
     */
    public Entrenador() {
        
    }
    
    
    /**
     * Método para crear un objeto de tipo Entrenador, pero 
     * recibiendo como parámetros de entrada, los valores 
     * de los atributos que se encuentran en la clase padre 
     * llamada "IntegranteSeleccion". 
     * 
     * Dichos atributos son los siguientes:
     * @param id
     * @param nombre
     * @param apellidos 
     */
    public Entrenador(int id, String nombre, String apellidos, int edad, 
            String idFederacion) {
        
        super();
        this.id = id;
        this.nombre = nombre;
        this.setApellidos(apellidos);
        this.setEdad(edad);
        
        this.idFederacion = idFederacion;
    }
    
    /**
     * Método para obtener el valor de idFederacion
     * @return 
     */
    public String getIdFederacion() {
        return idFederacion;
    }
    
    /**
     * Este setter permite establecer un nuevo valor 
     * al atributo idFederacion. Este valor tendrá que 
     * introducirse como parámetro de entrada. 
     * 
     * @param idFederacion 
     */
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    
    /**
     * Método que imprimirá un mensaje
     */
    public void dirigirEntrenamiento() {
        System.out.println("Los jugadores realizan correctamente los estiramientos. ");
    }
    
    /**
     * Método que imprimirá un mensaje
     */
    public void dirigirPartido() {
        System.out.println("¡Haced la jugada que hemos practicado en el entrenamiento! ");
    }
    
    
    @Override
    public String toString() {
        return "\tId = " + this.getId() + "\n" + 
                "\tNombre = " + this.getNombre() + "\n" + 
                "\tApellido = " + this.getApellidos() + "\n" + 
                "\tEdad = " + this.getEdad() + "\n" + 
                "\tId Federacion = " + this.getIdFederacion() + "\n";
    }
    
}
