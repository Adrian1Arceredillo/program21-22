/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

import java.util.ArrayList;
import java.util.Scanner;
import model.Langilea;
import model.Zatikia;

/**
 *
 * @author arceredillo.adrian
 */
public class LangileenArrayListaKudeatu {

    public static void main(String[] args) {
        
        /*Ejer 12 - Irakurri ArrayListen inguruko informazioa eta 
        LangileenArrayListaKudeatu klasea sortu. Hasieran 10 langileko 
        arraylista sortuko du eta gero erabiltzaileari datuak gehitu 
        eta ezabatzeko aukera emango dio. */
        
        
        
        ArrayList<Langilea> hamarLangile = new ArrayList<Langilea>();
        //añadir elementos al ArrayList
        hamarLangile.add(new Langilea(0, "Adri", "Prueba1", 20, "2021-10-08"));
        hamarLangile.add(new Langilea(1, "Juan", "Prueba2", 20, "2021-10-08"));
        hamarLangile.add(new Langilea(2, "Pedro", "Prueba3", 20, "2021-09-08"));
        hamarLangile.add(new Langilea(3, "Miren", "Prueba4", 20, "2021-10-08"));
        hamarLangile.add(new Langilea(4, "Irene", "Prueba5", 20, "2021-10-08"));
        hamarLangile.add(new Langilea(5, "Jorge", "Prueba6", 20, "2021-10-02"));
        hamarLangile.add(new Langilea(6, "Rosie", "Prueba7", 20, "2021-10-08"));
        hamarLangile.add(new Langilea(7, "Julen", "Prueba8", 20, "2021-12-08"));
        hamarLangile.add(new Langilea(8, "Javier", "Murillo", 20, "2021-06-18"));
        hamarLangile.add(new Langilea(9, "elemento", "Prueba9", 20, "2021-10-08"));

        System.out.println(hamarLangile);

        Object[] array = hamarLangile.toArray();
                
        //pedir al usuario que sume datos (crear un nuevo langile)
        Scanner in = new Scanner(System.in);
        System.out.println("Sartu langile berri baten datuak: ");
        System.out.print("izena = ");
        String nuevoIzena = in.next();
        System.out.print("abizena = ");
        String nuevoAbizena = in.next();
        System.out.print("soldata = ");
        double nuevoSoldata = in.nextDouble();
        System.out.print("data (primer día en la empresa) = ");
        String fechaIncorporacion = in.next();
        
        //saber cuál es el id del último elemennto, para que el id del langile que acabamos de crear, vaya a continuación del último del arrayList
        Langilea ultElemento = hamarLangile.get(hamarLangile.size() - 1);
        int idUltimo = ultElemento.getId();       
        
        hamarLangile.add(new Langilea(idUltimo, nuevoIzena, nuevoAbizena, nuevoSoldata, fechaIncorporacion));
        System.out.println("");
        System.out.println(hamarLangile);
        
        //Ejer 13 Partiendo del día en el que el langile entró a la empresa, contar los días que ha trabajado hasta hoy.
        //por lo tanto -> fecha actual - fecha comienzo.
        System.out.println("");
        System.out.println("Langile honek, " + egunKopuruaEnpresan(fechaIncorporacion) + " egun dara enpresan lan egiten. \n");
        
        
        /*Ejer 12 - Parte 2 - borrar datos (eliminar un langile) - le pasaremos el id del langile, pero habrá 
        que restarle 1 a ese valor para hacer referencia a la posición que dicho langile 
        ocupa en el arrayList*/
        System.out.print("Zein langile nahi duzu ezabatu? ");
        int eliminarTrabajador = in.nextInt();
        hamarLangile.remove(eliminarTrabajador - 1);
        System.out.println("");
        System.out.println(hamarLangile);
        
    }
    
    public static long egunKopuruaEnpresan(String primerDiaEmpresa) {
        
        LocalDate fechaIncorporacion = LocalDate.parse(primerDiaEmpresa);
        LocalDate fechaActual = LocalDate.now();
        
        long diasEmpresa = ChronoUnit.DAYS.between(fechaIncorporacion, fechaActual);
        //System.out.println(ChronoUnit.DAYS.between(fechaIncorporacion, fechaActual));
        
        return diasEmpresa;
    }

}

/* ALGUNOS EJEMPLOS DE CÓMO OBTENER LA DIFERENCIA ENTRE DOS FECHAS
    LocalDate hoyFecha = LocalDate.now();
    System.out.println(hoyFecha);
    LocalDate pasadoFecha = LocalDate.of(2021, 10, 10);
    System.out.println(pasadoFecha);
        
    System.out.println(Period.between(pasadoFecha, hoyFecha).getDays()); //devuelve la DIFERENCIA de MESES, DÍAS, AÑOS (getMonths(), getDays(), getYears()) que hay entre las dos fechas indicadas.
    System.out.println(ChronoUnit.DAYS.between(pasadoFecha, hoyFecha)); //devuelve la diferencia de la fecha completa, en el formato que le digamos (días, meses, años).
*/



//https://www.it-swarm-es.com/es/java/java-calcula-el-numero-de-dias-entre-dos-fechas/940231380/
//https://jarroba.com/arraylist-en-java-ejemplos/  --> creación y manipulación de arrayList
//https://www.youtube.com/watch?v=VmhcvoenUl0 --> diferencia entre dos fechas