/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;
import model.Time;
/**
 *
 * @author arceredillo.adrian
 */
public class TestTime {
    public static void main(String[] args) {
        
        //testear constructores y el método toString()
        Time t1 = new Time(8, 10, 3);
        System.out.println(t1.toString());
        
        Time t2 = new Time("12:01:59");
        System.out.println(t2);
        
        //testear getters y setters
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(65);
        System.out.println(t1.toString());
        System.out.println("Hour is: " + t1.getHour());
        System.out.println("Minute is: " + t1.getMinute());
        System.out.println("Second is: " + t1.getSecond());
        
        //testear el método setTime()
        t1.setTime(4, 52, 59);
        System.out.println(t1.toString());
        
        //testear los métodos nextSecond() y previousSecond()
        System.out.println(t1.toString());
        System.out.println("--------------");
        
        System.out.println(t1.nextSecond().toString());
        System.out.println(t1.previousSecond().toString());
        
        
    }
}
