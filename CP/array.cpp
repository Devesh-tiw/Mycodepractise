#include<iostream>
using namespace std;
int main(){
    int n,i ;
    int arr[100];

    cout<<"Enter the number of n is : "<<endl;
    cin>>n;
    cout<<"Enter the element of array:"<<endl;
    for( i=0;i<n;i++)
    cin>>arr[i];
    cout<<"Array element are "<<endl;
   for (i = 0; i < n; i++)
    cout << arr[i] ;
    return 0;

}