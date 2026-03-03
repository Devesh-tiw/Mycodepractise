
#include<stdio.h>
#include<stdlib.h>
int main(){
    int n,*array;
    printf("Enter the number of arrays element ");
scanf("%d",&n);
        array =(int*)malloc(n*sizeof(int ));
    if (array==NULL){
        printf("Memory allocation is not done ");
        return 1;
    }

    printf("Enter the the value of array ");
    for(int i=0;i<n;i++){
        scanf("%d", array + i);
    }
    for (int i = 0; i < n; i++)
        printf("%d",array[i]);
        free(array);//free the allocated memory
    return 0;
}
