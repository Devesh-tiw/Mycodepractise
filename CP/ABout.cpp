#include <iostream>
using namespace std;


float recivedmoney(int currentmoney, float factor=1.04){

    return currentmoney*factor;
}
int main() {
  
   int a,b,c,d,e,f,g;
     while(1){
    cout<<"you want to see intrest  giving by Banks ."<<endl;
    
     cout<<"1.yes"<<endl<<"2.No"<<endl;
    cin>>f;
    if(f==2)
    return 0;
    
     if(f==1){
    cout<<"1.ICICI Bank= 1  "<<endl<<"2.PNB Bank= 1.5 "<<endl<<"3.SBI Bank= 1.75"<<endl<<"4.HDFC Bank= 2 "<<endl;
    cout<<"Select your bank."<<endl;
    cin>>e;
    cout <<"Enter the value of ammount  "  <<endl;
    cin>>a;
    if(e==1){
        cout<<"if you have ammount " <<a<< " then you get "<<recivedmoney(a)<<" after one year."<<endl;
    }
     else if  (e==2){
        cout<<"if you have ammount " <<a<< " then you get "<<recivedmoney(a,1.5)<<" after one year."<<endl;
    }
    else if (e==3){
        cout<<"if you have ammount " <<a<< " then you get "<<recivedmoney(a,1.75)<<" after one year."<<endl;
    }
    else if (e==4){
        cout<<"if you have ammount " <<a<< " then you get "<<recivedmoney(a,2)<<" after one year."<<endl<<endl;
    
    }
   
     
    cout<<"You want to add more ammount:-"<<endl;
    cout<<"1. yes"<<endl;
    cout<<"2. No"<<endl;
    cin>>b;

   
    if(b==1){
        cout<<"Enter your ammount = "<<endl;  
        cin>>c;
         d = a + c ;
     if  (e==1){ 
        cout<<"if you have ammount " <<d<< " then you get "<<recivedmoney(d)<<" after one year."<<endl;
    }
     else if  (e==2){
        cout<<"if you have ammount " <<d<< " then you get "<<recivedmoney(d,1.5)<<" after one year."<<endl;
    }
    else if (e==3){
        cout<<"if you have ammount " <<d<< " then you get "<<recivedmoney(d,1.75)<<" after one year."<<endl;
    }
    else if (e==4){
        cout<<"if you have ammount " <<d<< " then you get "<<recivedmoney(d,2)<<" after one year."<<endl;
    
    }
    }}
    else if(f==2);
    else if (b==2);
    cout<<"Thanks for coming  "<<endl;
    cout<<"You want to use again this tool"<<endl;
    cout<<"1. yes"<<endl;
    cout<<"2. No"<<endl;
    cin>>g;
if (g==2){
    return 0;
}
}
return 0;
}


