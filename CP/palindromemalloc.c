#include<stdio.h>
#include<stdlib.h>
int main(){
    int *arr;
    int n;
    printf("Enter the value of n :");
    scanf("%d",&n);
    arr=(int*)malloc(n*sizeof(int));
    if (arr == NULL)
    {
        printf("Memory allocation failed!\n");
        return 1;
    }
    for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);
    
    for (int i = 0; i < n; i++){ 
        printf("%d ",arr[i]);}
        int new_size;
        printf("\n Enter the value of n_size :");
        scanf("%d", &new_size);
        arr = (int *)realloc(arr, new_size * sizeof(int));
        for (int i = n; i < new_size; i++)
        {
            scanf("%d", &arr[i]);
        }
    for (int i = 0; i < new_size; i++)
    {
        printf("%d,", arr[i]);
    }

        free(arr);
return 0;
}