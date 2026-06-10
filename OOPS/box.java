public class box {
    int length,bredth,heigth;
box(){
    length=bredth=heigth=1;

}
box(int l,int b,int h){
    length=l;
    bredth=b;
    heigth=h;

}
int vloume(){
    return length*bredth*heigth;
}
public static void main(String[]args){
    box b1=new box();
    box b2=new box(5,3,8);
    System.out.println(b1.vloume());
    System.out.println(b2.vloume());
}
}
