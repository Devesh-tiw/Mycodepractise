#include <stdio.h>
int main()
{ int n, i, sum = 0;
    printf("Input the  number : ");
    scanf("%d", &n);
    printf("The positive divisors  : ");
    for (i = 1; i < n; i++)
    {
        if (n % i == 0)
        {  
             sum += i;
            printf("%d  ", i);
        }
    }
    if (sum == n)
        printf("\nSo, the number is perfect.");
    else
        printf("\nSo, the number is not perfect.");

    return 0;
}