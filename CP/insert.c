#include <stdio.h>
int main()
{  int arr[100],pos, value, n;
    printf("Enter the number of element ");
    scanf("%d", &n);
    printf("Enter the value of array");
    for (int i = 0; i < n; i++)
    scanf("%d",&arr[i]);
    printf("Enter the position ");
    scanf("%d", &pos);
    printf("the new element is : ");
    scanf("%d",&value);
    n=n+1;
    for (int i = n-1; i > pos; i--)
        arr[i] = arr[i - 1];
    arr[pos] = value;
        printf("new array \n");
    for (int i = 0; i < n; i++)
        printf("%d, ", arr[i]);
    return 0;
}