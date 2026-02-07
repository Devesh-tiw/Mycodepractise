#include <stdio.h> 
int main() { 
    int a=3;
     int b = 4;
     int c=2;
     int G;
     G = a >>b&& a>>c?a:b>>c?b:c;
     printf("the geratest is %d",G);
     return 0;  
}  
