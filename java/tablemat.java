
import java.util.*;

public class tablemat {

    public static void main(String[] args) {
        Scanner fr = new Scanner(System.in);
        int column=2;
        System.out.println("Enter the Size of Row:");
        int row = fr.nextInt();
        String names[][] = new String[10][column];
        System.out.println("Enter the Names :");
        for (int i = 0; i <row; i++) {
            for(int j=0;j<column;j++){ 
            names[i][j] = fr.next();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
            System.out.print(names[i][j]+"   ");
        }
        System.out.println();
        }
    }
}
