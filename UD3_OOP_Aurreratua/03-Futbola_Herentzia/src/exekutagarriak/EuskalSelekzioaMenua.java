package exekutagarriak;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.*;
import exekutagarriak.*;
import java.util.*;


/** Programa honetan Euskal Selekzioaren datuekin egingo dugu lan.
 *  Iturria: https://es.wikipedia.org/wiki/Selecci%C3%B3n_de_f%C3%BAtbol_de_Euskadi#Plantilla
 *
 *  Programa hau selekzioko partaideen datuak kargatzen hasiko da. 
 *  Normalena da, datu hauek fitxategi edo datu-base batetik irakurtzea baina 
 *  oraindik hori ez dakigunez egiten guk programan bertan, metodo baten barruan idatziko ditugu.
 * 
 *  Gero, horrelako menu bat agertuko zaigu:
 * 
 *  **********************************************************
 *  *    EUSKAL SELEKZIOA
 *  *  ----------------------------------
 *  *  1. Partaideen datuak ikusi (Goiburuko egoki eta laburpen azken lerro batekin (Futbolistak: 23 Entren...)
 *  *  2. Partaideen datuak ikusi taldekatuta
 *  *  3. Futbolariak alfabetikoki inprimatu
 *  *  4. Aldaketa ( Sartu zaitez zu beste partaide baten ordez. Horretarako ArrayList-en set metodoa erabiliz)
 *  *  5. Bilatu abizenetik (String-en startsWith() metodoa erabiliz adibidez)
 *  *  z. Irten
 * 
 *  *  Aukeratu zenbaki bat:
 * 
 *  **************************************************************
 */
public class EuskalSelekzioaMenua {
    
    public static int azkenId = 0; 
    public static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<>(); 
       
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        selekzioa = selekzioarenPlantillaOsoaSortu();
        //System.out.println(selekzioa);
        
        
        int aukera = 0; //variable que recogerá la elección del menú del usuario 
        boolean aukeraEgokia = false;
        
