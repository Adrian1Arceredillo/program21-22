/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class CheckPassFail {
    public static void main(String[] args) {
        
        int mark = 49;       //Try mark = 0, 49, 50, 51, 100 and verify your results.
        System.out.println("The mark is " + mark);
        
        if (mark >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        
        System.out.println("DONE");
        
    }
}
