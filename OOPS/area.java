public class area{

    int rectanglearea(int lenght,int bredth){
        return lenght * bredth;
    }
    public static void main(String[]args){
      area r1=new area();
int display=r1.rectanglearea(5, 3);
System.out.println(display);
    }
}