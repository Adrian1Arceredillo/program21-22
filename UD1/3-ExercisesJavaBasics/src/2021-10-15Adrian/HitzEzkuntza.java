
import java.util.Arrays;
import java.util.Scanner;

public class HitzEzkuntza {

    public static void main(String[] args) {

        String[] hizkia = {"udazkena"};
        int hizkiaLen = hizkia.length;
        String karakterea = "";
        String[] hutsik = {"________"};
        int pos = 0;
        boolean isValid;
        isValid = false;

        Scanner in = new Scanner(System.in);
        System.out.println("Sartu karaktere bat: ");
        karakterea = in.nextLine();
        in.close();

        for (int i = 0; i <= hizkiaLen - 1; ++i) {
            if (karakterea.equals(hizkia[i])) {
                pos = i;
                isValid = true;
                hutsik[i] = karakterea;
            }
        }

        if (isValid == true) {
            System.out.println(hutsik);
        }

    }

}

