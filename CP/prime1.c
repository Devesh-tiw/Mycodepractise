#include<stdio.h>
int main(){
    int n,a,b=1;
    printf("Enter the value of n :");
    scanf("%d",&n);
    for(a=2;a<n;a++){
        if(n%a==0){
            b=0;
            break;
        }

        }
if (b == 0)
        {
            printf("the number is not prime");
        }
    else
     printf("the number is prime");
    return 0;
}