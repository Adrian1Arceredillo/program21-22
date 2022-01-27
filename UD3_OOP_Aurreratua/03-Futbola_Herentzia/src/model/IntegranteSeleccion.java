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
public class IntegranteSeleccion {

    /*
    Cuando un atributo lleva "#" por delante, quiere decir 
    que está protegido; es decir, no es ni public ni privte.
    
    Estos valores, no solo se pueden ver/cambiar desde la clase padre, sino 
    también desde las subclases y de los demás paquetes.
     */
    protected int id;             //protected
    protected String nombre;      //protected
    
    private String apellidos;
    private int edad;

    /**
     * Constructor 1:
     *
     */
    public IntegranteSeleccion() {

    }
    
    /**
     * Método que crea un objeto de tipo IntegranteSeleccion, recibiendo 
     * como parámetro de entrada, los valores que le queremos asignar a 
     * cada uno de los atributos que tenemos. Los atributos son los definidos 
     * previamente; estos son los siguientes: 
     * 
     * @param id
     * @param nombre
     * @param apellidos
     * @param edad 
     */
    public IntegranteSeleccion(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    /**
     * Método para obtener el valor del atributo "id"
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Método para establecer un nuevo valor de id
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * * Método para obtener el valor del atributo "nombre"
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer un nuevo valor de NOMBRE
     *
     * @param id
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el valor del atributo "apellidos"
     *
     * @param id
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Método para establecer un nuevo valor de APELLIDOS
     *
     * @param id
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Método para obtener el valor del atributo "edad"
     *
     * @param id
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método para establecer un nuevo valor de EDAD
     *
     * @param id
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * ¡Pendiente de completar! GALDETU KLASEAN
     */
    public void concentrarse() {
        System.out.println("Estoy concentrado en el Hotel. ");
    }

    /**
     * ¡Pendiente de completar! GALDETU KLASEAN
     */
    public void viajar() {
        System.out.println("Estoy de viaje con el equipo! ");
    }

    public String toString() {
        return "\tId= " + this.getId() + "," + 
                "\tNombre= " + this.getNombre() +  "," + 
                "\tApellidos= " + this.getApellidos() + "," +
                "\tEdad= " + this.getEdad() + "\n" ;
    }

}
