#include <stdio.h>
int main()
{
    int n, arr[20], rev[20];
    printf("Enter the value of n \n");
    scanf("%d", n);
    printf("Enter the values of arrays ");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
     
    }

    for (int j = 0; j < n; j++)
    {
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == arr[j])
            {
               rev[i]=arr[i];
            }

        }
    }
    for (int i = 0; i < n; i++)
        printf("The Duplicates are ",rev[i]);
        return 0;
}