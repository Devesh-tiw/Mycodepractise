public class strint {
    public static int last = -1;
    public static int first = -1;
    public static void findoccurence(String Oc ,int idx ,char selected){
        
       if(idx==Oc.length()){
        System.out.println(first);
        System.out.println(last);
        return;
       }
       char ele = Oc.charAt(idx);
        if(ele==selected){
           if(first==-1)
           first=idx;
        }
        
            last=idx;
        
        findoccurence(Oc, idx+1, selected);
    }
    public static void main(String[] args) {
        String Oc="aabahuabbnj";
    
        findoccurence(Oc, 0, 'a');
    }
}