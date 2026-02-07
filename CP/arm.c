#include<stdio.h>
#include<math.h>
int main(){
    int num,n,sum,temp,remainder;

    printf("enter the value of n ");
    scanf("%d",&n);
    num=sum;
    for(temp=n;temp!=0;temp/=10)
    num++;
    for (temp = n; temp != 0; temp /= 10){

        remainder=temp/10;
        sum+=pow(remainder,num);
    }
    if (sum == n)
        printf("%d is an Armstrong number.\n", sum);
    else
        printf("%d is not an Armstrong number.\n",sum);

    return 0;
}