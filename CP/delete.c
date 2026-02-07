#include <stdio.h>
int main()
{   int arr[100], pos, value, n;
    printf("Enter the number of element ");
    scanf("%d", &n);
    printf("Enter the value of array");
    for (int i = 0; i < n; i++)
        scanf("%d", &arr[i]);
    printf("Enter the position ");
    scanf("%d", &pos);
    for(int i=pos-1;i<n;i++)
    arr[i]=arr[i+1];
    n=n-1;
    printf("new array \n");
    for (int i = 0; i < n; i++)
        printf("%d, ", arr[i]);

        
    return 0;
}