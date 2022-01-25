/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author arceredillo.adrian
 */
public class CircleComputation {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);  // Scan the keyboard for input
        //final double PI = 3.14159265;
        double diameter, circunference, area;
        double radius;
        
        
        System.out.print("Valor del radio: ");
        radius = sc.nextDouble();       //lee el input como double
        
        //sc.close();
        
        diameter = 2.0 * radius;
        area = (radius * radius) * Math.PI;
        circunference = 2.0 * Math.PI * radius;
        
        DecimalFormat formato1 = new DecimalFormat("#.##");
        
        System.out.println("El diametro es: " + formato1.format(diameter));
        System.out.println("El área es: " + formato1.format(area));
        System.out.println("La circunferencia es: " + formato1.format(circunference));
        
    }
}

//https://programandoointentandolo.com/2017/11/limitar-numero-decimales-double-float-java.html