        do {
            System.out.println();
            System.out.println("**********************************************************");
            System.out.println("\tEUSKAL SELEKZIOA");
            System.out.println("----------------------------------");
            System.out.println("1. Partaideen datuak ikusi (Goiburuko egoki eta laburpen azken lerro batekin (Futbolistak: 23 Entren...) ");
            System.out.println("2. Partaideen datuak ikusi taldekatuta ");
            System.out.println("3. Futbolariak alfabetikoki inprimatu ");
            System.out.println("4. Aldaketa (Sartu zaitez zu beste partaide baten ordez. Horretarako ArrayList-en set metodoa erabiliz) ");
            System.out.println("5. Bilatu abizenetik (String-en startsWith() metodoa erabiliz adibidez) ");
            System.out.println("z. Irten ");
            System.out.println("");

            do {
                aukeraEgokia = false;
                try {
                    //System.out.print("Zenbatgarren zenbakia ikusi nahi duzu? ");
                    System.out.print("Aukeratu zenbaki bat: ");
                    aukera = sc.nextInt();
                    System.out.println("");
                    aukeraEgokia = true;
                } catch (InputMismatchException ex) {
                    System.out.println(" -> Kontuz!! Zenbaki bat sartu behar duzu.");
                    sc.next(); //scannerrean geratu dan elementua hustuteko
                }
            } while(!aukeraEgokia);
            
            /*System.out.print("Aukeratu zenbaki bat: ");
            aukera = sc.nextInt();
            System.out.println("");*/  
            //Scanner in = new Scanner(System.in);

            switch (aukera) {
                case 1:
                    partaideenDatuakIkusi();
                    //System.out.println(selekzioa);
                    break;
                case 2:
                    partaideakTaldekatuta();
                    //System.out.println(selekzioa);
                    break;
                /*case 2:
                    liburuenDatuGuztiakIkusi();
                    break;
                case 3:
                    liburuenPrezioaIrudikatu();
                    break;
                case 4:
                    zaharrenaBilatu();
                    break;
                case 5:
                    crearNuevoLibro();
                    break;
                case 6:
                    System.out.print("Sartu nahi duzun liburuaren izenburua: ");
                    String tituloDelLibro = in.nextLine();
                    System.out.println("Eskaturiko liburuak, " + liburuBatenUrteak(tituloDelLibro) + " urte ditu. ");
                    break;
                case 7:
                    System.out.print("Sartu egilearen izena: ");
                    String nombreEscritor = in.nextLine();
                    //System.out.println(bilatuLiburuBat(nombreEscritor));
                    bilatuLiburuBat(nombreEscritor);
                    break;
                case 8:
                    System.out.print("Sartu ezabatu nahi duzun liburuaren izenburua: ");
                    String izenburuaDelLibro = in.nextLine();
                    liburuBatEzabatu(izenburuaDelLibro);
                    break;*/
                case 10:
                    System.out.println("Eskerrik asko programa hau erabiltzearren.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
        } while (aukera != 10);
        
                
    }
        
    /**
     * Este método se ha creado para introducir datos en el arrayList definido 
     * en la parte superior de esta clase, y para PODER LLAMAR a este arrayList, 
     * y a su contenido, DESDE OTRA CLASE.
     * 
     * Para ello, el tipo del método dejará de ser "void", y será del siguiente 
     * tipo: 
     *  -> public static ArrayList<objeto> + nombre()
     * 
     * Selekzio osoaren datuak gorde "selekzioa" deitutako IntegranteSeleccion
     * klaseko ArrayList estatiko baten.
     *
     */
    
    public static ArrayList<IntegranteSeleccion> selekzioarenPlantillaOsoaSortu() {
        //ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<IntegranteSeleccion>();

        selekzioa.add(new Futbolista(++azkenId, "Aitor", "Fernandez", 30, 1, Demarkazioa.POR));
        selekzioa.add(new Futbolista(++azkenId, "Unai", "Bustinza", 29, 2, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Mikel", "Balenziaga", 33, 3, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Asier", "Illarramendi", 31, 4, Demarkazioa.MED));
        selekzioa.add(new Futbolista(++azkenId, "Iñigo", "Martinez", 30, 5, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Mikel", "San Jose", 32, 6, Demarkazioa.MED));
        selekzioa.add(new Futbolista(++azkenId, "Gaizka", "Larrazabal", 24, 7, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Manu", "Garcia", 35, 8, Demarkazioa.MED));
        selekzioa.add(new Futbolista(++azkenId, "Aritz", "Aduriz", 40, 9, Demarkazioa.DEL));
        selekzioa.add(new Futbolista(++azkenId, "Javier", "Eraso", 31, 10, Demarkazioa.MED));
        selekzioa.add(new Futbolista(++azkenId, "Asier", "Villalibre", 24, 11, Demarkazioa.DEL));
        selekzioa.add(new Futbolista(++azkenId, "Aihen", "Muñoz", 24, 12, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Iago", "Herrerin", 34, 13, Demarkazioa.POR));
        selekzioa.add(new Futbolista(++azkenId, "Aritz", "Elustondo", 27, 14, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Jesus", "Areso", 22, 15, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Iñigo", "Vicente", 24, 16, Demarkazioa.DEL));
        selekzioa.add(new Futbolista(++azkenId, "Daniel", "Vivian", 22, 17, Demarkazioa.DEF));

        selekzioa.add(new Entrenador(++azkenId, "Francisco", "Padalino", 52, "Entrenador"));
        selekzioa.add(new Entrenador(++azkenId, "Joseba", "Nuñez", 44, "Entrenador"));
        selekzioa.add(new Entrenador(++azkenId, "Markel", "Lautadahandi", 52, "Entrenador de porteros"));

        selekzioa.add(new Masajista(++azkenId, "Iñaki", "Sertxiberrieta", 36, "Fisioterapeuta", 9));
        selekzioa.add(new Masajista(++azkenId, "Ander", "Etxeburu", 51, "Medico", 20));
        

        System.out.println("SELEKZIO OSOA SORTU: \n");
        
        return selekzioa;   //imprimir todo el contenido del arrayList "selekzioa"

    }
    
    /**
     * Este método nos permite filtrar a nuestro gusto, todos los elementos/objetos que 
     * se encuentren dentro del arrayList "selekzioa". El filtro puede ser tanto en 
     * función de valores especificos de cualquiera de los atributos de las clases, o 
     * también dependiendo del tipo de objeto/elemento se trate; 
     * 
     * En este caso, debemos filtrar los elementos del arrayList en según el tipo de 
     * estos; es decir, separar los elementos Futbolista, Entrenador y Masajista.
     * 
     */
    public static void partaideakTaldekatuta() {
        System.out.println("Futbolariak: \n");
        for (int i = 0; i < selekzioa.size(); ++i) {
            if (selekzioa.get(i) != null) {
                if (selekzioa.get(i).getClass() == Futbolista.class) {
                    //selekzioa.remove(i);
                    System.out.println(selekzioa.get(i));
                }
            }
        }
        System.out.println("Entrenatzaileak: \n");
        for (int i = 0; i < selekzioa.size(); ++i) {
            if (selekzioa.get(i) != null) {
                if (selekzioa.get(i).getClass() == Entrenador.class) {
                    //selekzioa.remove(i);
                    System.out.println(selekzioa.get(i));
                }
            }
        }
        System.out.println("Masajistak: \n");
        for (int i = 0; i < selekzioa.size(); ++i) {
            if (selekzioa.get(i) != null) {
                if (selekzioa.get(i).getClass() == Masajista.class) {
                    //selekzioa.remove(i);
                    System.out.println(selekzioa.get(i));
                }
            }
        }
    }
    
    
    /**
     * Método para imprimir todo el contenido de los objetos que se encuentren 
     * en el interior del arrayList "selekzioa".
     */
    public static void partaideenDatuakIkusi() {
        System.out.println("Uneko Plantilla: \n");
        for (int i = 0; i < selekzioa.size(); ++i) {
            if (selekzioa.get(i) != null) {
                System.out.println(selekzioa.get(i));
            }
        }
        System.out.println("----------------------------");
    }
    
    
    
    /*public static Futbolista futbolistakAlfabetikoki() {
        
    }*/

    
    
}

/*
http://puntocomnoesunlenguaje.blogspot.com/2013/02/arraylist-de-objetos-en-java.html
*/