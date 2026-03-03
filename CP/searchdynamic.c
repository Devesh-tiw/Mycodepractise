#include<stdio.h>
#include<stdlib.h>
int main(){
    int n,*arr,find,pos;
    printf("Enter the value of array size  ");
    scanf("%d",&n);
    arr=(int*)malloc(n*sizeof(int));
    if(arr==NULL){
        printf("Memory allocation is failed");
        return 1;

    }
    printf("Enter the Element of Array:");
    for(int i=0;i<n;i++){
        scanf("%d", arr + i);
    }
    printf("Enter the value which you want to find ");
    scanf("%d",&find);
    int flag =0;
    for (int i = 0; i < n; i++)
    {
if(arr[i]==find){
    pos = i ;
    flag=1;
    
}
    }
    
    if(flag==1){
        printf("THe %d is in the array at position %d",find,(pos+1));

        
    }
    else{ 
        printf("Element not found");}
    
free(arr);
return 0;
}