#include<stdio.h>
int fact(int x)
{
    if(x==0||x==1)
    return 1;
    else
    return x*fact(x-1);
}
int main(){
int n,factorial=1,i;
    printf("enter the value of n ");
    scanf("%d",&n);
    factorial=fact(n);
printf("the factorial is : %d ",factorial);
return 0;
}