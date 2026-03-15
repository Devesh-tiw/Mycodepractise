#include <stdio.h>
#include <stdlib.h>
int main()
{
    int i, n, *array;
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    array = (int *)malloc(n * sizeof(int));
    if (array == NULL)
    {
        printf("Memory allocation failed.\n");
        return 1;
    }
    printf("Enter %d elements:\n", n);
    for (int i = 0; i < n; i++)
        scanf("%d", array + i);

    printf("Fully Dynamic Array Elements:\n");
    for (int i = 0; i < n; i++)
        printf("%d ", *(array + i));

    // need to increase the size of an array
    int new_size;
    printf("\nEnter new size");
    scanf("%d", &new_size);
    array = realloc(array, new_size * sizeof(int));
    printf("\nAdd %d new elements:", new_size - n);
   for (i = n; i < new_size; i++)
                                       scanf("%d", array + i);
    printf("\n Aafter realloc and new element added, the entire array elements are\t");
    for (i = 0; i < new_size; i++)
        printf("%d\t", *(array + i));

    free(array); // Free the allocated memory
    return 0;
}