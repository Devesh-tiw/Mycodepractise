#include<stdio.h> 
int main() 
{ 
    int a[10],n,i,big,small; 
        printf("\n Enter the array size:"); 
    scanf("%d",&n); 
    printf("\n Enter the array elements:"); 
    for(i=0;i<n;i++) 
    scanf("%d",&a[i]); 
        big=small=a[0]; 
    for(i=1;i<n;i++) 
    { 
         if(a[i]>big) 
           big=a[i]; 
         if(a[i]<small) 
           small=a[i]; 
    } 
    printf("\n Biggest number=%d",big); 
    printf("\n Smallest number=%d",small); 
    return 0; 
}