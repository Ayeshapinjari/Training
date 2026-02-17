import java.util.*;

public class Fact {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt(); 
       int f=1;
       if(n==0||n==1){
        System.out.println("1");
       }
       else{
        while(n>0){
          f=f*n;
          n--;
        }
       }
       System.out.println(f);
    }
}
