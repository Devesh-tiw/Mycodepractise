#include<stdio.h>
int main(){
    int n,sum = 0,i,digits=0,c;
 printf("enter the value of n :");
 scanf("%d",&n);
    for(i=0;i<=n;i++)
{
    sum+=i;}
    printf("%d \n",sum);
 c=sum;
   if (c==0){
    digits=1;
 }
else{
    while (c!=0){
        c=c/10;
        digits++;
    }
    printf("\n \n the number of digits: %d",digits);
}
return 0;  
}