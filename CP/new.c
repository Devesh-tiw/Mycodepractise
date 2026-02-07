#include <stdio.h>

int main()
{
    // 1. Declare variables
    int arr[100]; // Create an array with a maximum capacity of 100
    int n, j = 0;

    // 2. Get the size of the array from the user
    printf("Enter the number of elements: ");
    scanf("%d", &n);

    // 3. Get the array elements from the user
    printf("Enter %d sorted elements (e.g., 1 1 2 3 3):\n", n);
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    // 4. Logic to remove duplicates
    // We start from the second element (i = 1)
    if (n > 0)
    { // Check to ensure array isn't empty
        for (int i = 1; i < n; i++)
        {
            // If current element is different from the last unique element
            if (arr[i] != arr[j])
            {
                j++;             // Move to the next position
                arr[j] = arr[i]; // Store the unique element
            }
        }
        // Update size (j is the index, so size is j + 1)
        n = j + 1;
    }

    // 5. Print the result
    printf("\nArray after removing duplicates:\n");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
}