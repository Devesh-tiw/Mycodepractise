public class markaverage {
    int markavg(int py,int java,int c){
        return py*java*c;
    }
    public static void main(String[]args){
        markaverage a1=new markaverage();
int calcavg=a1.markavg(50,60,70);
System.out.println(calcavg);
    }
}
