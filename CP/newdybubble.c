#include <stdio.h>
#include <stdlib.h>
int main()
{
    int *arr, n, i, j;
    printf("Enter the alue of n ");
    scanf("%d", &n);
    arr = (int *)malloc(n * sizeof(int));
    if (arr == NULL)
    {
        printf("Memory allocation is failed ");
        return 1;
    }
    printf("Enter the value of array ");
    for (i = 0; i < n ; i++)
        scanf("%d", arr + i);

    for (j = 0; j < n; j++)
    {
        for (i = 0; i < n - 1; i++)
        {
            if (arr[i] > arr[i + 1])
            {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }
    for (i = 0; i < n; i++)
        printf("%d", arr[i]);
}