#include <stdio.h>

int main()
{
    int n,sum;

    printf("Enter the value of number: ");
    scanf("%d", &n);

   for(int i;i<n;i++)
   sum +=i;
    printf("The value of sum of number is %d", sum);

    return 0;
}
