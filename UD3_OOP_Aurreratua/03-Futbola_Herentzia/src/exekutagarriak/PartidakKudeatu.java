/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.*;
import java.time.*; //import java.time.LocalDate;   //import java.time.Month;   //import java.util.Arrays;
import exekutagarriak.*;
import model.*;
import static exekutagarriak.EuskalSelekzioaMenua.azkenId;


/**
 *
 * @author arceredillo.adrian
 */
public class PartidakKudeatu {
    
    private static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<IntegranteSeleccion>();
    private static Partida[] partidaGuztiak = new Partida[20];
    private static Scanner in = new Scanner(System.in);
    
    //color del PRINT y BACKGROUND en la consola - https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
    //print
    public static final String ANSI_RED = "\u001B[3m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_WHITE = "\u001B[37m";
    //background
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    
    public static void main(String[] args) {
        
        //crear y ver toda la selección
        System.out.println("\nSELEKZIO OSOA IKUSI: \n");
        selekzioa = selekzioarenPlantillaOsoaSortu();   
        System.out.println(selekzioa);
        System.out.println("\n----------------------------\n");
        
        //(print contenido del array "partidaGuztiak")
        System.out.println("Array-a: \n");
        System.out.println(Arrays.toString(partidaGuztiak));
        System.out.println("\n----------------------------\n");
        
        //crear 5 partidas (con datos predefinidos) y visualizar sus datos
        partidakAsmatu();
        
        //partida nueva con DATOS METIDOS POR EL USUARIO
        partidaBatenDatuakEskatu();
        
        //calcular e imprimir estadísticas
        System.out.println("ESTATISTIKAK BISTARATU: ");
        estatistikakKalkulatu();
        
        
        //ver el contenido del array de las partidas jugadas ("partidaGuztiak[]")
        System.out.println(Arrays.toString(partidaGuztiak));
        
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
        selekzioa.add(new Futbolista(++azkenId, "Aihen", "Munoz", 24, 12, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Iago", "Herrerin", 34, 13, Demarkazioa.POR));
        selekzioa.add(new Futbolista(++azkenId, "Aritz", "Elustondo", 27, 14, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Jesus", "Areso", 22, 15, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Iñigo", "Vicente", 24, 16, Demarkazioa.DEL));
        selekzioa.add(new Futbolista(++azkenId, "Daniel", "Vivian", 22, 17, Demarkazioa.DEF));

        selekzioa.add(new Entrenador(++azkenId, "Francisco", "Padalino", 52, "Entrenador"));
        selekzioa.add(new Entrenador(++azkenId, "Joseba", "Nunez", 44, "Entrenador"));
        selekzioa.add(new Entrenador(++azkenId, "Markel", "Lautadahandi", 52, "Entrenador de porteros"));

        selekzioa.add(new Masajista(++azkenId, "Iñaki", "Sertxiberrieta", 36, "Fisioterapeuta", 9));
        selekzioa.add(new Masajista(++azkenId, "Ander", "Etxeburu", 51, "Medico", 20));
        

        //System.out.println("SELEKZIO OSOA SORTU: \n");
        
        return selekzioa;   //imprimir todo el contenido del arrayList "selekzioa"

    }
    
    
    /**
     * Antes de especificar qué jugadores (tipo Futbolista) recibirán una tarjeta, es necesario  filtrar, por tipo (clases), cada elemento 
     * del arrayList general ("selekzioa"). En este caso, tendremos que hacer una selección de todos los elementos que sean "Futbolista". 
     * 
     * Todos los elementos Futbolista de cada partida, se guardarán en un nuevo arrayList correspondiente a cada partida. Por último, se 
     * realizará una selección aleatoria de 2 jugadores de cada partida. Estos jugadores serán los amonestados. 
     * 
     * Una vez creadas las partidas, añadirlas al array de partidas ("partidaGuztiak[]")
     */
    public static void partidakAsmatu() {
        
        int numeroPartidasCreadas = 0;  //contador de partidas creadas
        
        //arrayList de tarjetas de todas las partidas (en este caso 5 partidas)
        ArrayList<Futbolista> txartelakPartida1 = new ArrayList<Futbolista>();   //jugadores amonestados (partida 1)
        ArrayList<Futbolista> txartelakPartida2 = new ArrayList<Futbolista>();   //jugadores amonestados (partida 2)
        ArrayList<Futbolista> txartelakPartida3 = new ArrayList<Futbolista>();   //jugadores amonestados (partida 3)
        ArrayList<Futbolista> txartelakPartida4 = new ArrayList<Futbolista>();   //jugadores amonestados (partida 4)
        ArrayList<Futbolista> txartelakPartida5 = new ArrayList<Futbolista>();   //jugadores amonestados (partida 5)
        ArrayList<Futbolista> txartelakPartida6 = new ArrayList<Futbolista>();   //jugadores amonestados (partida 6)
        
        //definir las fechas de las 5 partidas
        LocalDate data1 = LocalDate.of(2020, 1, 8); //fecha partida 1
        LocalDate data2 = LocalDate.of(2019, 6, 21); //fecha partida 2
        LocalDate data3 = LocalDate.of(2021, 7, 13); //fecha partida 3
        LocalDate data4 = LocalDate.of(1999, 10, 2); //fecha partida 4
        LocalDate data5 = LocalDate.of(1983, 4, 6); //fecha partida 5
        LocalDate data6 = LocalDate.of(9003, 10, 9); //fecha partida 5
        
        //definir los adversarios de las 5 partidas
        String aurkari1 = "FC Barcelona"; //adversario partida 1
        String aurkari2 = "SD Eibar"; //adversario partida 2
        String aurkari3 = "Real Sociedad"; //adversario partida 3
        String aurkari4 = "Man United"; //adversario partida 4
        String aurkari5 = "Borussia Dortmund"; //adversario partida 5
        String aurkari6 = "Tottenham Hotspur"; //adversario partida 6
        
        
        //arrayList de elementos de tipo Futbolista de cada partida
        ArrayList<Futbolista> jugadoresP1 = new ArrayList<Futbolista>();    //partida 1
        ArrayList<Futbolista> jugadoresP2 = new ArrayList<Futbolista>();    //partida 2
        ArrayList<Futbolista> jugadoresP3 = new ArrayList<Futbolista>();    //partida 3
        ArrayList<Futbolista> jugadoresP4 = new ArrayList<Futbolista>();    //partida 4
        ArrayList<Futbolista> jugadoresP5 = new ArrayList<Futbolista>();    //partida 5
        ArrayList<Futbolista> jugadoresP6 = new ArrayList<Futbolista>();    //partida 6
        
        
        //filtrar por elementos de tipo Futbolista, y guardarlos en un arrayList para esa partida
        for (int i = 0; i < selekzioa.size(); ++i) {
            if (selekzioa.get(i) != null) {
                if (selekzioa.get(i).getClass() == Futbolista.class) {
                    //guardar los elementos Futbolista en un arrayList para cada partida
                    jugadoresP1.add((Futbolista) selekzioa.get(i)); //partida 1
                    jugadoresP2.add((Futbolista) selekzioa.get(i)); //partida 2
                    jugadoresP3.add((Futbolista) selekzioa.get(i)); //partida 3
                    jugadoresP4.add((Futbolista) selekzioa.get(i)); //partida 4
                    jugadoresP5.add((Futbolista) selekzioa.get(i)); //partida 5
                    jugadoresP6.add((Futbolista) selekzioa.get(i)); //partida 6
                    
                    //break;    //en este caso, cuando llegue al "break", dejaría de añadir jugadores al arrayList
                }
            }
        }
        
        //ELEGIR jugadores con tarjeta - PARTIDA 1
        int p1Jugador1 = (int)(Math.random() * jugadoresP1.size()); //System.out.println(p1Jugador1);  System.out.println(selekzioa.get(p1Jugador1));
        int p1Jugador2 = (int)(Math.random() * jugadoresP1.size());  //System.out.println(p1Jugador2);  System.out.println(selekzioa.get(p1Jugador2));
        
        //ELEGIR jugadores con tarjeta - PARTIDA 2
        int p2Jugador1 = (int)(Math.random() * jugadoresP1.size()); //System.out.println(p2Jugador1);  System.out.println(selekzioa.get(p2Jugador1));
        int p2Jugador2 = (int)(Math.random() * jugadoresP1.size());  //System.out.println(p2Jugador2);  System.out.println(selekzioa.get(p2Jugador2));
        
        //ELEGIR jugadores con tarjeta - PARTIDA 3
        int p3Jugador1 = (int)(Math.random() * jugadoresP1.size()); //System.out.println(p3Jugador1);  System.out.println(selekzioa.get(p3Jugador1));
        int p3Jugador2 = (int)(Math.random() * jugadoresP1.size());  //System.out.println(p3Jugador2);  System.out.println(selekzioa.get(p3Jugador2));
        
        //ELEGIR jugadores con tarjeta - PARTIDA 4
        int p4Jugador1 = (int)(Math.random() * jugadoresP1.size()); //System.out.println(p4Jugador1);  System.out.println(selekzioa.get(p4Jugador1));
        int p4Jugador2 = (int)(Math.random() * jugadoresP1.size());  //System.out.println(p4Jugador2);  System.out.println(selekzioa.get(p4Jugador2));
        
        //ELEGIR jugadores con tarjeta - PARTIDA 5
        int p5Jugador1 = (int)(Math.random() * jugadoresP1.size()); //System.out.println(p5Jugador1);  System.out.println(selekzioa.get(p5Jugador1));
        int p5Jugador2 = (int)(Math.random() * jugadoresP1.size());  //System.out.println(p5Jugador2);  System.out.println(selekzioa.get(p5Jugador2));
        
        //ELEGIR jugadores con tarjeta - PARTIDA 6
        int p6Jugador1 = (int)(Math.random() * jugadoresP1.size()); //System.out.println(p6Jugador1);  System.out.println(selekzioa.get(p6Jugador1));
        int p6Jugador2 = (int)(Math.random() * jugadoresP1.size());  //System.out.println(p6Jugador2);  System.out.println(selekzioa.get(p6Jugador2));
        
        
        //AÑADIR jugadores al arrayList de tarjetas - PARTIDA 1
        txartelakPartida1.add((Futbolista) selekzioa.get(p1Jugador1));
        txartelakPartida1.add((Futbolista) selekzioa.get(p1Jugador2));
        
        //AÑADIR jugadores al arrayList de tarjetas - PARTIDA 2
        txartelakPartida2.add((Futbolista) selekzioa.get(p2Jugador1));
        txartelakPartida2.add((Futbolista) selekzioa.get(p2Jugador2));
        
        //AÑADIR jugadores al arrayList de tarjetas - PARTIDA 3
        txartelakPartida3.add((Futbolista) selekzioa.get(p3Jugador1));
        txartelakPartida3.add((Futbolista) selekzioa.get(p3Jugador2));
        
        //AÑADIR jugadores al arrayList de tarjetas - PARTIDA 4
        txartelakPartida4.add((Futbolista) selekzioa.get(p4Jugador1));
        txartelakPartida4.add((Futbolista) selekzioa.get(p4Jugador2));
        
        //AÑADIR jugadores al arrayList de tarjetas - PARTIDA 5
        txartelakPartida5.add((Futbolista) selekzioa.get(p5Jugador1));
        txartelakPartida5.add((Futbolista) selekzioa.get(p5Jugador2));
        
        //AÑADIR jugadores al arrayList de tarjetas - PARTIDA 6
        txartelakPartida6.add((Futbolista) selekzioa.get(p6Jugador1));
        txartelakPartida6.add((Futbolista) selekzioa.get(p6Jugador2));
        
        
        //CREAR LAS PARTIDAS (+ print partidas)
        Partida p1 = new Partida(data1, aurkari1, txartelakPartida1);   //System.out.println("Partida 1:\n\n" + p1 + "\n----------------");
        Partida p2 = new Partida(data2, aurkari2, txartelakPartida2);   //System.out.println("Partida 2:\n\n" + p2 + "\n----------------");
        Partida p3 = new Partida(data3, aurkari3, txartelakPartida3);   //System.out.println("Partida 3:\n\n" + p3 + "\n----------------");
        Partida p4 = new Partida(data4, aurkari4, txartelakPartida4);   //System.out.println("Partida 4:\n\n" + p4 + "\n----------------");
        Partida p5 = new Partida(data5, aurkari5, txartelakPartida5);   //System.out.println("Partida 5:\n\n" + p5 + "\n----------------\n");
        Partida p6 = new Partida(data6, aurkari6, txartelakPartida6);   //System.out.println("Partida 6:\n\n" + p5 + "\n----------------\n");
        
        
        //imprimir datos de las partidas (con COLORES)
        System.out.println(ANSI_PURPLE_BACKGROUND + "Partida 1:" + ANSI_RED + "\n\n" + p1 + "\n----------------");
        System.out.println(ANSI_PURPLE_BACKGROUND + "Partida 2:" + ANSI_RED + "\n\n" + p2 + "\n----------------");
        System.out.println(ANSI_PURPLE_BACKGROUND + "Partida 3:" + ANSI_RED + "\n\n" + p3 + "\n----------------");
        System.out.println(ANSI_PURPLE_BACKGROUND + "Partida 4:" + ANSI_RED + "\n\n" + p4 + "\n----------------");
        System.out.println(ANSI_PURPLE_BACKGROUND + "Partida 5:" + ANSI_RED + "\n\n" + p5 + "\n----------------");
        System.out.println(ANSI_PURPLE_BACKGROUND + "Partida 6:" + ANSI_RED + "\n\n" + p6 + "\n----------------");
        
        
        //añadir las partidas creadas al array de partidas ("partidaGuztiak[]")
        partidaGuztiak[0] = p1; partidaGuztiak[1] = p2; 
        partidaGuztiak[2] = p3; partidaGuztiak[3] = p4; 
        partidaGuztiak[4] = p5; partidaGuztiak[5] = p6; 
         
        
        
    }
    
    
    /**
     * Método que pedirá al usuario que ingrese los datos necesarios para poder crear 
     * una nueva partida (tipo Partida). Para ello, tendrá que introducir los siguientes
     * valores:
     * 
     *  -> data (LocalDate)
     *  -> aurkaria (String)
     *  -> txartelak (ArrayList<Futbolista>)
     * 
     * En el caso del arrayList con los jugadores, se le pedirá al usuario que introduzca 
     * los datos necesarios para crear un nuevo jugador (tipo Futbolista). Este jugador, 
     * se almacenará en un nuevo arrayList. 
     * 
     */
    public static void partidaBatenDatuakEskatu() {
        System.out.println("Sartu partida berri baten datuak: \n");
        //registrar entrada (DATA) del usuario 
        System.out.println("\t\tPartidaren data ('yyyy-mm-dd'): ");
        System.out.print("\t\t-> ");
        
        String userData = in.next();  System.out.println("");
        LocalDate partidarenData = LocalDate.parse(userData);  //convertir el dato del usuario (String) en LocalDate
        
        
        //registrar entrada (AURKARIA) del usuario 
        System.out.println("\t\tZein da/zen aurkaria: ");
        System.out.print("\t\t-> ");
        String aurkariaSartuUser = in.next(); System.out.println("");
        String aurkariaUser = aurkariaSartuUser.substring(0, 1).toUpperCase() + aurkariaSartuUser.substring(1).toLowerCase();
        
        
        //registrar datos del usuario sobre el Futbolista(id, nombre, apellido, edad, dorsal, demarcación)
        System.out.println("\t\tTxartela jaso duen jokalari baten datuak:");
        System.out.print("\t\t\tId-a: ");
        int futIdUser = in.nextInt();   //id
        
        System.out.print("\t\t\tIzena: ");
        String nombreSartuUser = in.next();   //nombre
        String futNombreUser = aurkariaSartuUser.substring(0, 1).toUpperCase() + aurkariaSartuUser.substring(1).toLowerCase();
        
        System.out.print("\t\t\tAbizena (espazio gabe): ");
        String apellidoSartuUser = in.next();   //apellido
        String futApellidoUser = aurkariaSartuUser.substring(0, 1).toUpperCase() + aurkariaSartuUser.substring(1).toLowerCase();
        
        System.out.print("\t\t\tAdina: ");
        int futEdadUser = in.nextInt();   //edad
        
        System.out.print("\t\t\tDorsal: ");
        int futDorsalUser = in.nextInt();   //dorsal
        
        System.out.print("\t\t\tDemarkazioa (POR/DEF/MED/DEL): ");
        String demarcacionUser = in.next().toUpperCase();   //demarcación
        
        
        
        //arrayList que almacenará el jugador (Futbolista) que cree el usuario
        ArrayList<Futbolista> amonestadosUser = new ArrayList<Futbolista>();
        
        /*relacionar la demarcación (entrada) con el archivo de tipo Enum (Demarkazioa.java) + guardar en 
        un nuevo arrayList (jugadores con tarjeta)*/        
        if (demarcacionUser.equals("POR")) {
            Futbolista f1 = new Futbolista(futIdUser, futNombreUser, futApellidoUser, futEdadUser, futDorsalUser, Demarkazioa.POR);    //crear Futbolista
            amonestadosUser.add(f1);    //añadirlo al arrayList
        } else if (demarcacionUser.equals("DEF")) {
            Futbolista f1 = new Futbolista(futIdUser, futNombreUser, futApellidoUser, futEdadUser, futDorsalUser, Demarkazioa.DEF); //crear Futbolista
            amonestadosUser.add(f1);    //añadirlo al arrayList
        } else if (demarcacionUser.equals("MED")) {
            Futbolista f1 = new Futbolista(futIdUser, futNombreUser, futApellidoUser, futEdadUser, futDorsalUser, Demarkazioa.MED); //crear Futbolista
            amonestadosUser.add(f1);    //añadirlo al arrayList
        } else if (demarcacionUser.equals("DEL")) {
            Futbolista f1 = new Futbolista(futIdUser, futNombreUser, futApellidoUser, futEdadUser, futDorsalUser, Demarkazioa.DEL); //crear Futbolista
            amonestadosUser.add(f1);    //añadirlo al arrayList
        }
        
        
        
        //CREAR LA PARTIDA (+ print datos)
        Partida p1 = new Partida(partidarenData, aurkariaUser, amonestadosUser);
        System.out.println("--------------------------------");
        System.out.println(ANSI_BLUE_BACKGROUND + "Sorturiko partida:" + ANSI_BLACK + "\n\n" + p1 + "\n----------------");
        
        
        //GUARDAR la partida creada en el ARRAY - "Partida[] partidak";
        for (int i = 0; i < partidaGuztiak.length; ++i) {
            if (partidaGuztiak[i] == null) {
                partidaGuztiak[i] = p1;
                break;
            }
        }
        
    }
    
    
    
    public static void estatistikakKalkulatu() {
        System.out.println("");
        
        //número de partidas jugadas
        int partidasJugadas = 0;
        for (int i = 0; i < partidaGuztiak.length; ++i) {
            if (partidaGuztiak[i] != null) {
                ++partidasJugadas;
            }
        }
        System.out.println("\t-> Jokatutako partida kopurua: " + partidasJugadas); 
        
        
        System.out.println("");
        System.out.println("----------------");
    }
    
}


/*
Info internet:
https://mkyong.com/java8/java-8-how-to-convert-string-to-localdate/

*/