/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;
import java.util.Arrays;
import java.util.Formatter;
import model.Date;
/**
 *
 * @author arceredillo.adrian
 */
public class TestDate {
    public static void main(String[] args) {
        
        //testear constructores y método toString()
        Date d1 = new Date(2,9,2021);
        System.out.println(d1.toString());
        
        //testear getters y setters
        d1.setYear(2022);
        d1.setMonth(10);
        d1.setDay(3);
        
        System.out.println(d1.toString());
        System.out.println("Year is: " + d1.getYear());
        System.out.println("Month is: " + d1.getMonth());
        System.out.println("Day is: " + d1.getDay());
        
        //testear el método setDate()
        d1.setDate(2023,1,04);
        System.out.println(d1.toString());
        
        System.out.println("********************************");
        
        //testear el método getHilabeteaLetretan()
        System.out.println(d1.getHilabeteaLetretan());
        System.out.println(d1.getHilabeteaLetretan("EN"));
        
        
    }
}
