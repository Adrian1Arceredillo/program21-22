/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;
import java.util.Scanner;
import model.*;
//2 * (pi r2) = zirkulua
//+ (heigh + 2pir)

//area total cilindro = 2 pi rh + 2 pi r2 
//volumen cilindro = pir2 * h

/**
 *
 * @author arceredillo.adrian
 */
public class ZirkuluaSortu {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Circle c1 = new Circle();
        System.out.println(c1);
        
        
        System.out.println("Zirkulu arrunta edo zilindroa sortu nahi duzu(a/z)?");
        String aukeraUser = in.next().toLowerCase();
        //varaibles zirkulu arrunta
        int zirkuluaRadioA = 0; 
        String koloreaA = "";
        
        //varaibles zilindroa
        int zilindroaRadioaZ = 0;
        String koloreaZ = "";
        int altuera = 0;
        
        if (aukeraUser.equals("a")) {
            //radio
            System.out.println("Zein izango da bere erradioa? ");
            int radioAuser = in.nextInt();
            zirkuluaRadioA = radioAuser;
            //color
            System.out.println("Zein izango da bere kolorea? ");
            String koloreaAuser = in.next();
            koloreaA = koloreaAuser;
            //crear circulo
            Circle c1A = new Circle(zirkuluaRadioA, koloreaA);
            //ver datos
            System.out.println("Hauek dira sortutako ZIRKULUAren ezaugarriak");
            System.out.println("\tErradioa = " + c1A.getRadius());
            System.out.println("\tKolorea = " + c1A.getColor());
            System.out.printf("\tAzalera = %.2f\t", c1A.getArea());
            System.out.println("");
            
            
        } else if (aukeraUser.equals("z")) {
            //radio
            System.out.println("Zein izango da bere erradioa? ");
            int radioUserZ = in.nextInt();
            //kolorea
            System.out.println("Zein izango da bere kolorea? ");
            String koloreaUserZ = in.next();
            //altuera
            System.out.println("Zein izango da bere altuera? ");
            int altueraUserZ = in.nextInt();
            //crear cilindro
            Cylinder cy1Z = new Cylinder(altueraUserZ, radioUserZ, koloreaUserZ);
            //ver datos
            System.out.println("Hauek dira sortutako ZILINDROAren ezaugarriak");
            System.out.println("\tErradioa = " + cy1Z.getRadius());
            System.out.println("\tKolorea = " + cy1Z.getColor());
            System.out.println("\tAltuera = " + cy1Z.getHeight());
            System.out.printf("\tAzalera = %.2f\n", cy1Z.getArea());
            System.out.printf("\tBolumena = %.2f\n", cy1Z.getVolume());
            System.out.println("");
            
            
        }
        
    }
}

/*
https://www.varsitytutors.com/hotmath/hotmath_help/spanish/topics/surface-area-of-a-cylinder#:~:text=La%20f%C3%B3rmula%20general%20para%20el,rh%20%2B%202%20%CF%80%20r%202%20.
*/