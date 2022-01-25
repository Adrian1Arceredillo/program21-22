/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.*;
import model.*;

/**
 *
 * @author arceredillo.adrian
 */
public class guztiaTesteatu {

    public static void main(String[] args) {

        //crear 3 puntos diferentes
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(2, 3);
        MyPoint p3 = new MyPoint(2, 3);
        //crear un círculo
        MyCircle zirkulu1 = new MyCircle(5, 3, 2);
        //crear un triángulo
        MyTriangle tri1 = new MyTriangle(1, 15, -2, 9, 2, 6);
        //crear un rectángulo
        MyRectangle rec1 = new MyRectangle(p1, p2);

        /*System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);*/
        Scanner in = new Scanner(System.in);
        int aukera; //variable que recogerá las peticiones del usuario

        do {
            System.out.println();
            System.out.println("====================================");
            System.out.println("FORMEKIN JOLASTEN");
            System.out.println("====================================");
            System.out.println("1.- Forma (klase) bat aukeratu objetu bat sortu: ");
            System.out.println("2.- Hasieratik sortuta dagoen ZIRKULUAREN datu guztiak bistarazi: ");
            System.out.println("3.- Hasieratik sortuta dagoen LAUKIZUZENAREN datu guztiak bistarazi: ");
            System.out.println("4.- Hasieratik sortuta dagoen TRIANGELUAREN datu guztiak bistarazi: ");
            System.out.println("5.- Formekin jolastu ");
            System.out.println("6.- Irten ");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");

            aukera = in.nextInt();
            System.out.println("");
            switch (aukera) {
                case 1:
                    System.out.println("Puntua/laukizuzena/triangelua/zirkulua ");
                    System.out.println("Zein forma egin nahi duzu? ");

                    formaBatSortu();
                    break;
                case 2:
                    zirkuluBatenDatuGuztiak();
                    break;
                case 3:
                    laukizuzenBatenDatuGuztiak();
                    break;
                case 4:
                    triangeluBatenDatuGuztiak();
                    break;
                case 5:
                    Puntu9Lerro4.main(args);
                    break;
                case 6:
                    System.out.println("Saliendo del programa... ");
                    System.out.println("FIN. ");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
        } while (aukera != 6);

    }

    public static void formaBatSortu() {

        Scanner in = new Scanner(System.in);
        String zeinForma = in.next().toLowerCase();
        System.out.println("");

        if (zeinForma.equals("zirkulua")) {
            System.out.print("\tX - Sartu zentroaren X balioa (0-10): ");
            int centroCircleX = in.nextInt();
            System.out.print("\tY -Sartu zentroaren Y balioa (0-10): ");
            int centroCircleY = in.nextInt();
            System.out.print("\tr - Sartu erradioaren balioa (0-10): ");
            int radioCircle = in.nextInt();

            MyCircle c1 = new MyCircle(centroCircleX,
                    centroCircleY,
                    radioCircle
            );

            System.out.println("\nZirkuluaren datuak: " + c1);

        } else if (zeinForma.equals("laukizuzena")) {

            System.out.print("\ttopLeft - X balioa: ");
            int topLeftX = in.nextInt();
            System.out.print("\ttopLeft - Y balioa: ");
            int topLeftY = in.nextInt();
            System.out.println("");
            System.out.print("\tbottomRight - X balioa: ");
            int bottomRightX = in.nextInt();
            System.out.print("\tbottomRight - Y balioa: ");
            int bottomRightY = in.nextInt();

            MyPoint topLeft = new MyPoint(topLeftX, topLeftY);
            MyPoint bottomRight = new MyPoint(bottomRightX, bottomRightY);

            MyRectangle rec1 = new MyRectangle(topLeft, bottomRight);
            System.out.println("");
            System.out.println("Laukizuzenaren datuak: " + rec1);

        } else if (zeinForma.equals("triangelua")) {

            System.out.print("\tXP1 - Lehenengo puntuaren X-a: ");
            int xP1 = in.nextInt();
            System.out.print("\tYP1 - Lehenengo puntuaren Y-a: ");
            int yP1 = in.nextInt();
            System.out.println("");
            System.out.print("\tXP1 - Bigarren puntuaren X-a: ");
            int xP2 = in.nextInt();
            System.out.print("\tYP1 - Bigarren puntuaren Y-a: ");
            int yP2 = in.nextInt();
            System.out.println("");
            System.out.print("\tXP3 - Hirugarren puntuaren X-a: ");
            int xP3 = in.nextInt();
            System.out.print("\tYP3 - Hirugarren puntuaren Y-a: ");
            int yP3 = in.nextInt();

            MyTriangle t1 = new MyTriangle(xP1, yP1, xP2, yP2, xP3, yP3);
            System.out.println("");
            System.out.println("Triangeluaren datuak: " + t1);

        } else if (zeinForma.equals("puntua")) {

            System.out.print("\tX - puntuaren X balioa: ");
            int puntuaX = in.nextInt();
            System.out.print("\tY - puntuaren Y balioa: ");
            int puntuaY = in.nextInt();

            MyPoint pUser = new MyPoint(puntuaX, puntuaY);
            System.out.println("");
            System.out.println("Puntuaren datuak: " + pUser);

        }

    }

    public static void zirkuluBatenDatuGuztiak() {
        MyCircle zirkulu1 = new MyCircle(5, 3, 5);  //crear un círculo con unos valores determinados

        System.out.println(zirkulu1);
        System.out.println("");
        System.out.printf("\tEl area es: %.2f%n", zirkulu1.getArea());
        System.out.printf("\tLa circunferencia es: %.2f%n", zirkulu1.getCircumference());
        System.out.println("");
        System.out.println("\tZentroa: " + zirkulu1.getCenter());
        System.out.println("\tErradioa: " + zirkulu1.getRadius());
        System.out.println("");

        MyPoint puntoCirc = new MyPoint(3, 1);
        System.out.println("(3, 1) puntua, zirkuluaren barruan dago? ");
        if (zirkulu1.isInside(puntoCirc)) {
            System.out.println("\tBai. Barruan dago. ");
        } else {
            System.out.println("\tBai. Barruan dago. ");
        }

    }
    
    
    public static void laukizuzenBatenDatuGuztiak() {
        
        MyPoint topLeft = new MyPoint(2, 5);
        MyPoint bottomRight = new MyPoint(3, -1);
        
        MyRectangle recta1 = new MyRectangle(topLeft, bottomRight);

        System.out.println(recta1);
        System.out.println("");
        System.out.println("\t* Anchura: " + recta1.getAnchura());
        System.out.println("\t* Altura: " + recta1.getAltura());
        System.out.println("\t* Area: " + recta1.getAzalera());
        System.out.println("\t* Perimetro: " + recta1.getPerimetroa());
        System.out.println("");
        System.out.println("Resto de puntos CALCULADOS/OBTENIDOS:");
        System.out.println("\tD" + recta1.getBottomLeft() + " , B" + recta1.getTopRight());
        System.out.println("");
        System.out.println("DIAGONALES: ");
        System.out.println("\tAC = " + recta1.getTopLeft().distance(recta1.getBottomRight()));
        System.out.println("\tDB = " + recta1.getBottomLeft().distance(recta1.getTopRight()));
        

    }
    
    
    public static void triangeluBatenDatuGuztiak() {
        
        MyPoint p1 = new MyPoint(2,2);
        MyPoint p2 = new MyPoint(3,3);
        MyPoint p3 = new MyPoint(4,4);
        MyTriangle t1 = new MyTriangle(p1, p2, p3);
        
        System.out.println(t1);
        
        System.out.printf("\tPerimetro = %.4f\n", t1.getPerimeter());
        System.out.println("\tTipo: " + t1.getType());
        System.out.println("");
        System.out.println("Distancia entre puntos: ");
        System.out.printf("\t* p1-tik p2-ra: %.4fko distantzia\n", p1.distance(p2));
        System.out.printf("\t* p2-tik p3-ra: %.4fko distantzia\n", p2.distance(p3));
        System.out.printf("\t* p1-tik p3-ra: %.4fko distantzia\n", p1.distance(p3));
        System.out.println("");
        System.out.println("Tipo de triangulo: " + t1.getType());
        
    }
    

}

