// #include<stdio.h>
// int main(){
//     int a[10], num,temp,i,j,reversed;
//     printf("Enter the arrays number");
//     scanf("%d",&num);
//     printf("Enter the arrrays");
//     for(i=0;i<num;i++)
//     scanf("%d",&a[i]);
//     for(i=0,j=num-1;i<j;i++,j--)
//     {
//          temp=a[i]; 
//          a[i]=a[j]; 
//          a[j]=temp; 
// };
// printf("\n The reversed array is:"); 
// for(i=0;i<num;i++) 
// printf("%d\t",a[i]); 
// } 
    
#include<stdio.h> 
int main() 
{ int a[10],n,i,pos,ele; 
 printf("\n Enter the array size:"); 
 scanf("%d",&n); 
 printf("\n Enter the array elements:"); 
 for(i=0;i<n;i++) 
  scanf("%d",&a[i]);
 printf("\n Enter the element to insert:"); 
 scanf("%d",&ele); 
 printf("\n Enter the position:");  
 scanf("%d",&pos); 
 n=n+1;    //step 1 
 for(i=n-1;i>=pos-1;i--)  //step 2 
  a[i]=a[i-1]; 
 a[pos-1]=ele;    //step3 
 printf("\n New Array\n"); 
 for(i=0;i<n;i++) 
  printf("%d\t",a[i]); 
 return 0; 
} 