/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author arceredillo.adrian
 */
public class LaukiBatSortu {
    public static void main(String[] args) {
        
        int zabalScan;
        int altuScan;
        
                
        Laukia la4 = new Laukia();  //crear el cuadrado
        
        Scanner in = new Scanner(System.in);
        System.out.print("Sartu laukiaren zabalera: ");
        la4.setZabalera(in.nextInt());   //especificar la anchura deseada y guardar el dato como la nueva anchura
        
        System.out.print("Sartu laukiaren altuera: ");
        la4.setAltuera(in.nextInt());    //especificar la altura deseada y guardar el dato como la nueva altura
        
        
        //la4.setZabalera(zabalScan); //cambiar la ANCHURA original por la registrada en el scanner
        //la4.setAltuera(altuScan); //cambiar la ALTURA original por la registrada en el scanner
        
        
        //decir de qué tipo es (horizontal, vertical o cuadrado)
        //mostrar el objeto con las nuevas dimensiones
        System.out.println(la4.getMota() + " => " + la4.toString());
                
        //dibujar el objeto relleno, mediante el método marraztuBeteta() 
        System.out.println("Hona marrazkia beteta: ");
        la4.marraztuBeteta();
        
        //dibujar el objeto vacío, mediante el método marraztuHutsik()
        System.out.println("Hona marrazkia hutsik: ");
        la4.marraztuHutsik();
        
    }
}

/*
Ejer 4 (moodle)
Garatu LaukiBatSortu programa. Erabiltzaileari lauki baten datuak eskatuko dizkio eta eratutako laukia zein 
motatakoa de erantzungo dio. Eta gero laukia marraztuko du, beteta eta hutsik. Adibidez:
*/

/*
for (int row = 1; row <= la4.getAltuera(); ++row) {
            for (int col = 1; col <= la4.getZabalera(); ++col) {
                System.out.print("* ");
            }
            System.out.println();
        }
*/