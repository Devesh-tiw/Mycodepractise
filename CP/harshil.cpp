#include <iostream>
using namespace std;

// Changed return type from 'void' to 'float'
float receivedMoney(int money, float interestRate)
{
    return money * interestRate;
}

int main()
{
    int money ;
    float interestRate ;
cout<<"Enter the Value of Money ";
cin>>money;
cout<<"Enter the value of Intrest rate";
cin>>interestRate;
    // Storing the result in a new variable
    float finalAmount = receivedMoney(money, interestRate);

    // Printing the result so you can see it
    cout << "Interest calculated: " << finalAmount << endl;
    cout << "This is my revision.";

    return 0;
}