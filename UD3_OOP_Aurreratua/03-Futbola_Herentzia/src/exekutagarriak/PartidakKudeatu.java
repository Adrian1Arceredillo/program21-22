/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.ArrayList;
import exekutagarriak.*;
import model.*;
import static exekutagarriak.EuskalSelekzioaMenua.azkenId;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

/**
 *
 * @author arceredillo.adrian
 */
public class PartidakKudeatu {
    
    private static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<IntegranteSeleccion>();
    private static Partida[] partidak;
    
    
    public static void main(String[] args) {
        
        System.out.println("PARTIDAK: \n");
        selekzioa = selekzioarenPlantillaOsoaSortu();
        
        System.out.println(selekzioa);
        System.out.println("\n------------\n");
        Partida[] partidaGuztiak = new Partida[20];
        System.out.println(Arrays.toString(partidaGuztiak));
        
        
        partidakAsmatu();
        
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
    
    
    public static void partidakAsmatu() {
        
        int numeroPartidasCreadas = 0;  //contador de partidas creadas
        
        //arrayList de tarjetas de todas las partidas (en este caso 5 partidas)
        ArrayList<Futbolista> txartelakPartida1 = new ArrayList<Futbolista>();   //arrayList que contendrá los jugadores amonestados (partida 1)
        ArrayList<Futbolista> txartelakPartida2 = new ArrayList<Futbolista>();   //arrayList que contendrá los jugadores amonestados (partida 2)
        ArrayList<Futbolista> txartelakPartida3 = new ArrayList<Futbolista>();   //arrayList que contendrá los jugadores amonestados (partida 3)
        ArrayList<Futbolista> txartelakPartida4 = new ArrayList<Futbolista>();   //arrayList que contendrá los jugadores amonestados (partida 4)
        ArrayList<Futbolista> txartelakPartida5 = new ArrayList<Futbolista>();   //arrayList que contendrá los jugadores amonestados (partida 5)
        
        //definir las fechas de las 5 partidas
        LocalDate data1 = LocalDate.of(2020, 1, 8); //fecha partida 1
        LocalDate data2 = LocalDate.of(2019, 6, 21); //fecha partida 2
        LocalDate data3 = LocalDate.of(2021, 7, 13); //fecha partida 3
        LocalDate data4 = LocalDate.of(1999, 10, 2); //fecha partida 4
        LocalDate data5 = LocalDate.of(1983, 4, 6); //fecha partida 5
        
        //definir los adversarios de las 5 partidas
        String aurkari1 = "FC Barcelona"; //adversario partida 1
        String aurkari2 = "SD Eibar"; //adversario partida 2
        String aurkari3 = "Real Sociedad"; //adversario partida 3
        String aurkari4 = "Man United"; //adversario partida 4
        String aurkari5 = "Borrusia Dortmund"; //adversario partida 5
        
        //jugador 1 pa1
        Futbolista f1 = new Futbolista();
        int futRandomP1 = (int) (Math.random() * selekzioa.size()) + 1;
        //int futRandomP2 = (int) (Math.random() * selekzioa.size()) + 1;
        
        //obtener 5 futbolistas random que recibirán tarjeta
        for (int i = 0; i < selekzioa.size(); ++i) {
            if (selekzioa.get(i) != null) {
                if (selekzioa.get(i).getClass() == Futbolista.class) {
                    f1 = (Futbolista) selekzioa.get(futRandomP1);  //System.out.println(f1);
                    //Futbolista f2 = (Futbolista) selekzioa.get(futRandomP2);  //System.out.println(f2);
                    
                    
                    //añadir estos jugadores al arrayList de amonestados
                    txartelakPartida1.add(f1);
                    break;
                }
            }
        }
        //System.out.println(txartelakPartida1);   //ver contenido del arrayList
        
        Partida p1 = new Partida(data1, aurkari1, txartelakPartida1);
        System.out.println(p1.toString());
        
        
        
        
        //creación de partidas
        
        
        //Partida p1 = new(data1, aurkari1, f1);
        
        //partidak[0] = (Partida) f1;
        
        /*
        for (int i = 0; i < selekzioa.size() && numeroPartidasCreadas < 5; ++i, ++numeroPartidasCreadas) {
            if (selekzioa.get(i) != null) {
                partidaGuztiak[i] = new Partida(data1, aurkari1, selekzioa.get(jugadorRandom));
                Partida pa1 = new Partida
            }
        }
        */
    }
    
    
}
