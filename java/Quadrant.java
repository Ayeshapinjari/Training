import java.util.*;
public class Quadrant {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int a=s.nextInt();
       int b=s.nextInt();
       if(a==0){
        System.out.println("y-axis");
       }
       else if(b==0){
        System.out.println("x-axis");
       }
       if(a>b){
        System.out.println("Quadrant I");
       }
       
       

    }
}
