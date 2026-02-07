
import java.util.*;

public class Matrix2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row, column,ele,pos=0;
        int Mat[][] = new int[100][100];

        System.out.println("Enter the value of row : ");
        row = sc.nextInt();

        System.out.println("Enter the value of column: ");
        column = sc.nextInt();
        
       


        System.out.println("Enter the value of Matrix ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                Mat[i][j] = sc.nextInt();
            }

        }       
        System.out.println("Enter the value element for Searching :");
        ele = sc.nextInt();
       
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(Mat[i][j]==ele){
                    System.out.println("The postion of element " + ele + " is at " + i +" , "+j);
                }
            }
        }
       

        System.out.println("Our New Matrix is :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(Mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
