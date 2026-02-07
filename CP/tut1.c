#include <stdio.h>  
int main() 
{ 
    int n1=0, n2=1,n3,n,i;  
    printf("Input number of terms to display : ");  
    scanf("%d", &n);  
    printf("Here is the Fibonacci series up to %d terms : \n", n);  
 
    printf("% 5d % 5d", n1,n2);  
 
    for(i=3; i<=n; i++)  
      { 
         n3=n1+n2;  
         printf("% d", n3);  
       n1=n2; 
        n2=n3; 
      } 
 
    return 0; 
} 