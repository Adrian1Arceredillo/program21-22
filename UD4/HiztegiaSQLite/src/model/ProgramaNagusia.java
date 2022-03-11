package model;


import model.SQLiteKudeatu;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class ProgramaNagusia {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int aukera = 0;
        
        do {
            System.out.println("PROGRAMA NAGUSIA: ");
            System.out.println("============================");
            System.out.println("1.- Terminoak imprimatu ");
            System.out.println("2.- Termino bat gehitu ");
            System.out.println("3.- Termino bat ezabatu ");
            System.out.println("4.- Termino bat aldatu ");
            System.out.println("5.- Irten ");
            System.out.println("----------------------------");
            System.out.print("Zer egin nahi duzu? (1-5): ");
            
            aukera = in.nextInt();
            
            SQLiteKudeatu sqlKud = new SQLiteKudeatu();
            
            switch (aukera) {
                case 1:
                    sqlKud.terminoakImprimatu();
                    break;
                case 2:
                    sqlKud.terminoaGehitu("gehitu","sumar");
                    sqlKud.terminoakImprimatu();
                    break;
                case 3:
                    System.out.print("Adierazi ezabatuko den terminoaren id-a: ");
                    int idEzabatu = in.nextInt();
                    sqlKud.terminoaEzabatu(idEzabatu);
                    sqlKud.terminoakImprimatu();
                    break;
                case 4:
                    System.out.print("Adierazi aldatu nahi duzun terminoaren id-a: ");
                    int idAldatu = in.nextInt();
                    System.out.print("Hitz berria euskaraz: " + in.next()); 
                    System.out.print("Hitz berria gazteleraz: " + in.next()); 
                    String newGazteleraz = in.next();
                    sqlKud.terminoaAldatu(2, "gerezia", "cereza");
            }

            
        } while(aukera != 5);
        
        
        //hacer un menú con todas las opciones
        
        //imprimir datos
        SQLiteKudeatu sqlKud = new SQLiteKudeatu();
        //sqlKud.terminoakImprimatu(); - done
        
        //añadir registro/datos
        //sqlKud.terminoaGehitu("gehitu","sumar"); - done
        //sqlKud.terminoakImprimatu(); - done
        
        //eliminar un término/registro/dato
        //sqlKud.terminoaEzabatu(37);
        //sqlKud.terminoakImprimatu();
        
        //actualizar valores/datos
        /*
        sqlKud.terminoaAldatu(2, "gerezia", "cereza");
        System.out.println("----------------");
        sqlKud.terminoakImprimatu();
        */
        
        
        
    }
}


//pkg1 -> controller, model, prog nagusia, terminoa, view-form                 
//model -> sqlkudeatu / programa nagusia NO