#include<stdio.h>
int main(){
     int n,arr[20],rev[20];
     printf("Enter the value of n \n");
     scanf("%d",n);
     printf("Enter the values of arrays ");
     for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
        rev[n-1-i]=arr[i];
     }
  
  
     for(int i=0;i<n;i++){
        if(rev[i]=arr[i]){
          printf("The array is planindrome ");
         }
         
         else
             printf("The array is not planindrome ");

         break;
    }

return 0;
}