
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int *arr, n, i, j;

    printf("Enter the value of n ");
    scanf("%d", &n);

    arr = (int *)calloc(n, sizeof(int));

    if (arr == NULL)
    {
        printf("Memory allocation is failed ");
        return 1;
    }

    printf("Enter the value of array ");
    for (i = 0; i < n; i++)
        scanf("%d", arr + i);

    int newsize;

    printf("Enter the value of newsize: ");
    scanf("%d", &newsize);

    arr = (int *)realloc(arr, newsize * sizeof(int));

    printf("Enter the more %d item ", (newsize - n));

    for (i = n; i < newsize; i++)
    {
        scanf("%d", arr + i);
    }

    for (j = 0; j < newsize; j++)
    {
        for (i = 0; i < newsize - 1; i++)
        {
            if (arr[i] > arr[i + 1])
            {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }

    for (i = 0; i < newsize; i++)
        printf("%d ", arr[i]);

    free(arr);
}