#include <stdio.h>

int main()
{
    int arr[20], n;
    int negative = 0, positive = 0, zero = 0;

    printf("Enter the value of array size:\n");
    scanf("%d", &n);

    printf("Enter the elements of array:\n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    for (int i = 0; i < n; i++)
    {
        if (arr[i] < 0)
        {
            negative++;
        }
        else if (arr[i] > 0)
        {
            positive++;
        }
        else
        {
            zero++;
        }
    }

    printf("Number of Negative elements: %d\n", negative);
    printf("Number of Positive elements: %d\n", positive);
    printf("Number of Zero elements: %d\n", zero);

    return 0;
}
