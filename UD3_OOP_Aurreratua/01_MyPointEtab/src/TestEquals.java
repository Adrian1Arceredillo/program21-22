/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import model.*;

/**
 *
 * @author AdriAlex
 */
public class TestEquals {
    public static void main(String[] args) {
        
        
        //Moodle - Ariketa 3:
        //Sortu TestEquals klasea. Main metodoan kode hau txertatu eta aztertu gertatutakoa:
        MyPoint p1 = new MyPoint(7, 8);
        MyPoint p2 = new MyPoint(7, 8);
        
        if (p1.equals(p2)) {
            System.out.println("Espazioko puntu berdina adierazten dute. ");
        }
        
        /*
        ANTES de crear los métodos equals() y hashcode() con InsertCode:
            Bi puntuak berdinak izan arren, "equals" metodoa String-ak konparatzeko
            balio du; beraz, if-ak daukan print-a ez da agertuko pantailan. 
        
        DESPUÉS de crear los métodos equals() y hashcode() con InsertCode:
            EL programa ejecuta el contenido (un print) del if; ya que se cumple la 
            condición de este; en este caso: p1.equals(p2)
        */
        
    }
}
