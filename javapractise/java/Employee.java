class Earning{
    String name;
int Basic_Salary;
int total_salary;
}
public class  Employee extends Earning{
int DA;
int HRA;
void Employee_detail(String n,int BS,int D,int H){
    name =n;
    Basic_Salary=BS;
    DA=D;
    HRA=H;
   
}
}