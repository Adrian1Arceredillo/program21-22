
/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle {    // Save as "Circle.java"
    // los atributos privados, solo se podrán utilizar cuando estén dentro de la clase definida

    private double radius;
    private String color;

    // Constructors
    /* Constructs a Circle instance with default radius and color     */
    public Circle() {                   // 1st Constructor (default constructor)
        radius = 1.0;
        color = "red";
    }

    /* Construir un Circle instancecon el radiuo dado y con el color por defecto     */
    public Circle(double r) {           // 2nd Constructor
        radius = r;
        color = "red";
    }

    /* Constructs a Circle instance con el radio y el color dados    */
    public Circle(double r, String c) { // 3rd Constructor
        radius = r;
        color = c;
    }

    // Public methods
    /* Devuelve el radio  */
    public double getRadius() {  // getter for radius
        return radius;
    }

    /* Devuelve el color  */
    public String getColor() {   // getter for color
        return color;
    }

    /* Devuelve el area del círculo  */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    //moodle Ejer 3
    /**
     * Objektuaren deskribapena bueltatzen du, String formatuan
     */
    public String toString() {
        return "Circle[radius =" + radius + ",color=" + color + "]";
    }

    /** moodle Ejer 4 -> setter for radius -> Darle un nuevo radio al círculo.
     * 
     * @param newRadius erradio berria
     */
    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    //moodle Ejer 4 -> setter for color
    public void setColor(String newColor) {
        color = newColor;
    }

}
