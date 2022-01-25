
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author arceredillo.adrian
 */
public class Gurutzea {

    public static void main(String[] args) {

        int size;
        Scanner in = new Scanner(System.in);
        System.out.println("Zein neurritako gurutzea marraztu nahi duzu (zenbaki bakoitia sartu)? ");
        size = in.nextInt();

        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col <= size; ++col) {
                if (row == 3 || col == 3) {
                    System.out.print("0 ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }

    }
}
