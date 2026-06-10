class inhertance{
    void run(){
        System.out.println("inhertance is parent");
    }
}
class child extends inhertance{
    void run(){
        System.out.println("inhertance is parent using child ");
    }
    public static void main(String[]args){
inhertance i=new inhertance();
child c=new child();

i.run();
c.run();
    }
}

