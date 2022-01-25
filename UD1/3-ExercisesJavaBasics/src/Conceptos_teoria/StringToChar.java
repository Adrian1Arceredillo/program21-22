package Conceptos_teoria;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class StringToChar {

    public static void main(String[] args) {

        String msg = "Hello, world";
        char msgChar;
        for (int idx = 0; idx < msg.length(); ++idx) {
            msgChar = msg.charAt(idx);
            System.out.println("The character " + (idx + 1) + " is: " + msgChar);

        }
        System.out.println();
    }
}
