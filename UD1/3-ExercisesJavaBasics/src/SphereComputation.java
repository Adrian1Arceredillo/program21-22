
import java.util.Scanner;
import java.text.DecimalFormat;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class SphereComputation {
    public static void main(String[] args) {
        
        double radius, surfacearea, volume;
        
        System.out.print("Primer número íntegro: ");
        Scanner in = new Scanner(System.in);  // Scan the keyboard for input
        radius = in.nextDouble();
        
        in.close();
        
        surfacearea = 4 * Math.PI * (radius * radius);
        volume = 4 / 3 * (Math.PI * radius * radius * radius);
        
        DecimalFormat formato1 = new DecimalFormat ("#.##");
        
        System.out.println("El area de superficie de la esfera es: " + formato1.format(surfacearea));
        System.out.println("El volumen de la esfera es: " + formato1.format(volume));
        
    }
    
}
