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
    int rev[new_size];
    for(int i=0;i<new_size;i++){
            rev[new_size-1-i]=arr[i];
    }
    int flag=0;
    for (int i = 0; i < new_size; i++)
    {
        if (rev[i ] != arr[i]){
        flag=1;
        break;
        }
    }
    if (flag == 1)
    {
        printf("this is not palindrome ");
    }
    else
    {
        printf("\n this is  the palindrome");
    }
            free(arr);
        return 0;
    }