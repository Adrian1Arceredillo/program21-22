package exekutagarriak;

import model.*;
import java.util.*;

/**
 * Programa honetan Euskal Selekzioko datuekin egingo dugu lan. Iturria:
 * https://es.wikipedia.org/wiki/Selecci%C3%B3n_de_f%C3%BAtbol_de_Euskadi#Plantilla
 *
 *
 *
 */
public class EuskalSelekzioa {

    public static int azkenId = 0;
    private static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<IntegranteSeleccion>();

    /**
     * Programa honek metodo desberdinei deituko die banan banan. Beharbada ez
     * diozu koherentzia handirik topatuko programa osoari. Ariketaren helburua
     * da beste pakete bateko klase hierarkia erabiltzen trebatzea.
     *
     */
    public static void main(String[] args) {

        futbolariBat();
        bestePartaideBatzukSortu();
        selekzioOsoaSortu();
        int ezabatzekoIda = 40;
        if (partaideaEzabatu(ezabatzekoIda)) {
            System.out.println(ezabatzekoIda + " id-a duen partaidea ezabatu da.");
        }
    }

    /**
     * Metodo honek "Asier Villalibre"ri dagokion Futbolista objektua sortu eta
     * formatu honetan inprimatzen du: "Futbolista{id=1, nombre=Asier,
     * apellidos=Villalibre, edad=23, dorsal=11, demarcacion=DEL}" Hori lortzeko
     * Futbolista klasean toString() metodoa birdefinitu beharko duzu. Gainera,
     * Web orrian id-rik ez dagoenez, automatikoki kalkulatzea erabaki dugu.
     * Horretarako, kontadore bat (Adibidez, azkenIda izeneko klase atributu
     * bat) erabili dezakezu partaide bat sortzen den bakoitzean handituko dena.
     * Amaitzeko, Villalibre entrenatzen hasiko da.
     */
    public static void futbolariBat() {
        //crear un objeto Futbolista
        System.out.println("Futbolista objetu bat sortu: \n");
        Futbolista fut1 = new Futbolista(++azkenId, "Asier", "Villalibre", 23, 11, Demarkazioa.DEL);
        System.out.println(fut1.toString());

        //"amaitzeko, Villalibre entrenatzen hasiko da."
        Entrenador ent1 = new Entrenador(fut1.getId(), fut1.getNombre(), fut1.getApellidos(), fut1.getEdad(), "Entrenador");
        System.out.println("Amaieran, Villalibre entrenatzen hasiko da: \n");
        System.out.println(ent1);
        System.out.println("----------------------------");

    }

    /**
     * Metodo honek hiru objektu berri sortuko ditu. Pertsona hauei dagokienak:
     * - Javier Clemente - Iñaki Sertxiberrieta - Ander Etxeburu Zein klaseko
     * objektua izan behar du bakoitzak?
     *
     * Objektu bakoitza sortu ondoren, bere datuak inprimatu eta kontzentratu
     * eta bidaiatuko dute
     */
    public static void bestePartaideBatzukSortu() {

        //Javier Clemente - Futbolista tipokoa den objektua sortu
        Entrenador fut1 = new Entrenador(1, "Javier", "Clemente", 26, "Entrenadores");
        System.out.println("Partaideak sortu (Javier Clemente): ");
        System.out.println(fut1);

        //Iñaki Sertxiberrieta - Masajista tipokoa den objektua sortu
        Masajista mas1 = new Masajista(1, "Iñaki", "Sertxiberrieta", 36, "Fisioterapeuta", 9);
        System.out.println("Partaideak sortu (Iñaki Sertxiberrieta): ");
        System.out.println(mas1);
        //Ander Etxeburu - Masajista tipokoa den objektua sortu
        Masajista mas2 = new Masajista(2, "Ander", "Etxeburu", 51, "Medico", 20);
        System.out.println("Partaideak sortu (Ander Etxaburu): ");
        System.out.println(mas2);
    }

    /**
     * Selekzio osoaren datuak gorde "selekzioa" deitutako IntegranteSeleccion
     * klaseko ArrayList estatiko baten.
     *
     */
    public static void selekzioOsoaSortu() {
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

        System.out.println("----------------------------");

        System.out.println("Plantilla Completa: \n");
        for (int i = 0; i < selekzioa.size(); ++i) {
            if (selekzioa.get(i) != null) {
                System.out.println(selekzioa.get(i));
                //System.out.println(liburuak[i].getIzenburua() + "(" + liburuak[i].getEgilea() + ")");
            }
        }
        System.out.println("----------------------------");

    }

    /**
     * ArrayListetik objektu bat ezabatzen du. Aurkitzen ez badu false itzuliko
     * du
     *
     * @param id Ezabatu nahi den partaidearen ida
     * @return
     */
    public static boolean partaideaEzabatu(int ida) {

        for (int i = 0; i < selekzioa.size(); ++i) {
            if (selekzioa.get(i) != null) {
                if (selekzioa.get(i).getEdad() == ida) {
                    System.out.println(selekzioa.get(i));
                    selekzioa.remove(i);
                } else {
                    return false;
                }
            }
        }

        System.out.println("----------------------------");

        System.out.println("Plantilla Completa: \n");
        for (int i = 0; i < selekzioa.size(); ++i) {
            if (selekzioa.get(i) != null) {
                System.out.println(selekzioa.get(i));
                //System.out.println(liburuak[i].getIzenburua() + "(" + liburuak[i].getEgilea() + ")");
            }
        }
        System.out.println("----------------------------");

        return false;
    }

}
