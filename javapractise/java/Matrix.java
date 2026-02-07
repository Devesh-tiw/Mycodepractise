
import java.util.Scanner;

public class Matrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row ,column;
        System.out.println("Enter the value of Row ");
        row=sc.nextInt();
        System.out.println("Enter the value of column ");
        column = sc.nextInt();
        int mat[][]=new int[row][column];
        System.out.println("Enter the Matrix Rows and column:");
        for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){ 
                mat[i][j]=sc.nextInt();
                }
        }
        System.out.println("This is Your Matrix : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}