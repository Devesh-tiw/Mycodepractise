#include<stdio.h>
int main(){
int avg,sum,num,a[10],i;
printf("\n the number of arrays:");
scanf("%d",&num);
sum=0;
printf("\n Enter the Arrays ");
for(i=0;i<num;i++){ 
scanf("%d",&a[i]);
sum=sum+a[i];
}
printf("the sum of numbers are:%d \n",sum);
avg=sum/num;
printf("the average of numbers are:%d",avg);
return 0;
}
// #include<stdio.h> 
// int main() 
// { 
//     int a[10],n,i; 
//     float avg,sum; 
//     printf("\n Enter the array size:"); 
//     scanf("%d",&n); 
//     sum=0.0; 
//     printf("\n Enter the array elements:"); 
//     for(i=0;i<n;i++) 
//      { 
//         scanf("%d",&a[i]); 
//       sum=sum+a[i]; 
//      } 
//    printf("\n Sum=%f",sum); 
//    avg=(float)sum/n; 
//    printf("\n Average=%f",avg); 
//    return 0; 
// }