
import java.util.Scanner;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class HolaMundo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numCasos;
        numCasos = in.nextInt();
        for (int i = 0; i <= numCasos - 1; ++i) {
            System.out.println("Hola mundo. ");
        }
    }
}
