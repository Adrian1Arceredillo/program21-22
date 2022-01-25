/*
 * Print the area and circumference of a circle, given its radius.
 */
public class CylinderComputation {  // Save as "CircleComputation.java"

    public static void main(String[] args) {
        
        //deklarazioak
        double radius, height;
        double radiusberbi;
        double albokoazalera, oinarriazalera, azaleraosoa;
        double bolumena;
        final double PI = 3.14159265;
        
        
        //ematen dizkiguten datuak
        radius = 1;
        height = 2;

        //kalkuluak
        
        radiusberbi = radius * radius;
        albokoazalera = 2 * PI * radius * height;
        oinarriazalera = PI * (radius * radius);
        azaleraosoa = albokoazalera + 2 * oinarriazalera;
        bolumena = PI * radiusberbi * height;

        // Print results
        System.out.print("Oinarriaren Azalera: ");  // Print description
        System.out.println(oinarriazalera);          // Print the value stored in the variable
        System.out.print("Alboko Azalera: ");
        System.out.println(albokoazalera);
        System.out.print("Azalera osoa: ");
        System.out.println(azaleraosoa);
        System.out.print("Bolumena: ");
        System.out.println(bolumena);
    }
}
