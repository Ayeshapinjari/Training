class Cooking extends Thread{
            public void run(){
        try{
           System.out.println("order received"); 
        System.out.println("ooking started");
        Thread.sleep(2000);
        System.out.println("Cooking completed");}
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class Billing extends Thread{
    public void run(){
        try{
        System.out.println("Billing started");
        Thread.sleep(2000);
        System.out.println("Billing completed");
        System.out.println("order delivered"); 
    }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
public class Hotel {
    public static void main(String args[])throws InterruptedException{
    Cooking t1=new Cooking();
    Billing t2=new Billing();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        

}
}
