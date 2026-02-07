import java.util.*;
public class matrixserching{
public static void main(String[]args){
    Scanner sc =new Scanner (System.in);
int row,column,ele,pos;
int matrix[][]= new int [20][20];
System.out.println("Enter the value of row and column :");
row = sc.nextInt();
column=sc.nextInt();
System.out.println("Enter the value of Matrix :");
for(int i=0;i<row;i++){
    for(int j=0;j<column;j++){

        matrix[i][j] = sc.nextInt();

    }
}
System.out.print("Enter the ele which you want to find :");

ele=sc.nextInt();

    for (int i = 0; i < row; i++) {
        for (int j = 0; j < column; j++) {

          if(ele==matrix[i][j]){
            System.out.println("The position of element "+ele+ " is at "+ i +","+j);
          }

        }
        System.out.println();
    }





}
}