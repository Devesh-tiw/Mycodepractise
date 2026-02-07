#include<stdio.h>
int main(){
int rows;
printf("enter the interger:");
scanf("%d",&rows);
for(int i=1;i<rows;i++){
       for (int j = 1; j <= rows - i; j++) { 
                    printf(" - "); 
                }
    for(int j=1;j<=i;j++){
        printf("%d",j);
    }
    printf("\n");
     printf("\n");
}

return 0;
} 