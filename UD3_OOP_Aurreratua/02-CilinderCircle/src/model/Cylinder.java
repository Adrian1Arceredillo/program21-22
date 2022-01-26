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
public class Cylinder extends Circle {
    // private instance variable

    private double height;

    /**
     * Construcot para crear un cilindro sin pasarle parametros de entrada.
     */
    public Cylinder() {
        super();  //invoca al constructor Circle() de la superclase
        this.height = 1.0;
    }

    /**
     * Constructor para crear un cilindro. Para ello, tendremos que pasarle un
     * valor como parámetro de entrada. En este caso, este parámetro hará
     * referencia a la altura que tendrá el cilindro.
     *
     * @param height
     */
    public Cylinder(double height) {
        super();  //invoca al constructor Circle() de la superclase

        this.height = height;
    }

    /**
     * Constructor que creará un cilindro partiendo de los siguientes parámetros
     * de entrada.
     *
     * @param height = altura deseada
     * @param radius = radio deseado
     */
    public Cylinder(double height, double radius) {
        super(radius);  // invoke superclass' constructor Circle(radius)
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius)");  // for debugging
    }

    /**
     * Constructor que creará un objeto a partir de unos parámetros de entrada.
     * Estos parámetros serán los siguientes:
     *
     * @param height = ALTURA DESEADA del cilindro
     * @param radius = RADIO DESEADO deseado del cilindro
     * @param color = COLOR DESEADO del cilindor
     */
    public Cylinder(double height, double radius, String color) {
        super(radius, color);  // invoke superclass' constructor Circle(radius, color)
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius, color)");  // for debugging
    }

    /**
     * Método para obtener la altura del cilindro.
     *
     * @return
     */
    public double getHeight() {
        return this.height;
    }

    /**
     * Método para establecer una nueva altura del cilindro.
     *
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Este método devolverá el valor del volumen del cilindro.
     */
    public double getVolume() {
        return super.getArea() * height;   // Use Circle's getArea()
    }

    /**
     * Mediante este método, podemos obtener información acerca del objeto.
     */
    public String toString() {
        return "This is a Cylinder";  // to be refined later
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }
}
