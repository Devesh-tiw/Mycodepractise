#include <stdio.h>
#include <math.h>

int main()
{
    int num, temp, originalNum, remainder;
    int sum = 0, n = 0;

    printf("Input a number: ");
    scanf("%d", &num);
    originalNum = num;
    if (num == 0)
    {
        n = 1;
    }
    else
    {
        for (temp = num; temp != 0; temp /= 10)
            n++;
    }

    for (temp = num; temp != 0; temp /= 10)
    {
        remainder = temp % 10;
        sum += pow(remainder, n);
    }
    if (sum == originalNum)
        printf("%d is an Armstrong number.\n", originalNum);
    else
        printf("%d is not an Armstrong number.\n", originalNum);

    return 0;
}
