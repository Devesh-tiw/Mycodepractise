class Earning{
    String name;
int Basic_Salary=250000;
int total_salary;
}
public class  Employee extends Earning{
int DA;
int HRA;
void Employee_detail(String n,int D,int H){
    name =n;
   
    DA=D;
    HRA=H;
    total_salary=Basic_Salary+D+H;
    System.out.println("EMPLOYEE: "+name+" Basic Salary: "+Basic_Salary+" DA: "+ DA +" HRA:"+HRA +" Total Salary:"+total_salary);
}
public static void main(String[]args){
    Employee E1=new Employee();
     Employee E2=new Employee();
      Employee E3=new Employee();
    E1.Employee_detail("Ramesh",25100,65890);
    E2.Employee_detail("Suresh",25100,90000);
    E3.Employee_detail("Langesh",25191,65890);
}
}