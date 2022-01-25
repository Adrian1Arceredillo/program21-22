/*
Write a program called PrintNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively. Use (a) a "nested-if" statement; (b) a "switch-case-default" statement.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class PrintNumberInWord_nested_if {
    public static void main(String[] args) {
        
        int number = 3;
        
        if (number == 1) {
            System.out.println("ONE");
        } else if (number == 2) {
            System.out.println("TWO");
            
            } else if (number == 3) {
                
                System.out.println("THREE");
                
                } else if (number == 4) {
                    System.out.println("FOUR");
                    
                    } else if (number == 5) {
                        System.out.println("FIVE");
                        
                        } 
        
    }
}
