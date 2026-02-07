#include <stdio.h>
int main()
{
    int n, value;
    printf("Enter the value of integer ");
    scanf("%d", n);
    for (int i = 2; i <n; i++)
    {
        value = n % i;
        break;
    }

    if (value == 0)
    {
        printf("The number is the not prime number ");
    }
    else
        printf("the number is  prime ");
    return 0;
}
