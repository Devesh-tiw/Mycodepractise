#include<stdio.h>
int increment(int *x, int *y, int *z)
{
   return ++*x,++*y,++*z;   
}
int main(){
int a= 10,b = 12 ,c=25;
printf("Value before increment %d %d %d ",a,b,c);
increment(&a,&b,&c);
printf("Value after increment %d %d %d ",a,b,c);
}

