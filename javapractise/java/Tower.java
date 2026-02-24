public class Tower{
    public static void TowerofHonoi(int n,String src,String help,String dest){
        if(n==1){
            System.out.println("Transfer"+n+"from"+src+"to"+dest); 
            return;
        }
        TowerofHonoi(n-1,src,dest,help);
        System.out.println("Transfer" + n + "from" + src + "to" + dest);
        TowerofHonoi(n - 1, help,src,dest);
    }
    public static void main(String[]args){
  int n=3;
  TowerofHonoi(n,"S","H","D");
    }
}