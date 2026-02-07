#include <stdio.h> 
int main() { 
     int num, digits= 0, originalNum;   
   printf("Input a number: "); 
     scanf("%d", &num);   
    originalNum = num;   
 
    while (num != 0) { 
        digits++;   
        num /= 10;   
    } 
     printf("no of digits in %d is %d",originalNum,digits);   
     return 0;  
}
