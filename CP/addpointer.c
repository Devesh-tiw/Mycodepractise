#include<stdio.h>
int add(int*a,int*b)
{
    int c;
  c=*a + *b;
  return c;
}
int main(){
    int a,b;
    printf("Enter the value of a  ");
    scanf("%d",&a);
    printf("Enter the value of b  ");
    scanf("%d",&b);
    int d = add(&a,&b);

    printf("The value of the sumB is %d ",d);
return 0;
}