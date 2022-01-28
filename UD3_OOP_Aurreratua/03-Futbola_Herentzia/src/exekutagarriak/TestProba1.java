/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;
import java.time.LocalDate;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author arceredillo.adrian
 */
public class TestProba1 {
    public static void main(String[] args) {
        
        //crear un objeto de tipo FUTBOLISTA
        System.out.println("FUTBOLISTA: ");
        Futbolista f1 = new Futbolista(1, "Adrian", "Arceredillo", 23, 10, Demarkazioa.DEF);
        Futbolista f2 = new Futbolista(1, "Alejandro", "Arceredillo", 23, 10, Demarkazioa.DEF);
        System.out.println(f1.toString());
        System.out.println("--------------------");
        
        //crear un objeto de tipo ENTRENADOR
        
        
        
        
        //crear un objeto de tipo MASAJISTA
        
        
        
        //crear un objeto de tipo PARTIDA
        System.out.println("PARTIDA: \n");
        
        LocalDate data1 = LocalDate.of(2020, 1, 8); //fecha partida
        String aurkari1 = "FC Barcelona"; //adversario partida
        
        ArrayList<Futbolista> jugadoresAmonestados = new ArrayList<Futbolista>();   //arrayList de jugadores amonestados
        //añadir jugadores al arrayList
        jugadoresAmonestados.add(f1);
        jugadoresAmonestados.add(f2);
        //System.out.println(jugadoresAmonestados);   //ver contenido del arrayList
        
        Partida p1 = new Partida(data1, aurkari1, jugadoresAmonestados);    //creación de la partida
        System.out.println(p1);
        
        
        
    }
}
