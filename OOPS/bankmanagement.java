import java.util.Scanner;
public class bankmanagement {
    int accountNumber;
   String accountHolderName;
    double balance;
    bankmanagement(int An,String AccHolderName,double bal){
        accountNumber=An;
     accountHolderName=AccHolderName;
    balance=bal;
    }
    void deposit(double ammount){
        balance+=ammount;
        System.out.println("the Deposited money  is "+ammount);
    }
    
    void withdraw(double ammount) {
        balance -= ammount;
        System.out.println("the withdraw money  is " + ammount);
    }
    void display(){
        System.out.println("Account number"+accountNumber+"Account Holder"+accountHolderName+"balance ="+balance);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of accountnumber");
int an=sc.nextInt();
System.out.println("Enter the value of holder name");
String name=sc.next();
System.out.println("Enter the value of balance");
double bal=sc.nextDouble();
        bankmanagement b1=new bankmanagement(an, name, bal);
        System.out.println("what you want to do : 1)-deposit  2)-withdraw ");
        int a=sc.nextInt();
        if(a==1){
            System.out.println("How much you want to deposit");
            double ammount=sc.nextDouble();
b1.deposit(ammount);
b1.display();
        }
        else if(a==2){
            System.out.println("How much you want to withdraw");
            double ammount = sc.nextDouble();
            b1.withdraw(ammount);
            b1.display();
        }
    }
}
