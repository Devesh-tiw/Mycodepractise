public class constructer {
int l,b,h;
    public constructer() {
        this(5);
        System.out.println("This is first constructer :");
        System.out.println();

    }
    public constructer(int length){
        this(2,5);
     l=length;
     System.out.println("This is second constructer:");
     System.out.println();
    }
       public constructer(int height,int bredth){
    h=height;
    b=bredth;
     System.out.println("This is third constructer:");
     System.out.println();
    }
    int display()
    {
        return l*b*h;
    }
    public static void main(String[]args){
        constructer c1=new constructer();
        System.out.println( c1.display());
    }
}

