public class carmanagement {
    String modelname;
    int year;
    double price;
    carmanagement(){
modelname="modelname";
year=2000;
price=10000.0;
}
carmanagement(String mn,int y,double p){
   modelname=mn;
    year=y;
    price=p;

}
void display(){
System.out.println("model name="+modelname+"year="+year+"price="+price);
}
   public static void main(String[]args){
carmanagement c1=new carmanagement();
carmanagement c2 = new carmanagement("maruti",2006,600000);
c1.display();
c2.display();
   }
}
