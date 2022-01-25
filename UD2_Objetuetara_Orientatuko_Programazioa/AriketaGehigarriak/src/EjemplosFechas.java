/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;  
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author arceredillo.adrian
 */
public class EjemplosFechas {
    
    public static void main(String[] args) {
        
        //ChronoUnit
        
        LocalDate dBefore = LocalDate.parse("2017-05-06");
        LocalDate dAfter = LocalDate.parse("2018-01-30");

        long diff = ChronoUnit.DAYS.between(dBefore, dAfter);
        System.out.println("difference is : "+diff);
        //-------------------------
        
        //Period y Duration
        LocalDate d1 = LocalDate.parse("2020-05-06", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate d2 = LocalDate.parse("2020-05-30", DateTimeFormatter.ISO_LOCAL_DATE);

        LocalDate d3 = LocalDate.parse("2018-05-06", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate d4 = LocalDate.parse("2020-01-23", DateTimeFormatter.ISO_LOCAL_DATE);

        Duration diferencia = Duration.between(d1.atStartOfDay(), d2.atStartOfDay());
        Period period = Period.between(d3, d4);
        
        long diffDays = diferencia.toDays();
        int years = Math.abs(period.getYears());
        int months = Math.abs(period.getMonths());
        int days = Math.abs(period.getDays());
        System.out.println("Diffrence between dates is : "+diffDays + "days");
        System.out.println("Diffrence is : "+years+" year, "+months+" months, "+days+" days");
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
