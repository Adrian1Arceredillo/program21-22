import java.util.Scanner;
public class NPD_aitzol {
    public static void main(String[] args) {
        int size;
        int number;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        size = in.nextInt();
        
        
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col <= size + 1) {
                    number = (size + 2) - col - row;
                    System.out.print(number);
                    
                }else{
                    System.out.print(" ");
                }
            }
            
            System.out.println("");
        }
    }
}
