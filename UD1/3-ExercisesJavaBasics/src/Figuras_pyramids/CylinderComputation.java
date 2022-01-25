package Figuras_pyramids;
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
public class CylinderComputation {
    public static void main(String[] args) {
        
        double radius, altura;
        double basearea, surfacearea, volume;
        
        Scanner in = new Scanner(System.in);
        System.out.println("El radio del cilindro es: "); //determinar por teclado el valor del radio de la esfera
        radius = in.nextDouble();
        
        System.out.println("La altura del cilindro es: ");  //determinar por teclado la altura del cilindro
        altura = in.nextDouble();
        
        in.close();
        
        basearea = Math.PI * (radius * radius);
        surfacearea = 2.0 * Math.PI * (radius * radius);
        volume = basearea * altura;
        
        DecimalFormat formato1 = new DecimalFormat("#.##");
        System.out.println("El area de la base del cilindro es: " + formato1.format(basearea));
        System.out.println("El area de la superficie del cilindro es: " + formato1.format(surfacearea));
        System.out.println("El volumen del cilindro es: " + formato1.format(volume));
        
    }
    
}
