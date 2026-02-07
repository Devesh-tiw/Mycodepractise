#include <stdio.h>
int sumnatural(int x)
{
    if (x == 0)
        return 0;
    else
        return x + sumnatural(x - 1);
}
int main()
{
    int x, sum;
    printf("Enter the value of x ");
    scanf("%d ",&x);
    sum = sumnatural(x);
    printf("the value of n natural number is %d ", sum);
    return 0;
}
