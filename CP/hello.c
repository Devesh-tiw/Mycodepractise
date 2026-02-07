#include<stdio.h>
int main(){
    int a,b;
int orpretor;
printf("Enter the value of a and b: \n");
scanf("%d %d",&a,&b);
printf("enter the orpretor,+,-,*,/ \n");
scanf("%d",&orpretor);
switch(orpretor){

case '+':
printf("The addition of the %d + %d is %d \n",a,b,a+b);
break;
case '-':
printf("The addition of the %d + %d is %d \n",a,b,a-b);
break;
case '*':
printf("The addition of the %d + %d is %d \n",a,b,a*b);
break;
case '/':
printf("The addition of the %d + %d is %d \n",a,b,a*b);
break;

default:("if i am telling to yo why you are doing this nonsense ");
return 0;
}
    
}