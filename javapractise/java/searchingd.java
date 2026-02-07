
import java.util.Scanner;

public class searchingd {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row, column,x;
        System.out.println("Enter the value of Row ");
        row = s.nextInt();
        System.out.println("Enter the value of column ");
        column = s.nextInt();
     
        int mat[][] = new int[row][column];
        System.out.println("Enter the Matrix Rows and column:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mat[i][j] = s.nextInt();
            }
        }
        System.out.println("This is Your Matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the element which you want :");
        x = s.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
               if(x==mat[i][j]){
                System.out.println(" X is in the Matrix  {"+i+","+j+"}");
               }
            }
           
        }
        
    }
}
