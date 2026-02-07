#include<stdio.h>
int main(){
    int n, calculatore,a,b;
    printf ("enter the value of a and b");    
    scanf("%d %d", &a, &b);
    printf("1)-Addition \n 2)-Subtarction \n 3)-Multipliation \n 4)-Divide");
    scanf("%d", &n);
    switch (n){
 case 1:printf("the adddition of the number is %d %d ",a+b);
 break;
 case 2:
     printf("the adddition of the number is %d %d ", a - b);
     break;
     case 3:
     printf("the multiplication of number is %d %d ",a*b);
     break;

     case 4:
   printf("the multiplication of number is %d %d ",a/b);
   break;
   default:printf("error");

 }
 return 0;
}