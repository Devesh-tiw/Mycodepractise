#include<stdio.h>
int main(){
    int A[10][10], B[10][10] ,C[10][10];
    int r1,r2,c1,c2;
    printf("enter the row and column of matrix A");
    scanf("%d %d",&r1,&c1);
    printf("enter the row and column of matrix A");
    scanf("%d %d", &r2, &c2);
    printf("Enter the value of Matrix A ");
    for(int i=0;i<r1;i++)
    for(int j=0;j<c1;j++)
    scanf("%d",&A[i][j]);
    printf("Enter the value of Matrix B ");
    for (int i = 0; i < r2; i++)
     for (int j = 0; j < c2; j++)
    scanf("%d", &B[i][j]);
    for (int i = 0; i < r2; i++)
        for (int j = 0; j < c2; j++)
            C[i][j] = A[i][j] + B[i][j];
    printf("the additiion  of two matrix is :");
     for (int i = 0; i < r2; i++){
      for (int j = 0; j < c2; j++)
          printf("%d ", C[i][j]);

          printf("\n");
     }
          return 0;
}
